import java.util.Scanner;


public class normalScanner2 {

	public static void main(String[] args) {
		System.out.println("What Is The Price Of The Item?:");
		Scanner keyboard = new Scanner(System.in);
		double price = keyboard.nextDouble();
		System.out.println("The Price You Enter Is:" + price);

	}

}
