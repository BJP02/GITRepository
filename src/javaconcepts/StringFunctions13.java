package javaconcepts;

public class StringFunctions13 {

	public static void main(String[] args) {
	String str="We are learning Java with Selenium";

	//Length of String
	str.length();
	System.out.println("Length of string"+" "+str.length());
	
	//Value is present in the string
	str.charAt(1);
	System.out.println("Which is the value at given position"+" "+str.charAt(1));
	
	// To find the index of the string
	str.indexOf('g');
	System.out.println("finding a index of character"+" "+str.indexOf('g'));
	System.out.println("finding a index of string"+" "+str.indexOf("Java"));
	System.out.println("finding a index of string"+" "+str.indexOf("Naresh"));
	System.out.println("finding a index of character"+" "+str.indexOf('a'));
	
	//Index of second occurence
	System.out.println("finding a index of second occurence"+" "+str.indexOf('a',str.indexOf('a')+1));
	
//Imp for Interview 
	String msg="Welcome Naresh";
	str.indexOf("Naresh");
	System.out.println("finding a name in message"+" "+msg.indexOf("Naresh"));
	
// same thing with if condition
	if (msg.indexOf("Naresh")>0) {
	System.out.println("Logged in Successfully ");	
	} else {
		System.out.println("Login failed");
	}
//String Compare
	String Fruit1="Apple";
	String Fruit2="apple";
	//if (Fruit1==Fruit2) {// Double equal sign is only for int not for string
	//	System.out.println("pass");		
	//} else {
	//	System.out.println("fail");
	//}
	
	//if(Fruit1.equals(Fruit2)) //here result will fail
	if (Fruit1.equalsIgnoreCase(Fruit2)){
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	
//Trim
	String name="    Naresh Kumar G   ";
	System.out.println(" Side space in name will be trim: "+" "+name.trim());
	
//Replace 
	String n1 ="        Bhumika J Parikh     ";
	System.out.println("Space between the name will be removed :"+" "+n1.replace(" ",""));
	
//Date format mm/dd/yyyy to mm-dd-yyyy
	String dateFormat="12/12/1990";
	System.out.println("Date format changed is" + " "+ dateFormat.replace("/","-"));
	
//Upper case and lower case 	
	
	String n= "naresh";
			System.out.println("Changing lower case to upper case"+" "+n.toUpperCase());
	String n2="BHUMIKA";	
			System.out.println("Changing upper  case to lower case"+" "+n2.toLowerCase());
	
//Sub String
		String message = "Welcome back Nareshkumarg14";
		System.out.println("Substring with Integer :"+ " "+message.substring(13)); 
		System.out.println("Substring with start and end Index :"+ " "+message.substring(0,12));

//Split
		String data ="Naresh:G:35:Male:true";//1
	String splitValue[]=data.split(":");//Single Array return type 
		for(int i=0;i<splitValue.length;i++) {
			System.out.println("Split value of i :"+" "+ splitValue[i]);
		}
	String userDetails= "naresh;test1234"; //2
	String userName=userDetails.split(";")[0];
	String password = userDetails.split(";")[1];
	
	login(userName,password);//calling the above value in main method
	}
 public static void login(String un,String pwd) {
	 System.out.println("UserName entered is :"+" "+ un);
	 System.out.println("Password entered is :"+" "+ pwd);
	 System.out.println("Click on OK button");
 }
}
