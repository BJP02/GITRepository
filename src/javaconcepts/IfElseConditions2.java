package javaconcepts;

public class IfElseConditions2 {

	public static void main(String[] args) {
		if(10==10){
		System.out.println("Value is Equal");
		}else {
		System.out.println("Value is not matching");	
		}
		if (20==10) {
		System.out.println("Values are  Matching");	
		} else {
		System.out.println("Values are not Matching");
		}	
		int n1 = 10;
		int n2 = 20;
		if (n1==n2){
		System.out.println("True");
		} else {
		System.out.println("False");
	
//Nested if else conditions
// Manual:Fatima,Automation:Naresh,Marketing:Tom,Resume:Marry,Others:Reema	
		
	String need="Automation";	
	 if (need=="Marketing") {
		 System.out.println("Tom");
	 }else if(need=="Manual") {
		 System.out.println("Fatima");
	 }else if (need=="Automation") {
		 System.out.println("Naresh");
	 }else if (need=="Resume") {
		 System.out.println("Marry");
	 }else {
		 System.out.println("Reema");
	 }
		
		
		
		
		
		
		
		
		
		
		}
	}

}
