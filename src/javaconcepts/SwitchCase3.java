package javaconcepts;

public class SwitchCase3 {

	public static void main(String[] args) {
	
		String color ="Red";
		
		switch (color) {
		case "Red":
			System.out.println("Color is Red");
			break;
		case "Blue":
			System.out.println("Color is Blue");
		case "Yellow":
			System.out.println("Color is Yellow");
		break;
		default:
			System.out.println("No color available");
			break;
		
		}

	}

}
