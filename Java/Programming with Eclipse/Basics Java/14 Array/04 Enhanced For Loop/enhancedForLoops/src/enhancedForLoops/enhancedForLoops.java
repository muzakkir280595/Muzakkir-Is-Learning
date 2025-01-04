package enhancedForLoops;

public class enhancedForLoops {

	public static void main(String[] args) {
		int bucky[]= {3,4,5,6,7};
		int total=0;
		
		for(int x: bucky) {
			total+=x;
		}
		
		System.out.println("The total of the number for the array is: " +total);
	}

}
