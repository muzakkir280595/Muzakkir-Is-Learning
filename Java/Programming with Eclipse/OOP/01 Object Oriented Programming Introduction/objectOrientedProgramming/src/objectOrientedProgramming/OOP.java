package objectOrientedProgramming;

public class OOP {

	public static void main(String[] args) {
		User u = new User();  //Taken from other class name User.
		
		u.name = "Alphabet";
		u.membership = "Basic";
		
		System.out.println("Name:"+u.name);
		System.out.println("Membership:"+u.membership);
	}

}
