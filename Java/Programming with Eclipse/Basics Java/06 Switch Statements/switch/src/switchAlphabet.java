import java.util.Scanner;

public class switchAlphabet {
	

	//Switch have little bit same function with if else statement, just it is more easy to read and better for performance.
	//break is needed for switch function to avoid it to go to the next switch or test cases.
	//Case expression must be constant expression. Constant expression is something that we not declare like int y=1 then we change case from case 1 to case y.It MUST case 1.
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter your experince working year:");
		String year = keyboard.next();
		
		switch (year) {
		
		case "A":
			System.out.println("Freshman");
			break;
			
		case "B":
			System.out.println("Sophomore");
			break;
			
		case "C":
			System.out.println("Junior");
			break;
			
		case "D":
			System.out.println("Senior");
			break;
			
		case "E":
			System.out.println("Super Senior");
			break;
			
		default:
			System.out.println("Are you CRAZY!!!!You Are More Than SUPER SENIOR!!!!");
		}
	}

}
