import java.util.Scanner;

public class switchNumber {
	
	//Switch have little bit same function with if else statement, just it is more easy to read and better for performance.
	//break is needed for switch function to avoid it to go to the next switch or test cases.
	//Case expression must be constant expression. Constant expression is something that we not declare like int y=1 then we change case from case 1 to case y.It MUST case 1.
	//Last one like else, we have default:   .This was used when there are no case match.

	public static void main(String[] args) {
		int year;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter your experince working year:");
		year = keyboard.nextInt();
		
		switch (year) {
		case 1:
			System.out.println("Freshman");
			break;
			
		case 2:
			System.out.println("Sophomore");
			break;
			
		case 3:
			System.out.println("Junior");
			break;
			
		case 4:
			System.out.println("Senior");
			break; 
			
		case 5:
			System.out.println("Super Senior");
			break;
			
		default:
			System.out.println("Are you CRAZY!!!!You Are More Than SUPER SENIOR!!!!");
		}		
	}

}
