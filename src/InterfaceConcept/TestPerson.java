package InterfaceConcept;

public class TestPerson  {

	public static void main(String[] args) {
//	AutomationTester at=new AutomationTester();we can not create object reference in interface
	
	AutomationTester at = new SeleniumTesters();//This concept is called (Top casting)	
//	Parentclass obj     = new Childclass	
	 at.manualTester();
	 at.automationTool();
	 at.buildManagement();
System.out.println("Method call from SeleniumTesters");
	 at=new APITester();
	 at.manualTester();
	 at.automationTool();
	 at.buildManagement();
	 
	 System.out.println("Method call from APITester");
	
	/*	SeleniumTesters st = new SeleniumTesters();
	  st.manualTester();
	  st.automationTool();
	  st.buildManagement();
	  
	  
	  APITester ap = new APITester();
	  ap.manualTester();
	  ap.automationTool();
	  ap.buildManagement();*/
		
	}

}
