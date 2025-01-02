
public class ifOnlyWithOr {

	//Have one "if" can allow to have many System.out.println();
	
	public static void main(String[] args) {
		int age = 67;
		if (age < 10 || age > 65) //This mean if age is less than 10 OR greater than 65, discount will be given.
			System.out.println("You got a discount");
		System.out.println("Thanks For Buying A Ticket");
		System.out.println("You Guys Are The Best");
	}

}
