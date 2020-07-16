package InterfaceConcept;

public class SeleniumTesters implements AutomationTester{

@Override
	public void manualTester(){
		System.out.println("Selenium Tester---->Agile Process");
	}
@Override
	public void automationTool() {
		System.out.println("Selenium Tester---->Eclipse");
	}
@Override
    public void buildManagement() {
		System.out.println("Selenium Tester----> SVN");
	}
	
	
}
