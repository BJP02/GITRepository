package javaconcepts;
//Definition----Data hiding/Hide my logic/Implementation
// Applicable on variable levels and Method level



public class Encapsulation12 {

	public String name;
	public int empID;
	public int age;
	public String dept;
	private int salary;// hiding class variable salary by saying private

//Created Constructor	
	public Encapsulation12(String name, int empID, int age, String dept, int salary) {
		
		this.name = name;
		this.empID = empID;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
//Creating a Methods
	
	public void getEmployeeName() {
		System.out.println("Get Employee Name");
		getEmployeeBonus();
	}
	
	public void getEmployeeBonus() {
		System.out.println("Employee Bonus");
	}
//Getters and Setters method	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) { //passed argument in Method
		this.salary=salary;
	}
	
	
//Now I will call this methods in main method
	
	public static void main(String[] args) {
	
		Encapsulation12 ec=new Encapsulation12("Naresh", 1234, 36, "QA", 1000); //object reference with arguments
		System.out.println(ec.name);
		System.out.println(ec.age);
		
		ec.getEmployeeName();
		ec.getEmployeeBonus();
		
		
			
		
		
		
		
	}
	
	
		

	

}
