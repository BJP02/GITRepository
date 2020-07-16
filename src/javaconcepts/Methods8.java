package javaconcepts;
//Functions/Methods= Inbuild Methods (Defined by Java or Selenium people) User Define Method (Define by Us)
//two types of Methods:
//1 Method without Arguments 2 Method with Arguments
//Rules: 1 We cannot create any method in Main Method
//       2.All methods should be create in Class level.
//       3.All method can be called inside main method

public class Methods8 {
//This is Class Level
	
	
	public static void main(String[] args) {
//This is main method level.
//addition();//QA1
//addition();//QA2
multiplicaton(10,20);	//QA1
multiplicaton(5,10); //QA2
	
	}
/**
 * This method can be used for adding 2 numbers (this way you can give description in real time project)
 * Author - Bhumika
 * Date - 14th june2020
 */
//Method without argument (this is used when your values are not changing)
	
	public static void addition() {
		int no1=10;
		int no2=20;
		int result;
		result=no1+no2;
		System.out.println("Addition of 2 numbers is "+ result);
	}
/**
 * This method will do Multiplication	
 * Author -Bhumika
 * Date - 14th june 2020
 */
	
//Method with Argument (this is used when you know your values are changing every time)
	
	public static void multiplicaton(int no1,int no2) {
		int result;
		result=no1*no2;
		System.out.println("Multiplication of 2 number is "+ result);
	}
	
	
	
	
}
