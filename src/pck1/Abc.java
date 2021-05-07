package pck1;

public class Abc {
	
	
	
	
	public void universalMethod() {
		
		System.out.println("universalMethod");
	}
	
	public static void classUniversalMethod() {
		System.out.println("classUniversalMethod");

		
	}


	private void classLevelMethod() {
		
		System.out.println(" classLevelMethod");

	}
	
	private static void classStaticLevelMethod() {
		System.out.println(" classStaticLevelMethod");

		
	}
	
    protected void packageLevelAndChildLevelMethod() {
		
		System.out.println("packageLevelAndChildLevelMethod");

	}
	
	protected static void packageLevelClassAndChildLevelMethod() {
		System.out.println("packageLevelClassAndChildLevelMethod");

	}
	
	  
	static void packageLevelMethod() {
		System.out.println("packageLevelMethod");

		
	}
	
	
  
	
}


