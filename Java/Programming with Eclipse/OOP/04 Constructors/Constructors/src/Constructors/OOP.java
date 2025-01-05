package Constructors;

public class OOP {

	public static void main(String[] args) {
		
		user u = new user("Mojako","Silver");  //Taken from other class name User.  //Link to 	public user(String name, String membership)
		
		System.out.println("Name:"+u.get_name());
		System.out.println("Membership:"+u.get_membership());

	}

}
