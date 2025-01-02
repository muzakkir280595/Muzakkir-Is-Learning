
public class ifElseWithMultipleOutputForIf {

	//Have one "if" can allow to have many System.out.println();
	//Have "if else" will not allow to have many System.out.println(); for if part but not for else part.
	
	public static void main(String[] args) {
		int age = 67;
		if (age < 10 || age > 65) { //This mean if age is less than 10 OR age greater than 65 , discount will be given.
			System.out.println("You got a discount");
			System.out.println("Appreciate and said thank you NOW!!!!");
		}
		else
			System.out.println("Thanks For Buying A Ticket");
		System.out.println("You Guys Are The Best");
	}

}
