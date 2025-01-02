import java.util.Scanner;


public class priceDiscount {

	public static void main(String[] args) {
		System.out.println("What Is The Price Of The Item?:");
		Scanner keyboard = new Scanner(System.in);
		double price = keyboard.nextDouble();
		System.out.println("The Price You Enter Is:" + price);
		
		//Price Discount Calculation
		double newPrice = price * 0.7; //30% off is the same as 70% of the original price.
		System.out.println("Price After 30% discount Off Is:" + newPrice);

	}

}
