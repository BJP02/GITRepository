package javaconcepts;

public class MethodOverloading9 {

	public static void add(int a, int b) //method1
	{
		System.out.println(a+b);
	}
	public static void add (int a, double b) //method2
	{
		System.out.println(a+b);
	}
	public static void add (double a, double b) //method3
	{
		System.out.println(a+b);
	}
	public static void add (int a, int b , int c) //method4
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
		MethodOverloading9 mo=new MethodOverloading9();
	
	mo.add(10,30);
	mo.add(10, 20.05);
	mo.add(30.5,28.5);
	mo.add(10,20,29);
	}

}










