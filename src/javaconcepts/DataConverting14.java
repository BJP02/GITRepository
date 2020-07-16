package javaconcepts;

public class DataConverting14 {

	public static void main(String[] args) {
//Example 1 (String + Integer will return string only)
		String str="400";
		System.out.println(str+200);//output 400200
	
//Example 2
		String str1="40.12";
		System.out.println(str1+200);//output 40.12200
		
//Example 3
		double dbl = Double.parseDouble(str1);
		System.out.println(dbl+200);//output 210.12
	
//Example 4
		int i= Integer.parseInt(str);
		System.out.println(i+200);//output 300
		
//Example 5 
		String p="100A";
		System.out.println(p+200);//output 100A200
	//	int k=Integer.parseInt(p);
		//System.out.println(k+200);//output exception

//Example 6
		int n=100;
		System.out.println(n+300);//output400
	
		String m=String.valueOf(n);
		System.out.println(m+200);//output100200
		
		
	
	
	}

}
