package javaconcepts;

public class ObjectAndClass7 {
	String CarName;
	int MakeYear  ;
	String Color;
	double Milage;
	boolean Available ;
	
	public static void main(String[] args) {
	//   classnam      object refrence         Object
		ObjectAndClass7     objref            =new ObjectAndClass7();

		objref.CarName = "Merc";
		objref.MakeYear = 2019 ;
		objref.Color = "White";
		objref.Milage =10.2;
		objref.Available = true;
		
		ObjectAndClass7     objref2            =new ObjectAndClass7();

		objref2.CarName = "Dodge";
		objref2.MakeYear = 2019 ;
		objref2.Color = "Silver";
		objref2.Milage =10.2;
		objref2.Available = true;
		
		
		ObjectAndClass7     objref3           =new ObjectAndClass7();

		objref3.CarName = "Camry";
		objref3.MakeYear = 2008;
		objref3.Color = "Golden";
		objref3.Milage =8.2;
		objref3.Available = false;
		
		objref=objref2;
	System.out.println(objref.CarName);	
		
		objref2=objref3;
	System.out.println(objref2.CarName);	
		
		objref3=objref;
	System.out.println(objref3.CarName);	
	
	
	//System.out.println(objref2.CarName+" "+ objref3.Color);
		
		
		
		
	}

}
