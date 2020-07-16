package javaconcepts;
//Constructor
//Constructor name should be same as class name
// Constructor will not have any return types
//We can overload a constructor also

//Methods
//Method name can be anything
//Method will have return types
public class EmpDetailConstructor11 {

	String firstName;
	char lastInit ;
	int age;
	String gender;
	String emailID;
	boolean isAvailable;
	
	
	//Automatic generated constructor without arguments
	//public EmpDetailConstructor11() {
		
		
	//}
//With Arguments (automatic Generated)
	public EmpDetailConstructor11(String firstName, char lastInit, int age, String gender, String emailID,boolean isAvailable) {
		
		this.firstName = firstName;
		this.lastInit = lastInit;
		this.age = age;
		this.gender = gender;
		this.emailID = emailID;
		this.isAvailable = isAvailable;
		
		
	}



	public static void main(String[] args) {
	
		//EmpDetailConstructor11 ec = new EmpDetailConstructor11();
	
		//calling constructor with arguments
	
		
	EmpDetailConstructor11 ec2 = new EmpDetailConstructor11("Naresh", 'G',34, "Male","abc@yahoo.com", true);
		
	System.out.println(ec2.firstName+" "+ec2.lastInit+" "+ec2.age+" "+ec2.gender+" "+ec2.emailID+" "+ec2.isAvailable);
		
	}

	
//Without Arguments
	
	//public EmpDetailConstructor11() {
		//System.out.println("without an Arguments");
		
	//}
// constructor with Arguments
	
//	public EmpDetailConstructor11 (String firstName,char lastInt,int age,String gender,String emailID,boolean isAvailable) {
	// System.out.println(firstName+" "+lastInt+" "+age+" "+gender+" "+emailID+" "+isAvailable);
	

	
	}
	
//}
