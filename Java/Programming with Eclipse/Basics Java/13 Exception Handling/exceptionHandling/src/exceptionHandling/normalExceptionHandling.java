package exceptionHandling;

import java.util.*;

public class normalExceptionHandling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter First Number: ");
			int n1 = input.nextInt();
			System.out.println("Enter Second Number: ");
			int n2 = input.nextInt();
			int sum = n1/n2;
			System.out.println(sum);		
		}
		catch(Exception e){
			System.out.println("MANA ADA ORANG DIVIDE NUMBER BY 0!!!!!");
		}

	}

}
