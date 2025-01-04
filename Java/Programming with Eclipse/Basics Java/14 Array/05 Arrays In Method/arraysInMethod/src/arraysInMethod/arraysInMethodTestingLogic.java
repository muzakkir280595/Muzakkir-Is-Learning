package arraysInMethod;

public class arraysInMethodTestingLogic {

	public static void main(String[] args) {
		int bucky[]= {3,4,5,6,7};
		change (bucky); //This change method is to link the array with other method name change.
		
		for(int y:bucky)
			System.out.println(y);
	}

	public static void change(int x[]) {
		for(int counter=0;counter<x.length;counter++) {
			x[counter]+=5;}
	}
}
