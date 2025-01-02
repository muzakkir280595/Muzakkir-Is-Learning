
public class ifElseWithOneOutputForIf {

	//Have one "if" can allow to have many System.out.println();
	//Have "if else" will not allow to have many System.out.println(); for if part but not for else part.
	
	public static void main(String[] args) {
		int age = 50;
		if (age < 10) //This mean if age is less than 10, discount will be given.
			System.out.println("You got a discount");
		else
			System.out.println("Thanks For Buying A Ticket");
		System.out.println("You Guys Are The Best");
	}

}
