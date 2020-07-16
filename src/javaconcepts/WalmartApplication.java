package javaconcepts;
//We can overload Static Method
//We can also overload non static Method
public class WalmartApplication {

	
	public static void main(String[]args) {
		
		
	}
	public static void search() {
	System.out.println("without any arguments");	
	}
	
	public void search(String productName) {
		System.out.println("With Product Name");
	}
	 
	public void search(String productName,int price) {
		System.out.println("Product name and price");
	}
	
	
	
}
