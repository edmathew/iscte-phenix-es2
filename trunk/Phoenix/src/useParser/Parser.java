package useParser;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.*;

import business.*;

/***********************************************************
 * @author fba 16 de Mar de 2011
 * 
 ***********************************************************/
public class Parser {
	private static int n_lines, n_creates, n_associatives, n_destroys,
			n_inserts, n_deletes, n_sets, n_openters, n_opexits, n_comments,
			n_objects, n_links, n_assigns;

	private static Hashtable objects = new Hashtable();

	/***********************************************************
	 * @param in
	 ***********************************************************/
	public static void parseUSEfile(Scanner in) {
		while (in.hasNext()) {
			String command = in.nextLine().trim();
			n_lines++;
			if (!command.isEmpty())
				parseCommand(command.trim());
		}
		// parsingStatistics();
	}

	/***********************************************************
    * 
    ***********************************************************/
	public static void parsingStatistics() {
		System.out.println("Parsing statistics:");
		System.out.println("\tLines: " + n_lines);

		System.out.println("\tCreates (normal, associative): " + n_creates
				+ " (" + (n_creates - n_associatives) + ", " + n_associatives
				+ ") >= " + n_objects + " actual objects");
		System.out.println("\tDestroys: " + n_destroys);

		System.out.println("\tAssociations (normal, associative): "
				+ (n_inserts + n_associatives) + " (" + n_inserts + ", "
				+ n_associatives + ")");

		System.out.println("\tInserts (normal, associative): "
				+ (n_inserts + n_associatives * 2) + " (" + n_inserts + ", "
				+ n_associatives * 2 + ") >= " + n_links + " actual links!");
		System.out.println("\tDeletes: " + n_deletes);

		System.out.println("\tSets: " + n_sets + " >= " + n_assigns
				+ " actual assigns!");

		System.out.println("\tOpenters: " + n_openters);
		System.out.println("\tOpexits: " + n_opexits);
	}

