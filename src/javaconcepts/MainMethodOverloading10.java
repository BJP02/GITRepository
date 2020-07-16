	package javaconcepts;
// Can we overload Main Method ---YES we can 
// We can call one method in another main method
	
public class MainMethodOverloading10 {

	public static void main(String[] args) {
	 main(10);
	 main("Naresh","test1234");
	 	
	}

	public static void main (int no) {
	System.out.println(no);	
	main("Kumar", "test1234");//calling one main method in other main method.
	
	}
	
	public static void main (String username,String password) {
		System.out.println(username+" " +password);
	}
}
