package business;

/**
 * 
 * @author Ed Mateus
 *
 */
public class ScenarioLoader {

	static{
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
	}
	
	static void loadScenario(String scenario){
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(false);
		Inicial.reset();
		Inicial.open(scenario);
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
	}
}
