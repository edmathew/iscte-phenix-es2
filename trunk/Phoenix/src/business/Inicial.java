package business;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import useParser.Parser;
import utilities.MyFilter;

import exceptions.UserCancelException;
import exceptions.UserErrorException;

/***********************************************************
 * Filename: Inicial.java
 * Created:  14 de Mar de 2011
 ***********************************************************/

/***********************************************************
 * @author fba 14 de Mar de 2011
 ***********************************************************/
public abstract class Inicial {

	/***********************************************************
	 * @param args
	 ***********************************************************/
	public static void main(String[] args) {
		initializeLookAndFeel();

		// open(args[0]);
		open("data/PhoenixData.cmd");

		infoState();

		// reset();
		//
		// infoState();

		// list("business.Aluno");
		list("business.AreaCientifica");
		// list("business.CalendarDate");
		// list("business.Curso");
		// list("business.Departamento");
		// list("business.Disciplina");
		// list("business.Inscricao");
		// list("business.Matricula");
		// list("business.Oferta");
		// list("business.Perfil");
		// list("business.Professor");
		// list("business.Seccao");
	}

	/***********************************************************
    * 
    ***********************************************************/
	public static void initializeLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// Guarantees the native look and feel (e.g. Windows, Linux, Mac)
		} catch (Exception e) {
			System.err
					.println("Falling back to the plain Java look and feel ...");
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"Erro de configuração!", JOptionPane.WARNING_MESSAGE);
		}
	}

	/***********************************************************
	 * @param filename
	 ***********************************************************/
	public static void open(String filename) {
		try {

			Parser.parseUSEfile(inicializaFicheiro(filename));

		} catch (UserCancelException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"Programa terminado!", JOptionPane.INFORMATION_MESSAGE);
		} catch (UserErrorException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"Programa terminado!", JOptionPane.ERROR_MESSAGE);
		} catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null,
					"Ficheiro de dados incorrecto ou corrompido!",
					"Programa terminado!", JOptionPane.ERROR_MESSAGE);
		} finally {
//			Icon icon = new ImageIcon("images/Phoenix.jpg");
//			JOptionPane
//					.showMessageDialog(
//							null,
//							"Obrigado por ter escolhido a Phoenix!\nCopyright FBA, 2011",
//							"Phoenix Reborn!", JOptionPane.PLAIN_MESSAGE, icon);
		}
	}

	/***********************************************************
	 * @throws UserCancelException
	 * @throws UserErrorException
	 * @throws IOException
	 * 
	 ***********************************************************/
	public static Scanner inicializaFicheiro(String filename)
			throws UserCancelException, UserErrorException {
		FileReader reader = null;

		do {
			try {
				reader = new FileReader(filename);
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(),
						"Erro de leitura!", JOptionPane.ERROR_MESSAGE);

				System.err.println("Erro na abertura do ficheiro: " + filename);

				// Create a file chooser
				JFileChooser fc = new JFileChooser();

				// Add a custom file filter to select "txt" files only
				fc.setFileFilter(new MyFilter());

				fc.setSelectedFile(new File(filename));
				fc.setCurrentDirectory(new File("data/"));

				switch (fc.showOpenDialog(null)) {
				case JFileChooser.APPROVE_OPTION:
					filename = fc.getSelectedFile().getPath();
					break;

				case JFileChooser.CANCEL_OPTION:
					throw new UserCancelException(
							"Utilizador cancelou abertura de ficheiro!");

				case JFileChooser.ERROR_OPTION:
					throw new UserErrorException(
							"Ocorreu um erro no diálogo de abertura de ficheiro!");
				}
			}
		} while (reader == null);
		return new Scanner(reader);
	}

	/***********************************************************
     * 
     ***********************************************************/
	public static void reset() {
		Aluno.reset();
		AreaCientifica.reset();
		CalendarDate.reset();
		Curso.reset();
		Departamento.reset();
		Disciplina.reset();
		Inscricao.reset();
		Matricula.reset();
		Oferta.reset();
		Perfil.reset();
		Professor.reset();
		Seccao.reset();
	}

	/***********************************************************
    * 
    ***********************************************************/
	public static void infoState() {
		System.out.println("Classe               \t#objectos");
		System.out.println("----------------------------------------");
		System.out.println("Aluno               :\t" + Aluno.objectos().size());
		System.out.println("AreaCientifica  :\t"
				+ AreaCientifica.objectos().size());
		System.out
				.println("CalendarDate  :\t" + CalendarDate.objectos().size());
		System.out.println("Curso               :\t" + Curso.objectos().size());
		System.out.println("Departamento :\t" + Departamento.objectos().size());
		System.out.println("Disciplina         :\t"
				+ Disciplina.objectos().size());
		System.out.println("Inscricao          :\t"
				+ Inscricao.objectos().size());
		System.out.println("Matricula         :\t"
				+ Matricula.objectos().size());
		System.out
				.println("Oferta              :\t" + Oferta.objectos().size());
		System.out.println("Perfil                :\t"
				+ Perfil.objectos().size());
		System.out.println("Professor         :\t"
				+ Professor.objectos().size());
		System.out
				.println("Seccao              :\t" + Seccao.objectos().size());
		System.out.println("----------------------------------------");
	}

	/***********************************************************
	 * @param classname
	 ***********************************************************/
	public static void list(String classname) {
		Class[] methodParm = null;
		Object[] objectParm = null;

		try {
			// get Class from String
			Class theClass = Class.forName(classname);

			// get the constructor with no parameters
			Method method = theClass.getMethod("objectos", methodParm);

			Set<Object> allInstances = (HashSet<Object>) method.invoke(
					theClass, objectParm);

			System.out.println("Classe: " + classname + " (#objectos = "
					+ allInstances.size() + ")");
			System.out
					.println("-----------------------------------------------------------------------------------------------");
			for (Object object : allInstances)
				System.out.println(object);
			System.out
					.println("-----------------------------------------------------------------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
