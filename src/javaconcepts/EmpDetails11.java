package javaconcepts;

public class EmpDetails11 {
//Global variable/Class Variable and this are all non static variable 
	
String firstName;
char lastInit ;
int age;
String gender;
String emailID;
boolean isAvailable;

	
		public static void main(String[] args) {
			
	EmpDetails11 emp=new EmpDetails11(); // creating obj reference to call non static variable in static methods  
	   emp.firstName ="Naresh";
	   emp.lastInit = 'G';
	   emp.age = 34;
	   emp.gender = "Male";
	   emp.emailID = "abc@yahoo.com";
	   emp.isAvailable=true;
//System.out.println(emp.firstName + " " + emp.lastInit +" "+ emp.age +" "+ emp.gender +" "+ emp.emailID +" "+ emp.isAvailable);	  
	  
EmpDetails11 emp2=new EmpDetails11(); // creating obj reference to call non static variable in static methods  
	   emp2.firstName ="Kumar";
	   emp2.lastInit = 'N';
	   emp2.age = 34;
	   emp2.gender = "Male";
	   emp2.emailID = "abc@yahoo.com";
	   emp2.isAvailable= false; 
	   
	   

	}

}
