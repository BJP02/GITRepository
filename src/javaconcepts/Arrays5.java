package javaconcepts;
//Variables : We can store only one variable at a time
//Array variable :We can store more than one variable of same data type
//                Memory is wasted if we are not storing all the values
//				Array is of fixed size(Hashmaps,list,Array list)
//Single Dimension
//Double Dimension
//Object Array
public class Arrays5 {

	public static void main(String[] args) {
//1.Single Dimension
//Syntax:Datatype Variable Name[]=new Datatype[row length]	
		
	/*	int nos[]=new int[3];
			nos[0]=10;
			nos[1]=20;
			nos[2]=30;
			System.out.println(nos[2]); */
		
	/*	int nos[]=new int[20];
	System.out.println("Legth of Array is :"+ nos.length);	
		
		nos[0]=10;
		nos[1]=20;
		nos[2]=30;
		
		for (int i = 0; i < nos.length; i++) {
		System.out.println(i+"-"+nos[1]);	
		}*/
		
//Object Arrays.
	/*	Object userdetails[]=new Object[5];
			userdetails[0]="Naresh";
		    userdetails[1]= 10.5;
		    userdetails[2]= 15;
		    userdetails[3]= true;
		    
	for (int i=0;i<userdetails.length;i++) {
	System.out.println(userdetails[i]);
	} */
		
//Multidimensional /Two dimensional Array
	//String users[][]= new String [2][2];
	/*	users[0][0]= "Naresh";
		users[0][1]= "test1234";
		
		users[1][0]= "kumar";
		users[1][1]= "test1234"; */

		// Dynamic array		

		String users[][]= {{"Naresh","test1234"},{"Kumar","test1234"}};	
		
	for (int i = 0; i < users.length; i++) {
	for (int j=0;j<users.length; j++) {
		System.out.println(users[i][j]);
		
	//	System.out.print(users[i][j]);// this will print side by side


	}
	}
	}	
}
	//System.out.println("Row length is:"+user.length);	
	//System.out.println("Column length is:"+user[0].length);	
		