	/***********************************************************
	 * @param theCommand
	 ***********************************************************/
	private static void parseCommand(String theCommand) {
		switch (theCommand.charAt(0)) {
		case '!':
			parseExecuteCommand(theCommand.substring(1).trim());
			break;
		case '?':
			parseQueryCommand(theCommand.substring(1).trim());
			break;
		case '-': // comment lines
			if (theCommand.charAt(1) == '-')
				break;
		default:
			// System.out.println("Not parsed: " + theCommand);
		}
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseQueryCommand(String command) {
		System.out.println("Query command: " + command);
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseExecuteCommand(String command) {
		String[] fields = command.split(" ");
		// System.out.println("Execute command: " + fields[0]);
		if (fields[0].equals("create"))
			parseCreate(command.substring(7).trim());
		else if (fields[0].equals("destroy"))
			parseDestroy(command.substring(8).trim());
		else if (fields[0].equals("insert"))
			parseInsert(command.substring(7).trim());
		else if (fields[0].equals("delete"))
			parseDelete(command.substring(7).trim());
		else if (fields[0].equals("set"))
			parseSet(command.substring(4).trim());
		else if (fields[0].equals("openter"))
			parseOpenter(command.substring(8).trim());
		else if (fields[0].equals("opexit"))
			parseOpexit(command.substring(7).trim());
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseCreate(String command) {
		n_creates++;
		String[] fields = command.split(":");
		String objectId = fields[0].trim();
		String[] fields2 = fields[1].trim().split("between");
		String classId = fields2[0].trim();
		// System.out.println("CREATE " + objectId + " : " + classId + ";");

		createObject(objectId, "business." + classId);

		// Now let's process the associative classes
		if (fields[1].contains("between")) {
			n_associatives++;
			String[] fields3 = fields2[1].trim()
					.substring(1, fields2[1].trim().length() - 1).split(",");

			insertLinkReflexive(objectId, fields3[0].trim());
			insertLinkReflexive(objectId, fields3[1].trim());
		}

	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseDestroy(String command) {
		n_destroys++;
	}

	/***********************************************************
	 * @param command
	 * @throws IllegalAccessException
	 ***********************************************************/
	private static void parseInsert(String command) {
		n_inserts++;
		String objectPair = command.substring(command.indexOf('(') + 1,
				command.indexOf(')'));
		String[] fields = objectPair.trim().split(",");
		String associationName = command
				.substring(command.lastIndexOf(' ') + 1);

		insertLinkCustomized(fields[0].trim(), fields[1].trim(),
				associationName);
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseDelete(String command) {
		n_deletes++;
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseSet(String command) {
		// System.out.println("parseSet(" +command + ")");
		n_sets++;

		String[] fields = command.split(":=");
		String identifier = fields[0].trim();
		// System.out.println("identifier(" +identifier + ")");

		String objectId = identifier.substring(0, identifier.indexOf('.'));
		String fieldId = identifier.substring(identifier.indexOf('.') + 1);

		String value = fields[1].trim();
		if (value.charAt(0) == '\'')
			value = value.substring(1, value.length() - 1);

		setObjectAttribute(objectId, fieldId, value);
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseOpenter(String command) {
		n_openters++;
	}

	/***********************************************************
	 * @param command
	 ***********************************************************/
	private static void parseOpexit(String command) {
		n_opexits++;
	}

	/***********************************************************
	 * @param objectId
	 * @param classId
	 ***********************************************************/
	private static void createObject(String objectId, String classId) {
		Class[] classParm = null;
		Object[] objectParm = null;

		try {
			// get Class from String
			Class theClass = Class.forName(classId);

			// get the constructor with no parameters
			Constructor constructor = theClass.getConstructor(classParm);

			// create an instance
			Object instance = constructor.newInstance(objectParm);

			// stores objectId and Object itself in the Hash Table for posterior
			// lookup (when inserting links)
			objects.put(objectId, instance);
			n_objects++;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***********************************************************
	 * @param objectId1
	 * @param objectId2
	 * @param associationId
	 ***********************************************************/
	private static void insertLinkCustomized(String objectId1,
			String objectId2, String associationId) {
		List<String> associations = Arrays.asList("Curso_CCientifica",
				"Curso_Coordenacao", "Curso_Erasmus", "Curso_Perfil",
				"Departamento_Seccao", "Disciplina_AreaCientifica",
				"Disciplina_Disciplina", "Professor_Docencia",
				"Professor_Regencia", "Professor_Seccao");

		Object o1 = objects.get(objectId1);
		Object o2 = objects.get(objectId2);

		n_links++;
		switch (associations.indexOf(associationId)) {
		case 0: // Curso_CCientifica
			((Curso) o1).addComissaoCientifica((Professor) o2);
			break;

		case 1: // Curso_Coordenacao
			((Curso) o1).setCoordenador((Professor) o2);
			break;

		case 2: // Curso_Erasmus
			((Curso) o1).setCoordenadorErasmus((Professor) o2);
			break;

		case 3: // Curso_Perfil
			((Perfil) o2).setCurso((Curso) o1);
			break;

		case 4: // Departamento_Seccao
			((Seccao) o2).setDepartamento((Departamento) o1);
			break;

		case 5: // Disciplina_AreaCientifica
			((Disciplina) o1).setAreaCientifica((AreaCientifica) o2);
			break;

		case 6: // Disciplina_Disciplina
			((Disciplina) o2).addPrecedentes((Disciplina) o1);
			break;

		case 7: // Professor_Docencia
			((Disciplina) o2).addEquipaDocente((Professor) o1);
			break;

		case 8: // Professor_Regencia
			((Disciplina) o2).setRegente((Professor) o1);
			break;

		case 9: // Professor_Seccao
			((Professor) o1).setSeccao((Seccao) o2);
			break;

		default:
			n_links--;
			System.out
					.println("ERROR(insertLinkCustomized): unkown association!");
		}
	}

	/***********************************************************
	 * @param objectId1
	 * @param objectId2
	 ***********************************************************/
	private static void insertLinkReflexive(String objectId1, String objectId2) {
		Object o1 = objects.get(objectId1);
		Object o2 = objects.get(objectId2);

		int linksOfClass2 = 0;
		Method method = null;
		if (o1 != null && o2 != null) {
			for (Method m : o1.getClass().getDeclaredMethods()) {
				if (m.getParameterTypes().length == 1
						&& m.getParameterTypes()[0].equals(o2.getClass())) {
					linksOfClass2++;
					method = m;
				}
			}

			if (linksOfClass2 == 1)
				try {
					method.invoke(o1, o2);
					n_links++;
				} catch (InvocationTargetException e) {
					System.out.println("ERROR (InvocationTargetException) :"
							+ method.getName() + "("
							+ method.getParameterTypes()[0] + ") == "
							+ o2.getClass());
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					System.out.println("ERROR (IllegalAccessException) :"
							+ method.getName() + "("
							+ method.getParameterTypes()[0] + ") == "
							+ o2.getClass());
					e.printStackTrace();
				}
			else if (linksOfClass2 > 1)
				System.out.println("DUPLICATE TYPE (" + linksOfClass2 + "): "
						+ objectId1 + " -> " + objectId2);
		} else
			System.out.println("ERROR (insertLinkReflexive): " + objectId1
					+ " -> " + objectId2);
	}

	/***********************************************************
	 * @param objectId
	 * @param fieldId
	 * @param value
	 ***********************************************************/
	private static void setObjectAttribute(String objectId, String fieldId,
			String value) {
		Object object = objects.get(objectId);

		int linksOfClass2 = 0;
		Method method = null;

		if (object != null) {
			for (Method m : object.getClass().getMethods()) {
				if (m.getParameterTypes().length == 1
						&& m.getName().toLowerCase()
								.equals("set".concat(fieldId.toLowerCase()))) {
					linksOfClass2++;
					method = m;
				}
			}

			Class parameterType = method.getParameterTypes()[0];

			if (linksOfClass2 == 1)
				try {
					if (parameterType.getSimpleName().equals("String"))
						method.invoke(object, value);
					else if (parameterType.getSimpleName().equals("int"))
						method.invoke(object, Integer.parseInt(value));
					else if (parameterType.getSimpleName().equals("double"))
						method.invoke(object, Double.parseDouble(value));
					else if (parameterType.getSimpleName().equals("Boolean"))
						method.invoke(object, Boolean.parseBoolean(value));
					else if (parameterType.isEnum())
						method.invoke(object,
								Enum.valueOf(parameterType, value.substring(1)));
					else
						method.invoke(object, objects.get(value));

					n_assigns++;
				} catch (InvocationTargetException e) {
					System.out.println("setObjectAttribute(" + objectId + ", "
							+ fieldId + ": " + parameterType.getSimpleName()
							+ " = " + value + ")");
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					System.out.println("setObjectAttribute(" + objectId + ", "
							+ fieldId + ": " + parameterType.getSimpleName()
							+ " = " + value + ")");
					e.printStackTrace();
				}
			else
				System.out
						.println("ERROR (setObjectAttribute) : Setter of field "
								+ fieldId
								+ " not found in class "
								+ object.getClass().getSimpleName());
		} else
			System.out.println("ERROR (setObjectAttribute) : " + objectId
					+ " object is unknown!");
	}

}
