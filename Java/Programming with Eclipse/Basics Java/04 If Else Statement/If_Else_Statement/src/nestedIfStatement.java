
public class nestedIfStatement {

	//Have one "if" can allow to have many System.out.println();
	//Have "if else" will not allow to have many System.out.println(); for if part but not for else part.
	
	public static void main(String[] args) {
		int age = 589;
		
		if (age < 50) {
			
			System.out.println("You Are Young");
		}
			
		else {
			
			System.out.println("You Are Old");
			
			if(age > 75) {
				
				System.out.println("You Are REALLY REALLY Old");
				System.out.println("GET OUT OF HERE NOW!!!!!");
				
			}
			else {
				
				System.out.println("Don't Worry, You Are Not Really Old");
			}
		}
		
		}	

}
