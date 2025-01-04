package forLoops;

public class forLoopsByOneForTestingLogicOfMine2 {

	public static void main(String[] args) {
		
		int counter=0;
		for(counter=0;counter<=10;counter+=3) {
			System.out.println(counter);
		}
		
	}

}


/*
 * The output of your program will be:
 * 
 * Copy code 0 3 6 9 Explanation: In your for loop, you're starting with counter
 * = 0, and on each iteration, you are incrementing counter by 3 (counter += 3).
 * The loop continues as long as the condition counter <= 10 is true.
 * 
 * Here is the detailed breakdown of each iteration:
 * 
 * First iteration:
 * 
 * Initial value: counter = 0 The condition counter <= 10 is checked. Since 0 <=
 * 10, the loop body executes. counter is printed: 0 After the print statement,
 * counter is incremented by 3 (counter += 3), so now counter = 3. Second
 * iteration:
 * 
 * counter = 3 The condition counter <= 10 is checked. Since 3 <= 10, the loop
 * continues. counter is printed: 3 After printing, counter is incremented by 3
 * (counter += 3), so now counter = 6. Third iteration:
 * 
 * counter = 6 The condition counter <= 10 is checked. Since 6 <= 10, the loop
 * continues. counter is printed: 6 After printing, counter is incremented by 3
 * (counter += 3), so now counter = 9. Fourth iteration:
 * 
 * counter = 9 The condition counter <= 10 is checked. Since 9 <= 10, the loop
 * continues. counter is printed: 9 After printing, counter is incremented by 3
 * (counter += 3), so now counter = 12. Condition check after the fourth
 * iteration:
 * 
 * Now counter = 12. The condition counter <= 10 is checked again. Since 12 <=
 * 10 is false, the loop terminates. Why 9 is the last printed number: The last
 * number printed is 9 because the loop runs while counter is less than or equal
 * to 10. The loop increments counter by 3 on each iteration, and when counter
 * reaches 9, it prints 9. After counter becomes 12, the loop stops because the
 * condition counter <= 10 is no longer satisfied. Thus, the sequence of printed
 * numbers is 0, 3, 6, and 9.
 */