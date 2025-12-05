package staticMembers.configuration;

public class Configuration {
	private static String configValue;
	
	static {
		configValue = "Default config value";
		System.out.println("Static block executed : configValue initialized");
	}
	
	public static void main(String[] args) {
		System.out.println("Config Value : " + configValue);
	}
}
