package InterfaceConcept;

//This is modified in GitHub.

//This is modified from Eclipse.

public class APITester implements AutomationTester{

	@Override
	public void manualTester() {
		System.out.println("API Tester---->Waterfall Process"); 
		
	}

	@Override
	public void automationTool() {
		
		System.out.println("API Tester----> Postman,Restassured,Parasoft"); 
		
	}

	@Override
	public void buildManagement() {
		
		System.out.println("API Tester----> GitHub"); 
		
	}

}
