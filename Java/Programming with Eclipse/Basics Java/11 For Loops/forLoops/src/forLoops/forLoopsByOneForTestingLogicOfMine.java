package forLoops;

public class forLoopsByOneForTestingLogicOfMine {

	public static void main(String[] args) {
		
		int counter=0;
		for(counter=0;counter<=10;counter+=3) {
			
		}
		System.out.println(counter);
	}

}


/*The output of the program is 12 because of the following reasons:

Initial Value of counter: You initialize counter with 0.

For Loop Execution:

The loop starts at counter = 0.
The condition counter <= 10 is checked. Since counter is initially 0, this condition is true, so the loop is executed.
In each iteration of the loop, counter is incremented by 3 (counter += 3).
Here's the breakdown of the loop iterations:

First iteration: counter starts at 0, increments by 3, so it becomes 3.
Second iteration: counter is now 3, increments by 3, so it becomes 6.
Third iteration: counter is now 6, increments by 3, so it becomes 9.
Fourth iteration: counter is now 9, increments by 3, so it becomes 12.
Condition check after the loop body:

After the loop increments counter to 12, it checks the loop condition again: counter <= 10.
Since 12 is not less than or equal to 10, the loop terminates.
Final Output: After exiting the loop, the program prints the value of counter, which is 12.

Summary:
The loop increments the value of counter in steps of 3, and it goes from 0 to 12. Since the loop condition checks whether counter <= 10, the last increment that makes counter exceed 10 happens at 12, and that value is printed after the loop terminates. Hence, the output is 12.
*/