package javaconcepts;

import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
/*	ArrayList al = new ArrayList();	
	
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	al.add(500);
	al.add(600);
	
	//for (int i = 0; i < 6; i++) {// here it is an hard coded value 6
	System.out.println("Size of ArrayList is:"+al.size());
	
	for (int i = 0; i < al.size(); i++) {//here we wre not mentioning the size of arraylist
			
		System.out.println(al.get(i)); 
			
		}
*/		
	
//RAW Array List (Here you dont mention any data type)
	/*	ArrayList al = new ArrayList();	
		al.add(100);
		al.add("Naresh");
		al.add(19.4);*/
	
//Generic Array List (Here you mention data type and which ever is mention you have
		//follow the same 
		ArrayList <String>ar = new ArrayList<String>();	
		ar.add("Kumar");
		ar.add("Naresh");
		ar.add("Tom");
//This for loop is known as Index based 	
		for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
	}

//This loop is known as Lamda Expression (knew in java 1.8)
		ar.forEach((a)->System.out.println(a));
		
		
//This loop is Known as for each loop
		for (String a : ar) {
		System.out.println(a);	
		}
		
		
//Generic for Integer,double,Character (you have to mention datatype in full forms)
	/*ArrayList<Integer>ai=new ArrayList<Integer>();
	ai.add(10);
	ai.add(12);
	ai.add(13);
	*/
	
	
	
	}

}
