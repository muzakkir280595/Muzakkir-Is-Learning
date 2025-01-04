package exceptionHandling;

import java.util.*;

public class ExceptionHandlingdoWhileLoopingAlphabet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = "ulang";
		
		do {
		try {
			System.out.println("Enter First Number: ");
			int n1 = input.nextInt();
			System.out.println("Enter Second Number: ");
			int n2 = input.nextInt();
			int sum = n1/n2;
			System.out.println(sum);
			x = "STOP";
		}
		catch(Exception e){
			System.out.println("MANA ADA ORANG DIVIDE NUMBER BY 0!!!!!KO BUAT LAGI SEKALI!!!!!!KO BUAT!!!!");
		}
		}while (x=="ulang");

	}

}
