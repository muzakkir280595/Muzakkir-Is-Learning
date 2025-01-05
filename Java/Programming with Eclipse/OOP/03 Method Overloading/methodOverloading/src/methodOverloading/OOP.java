package methodOverloading;

public class OOP {

	public static void main(String[] args) {
		
		user u = new user();  //Taken from other class name User.
		
		u.set_name("Alphabet");
		u.set_membership(user.Membership.Gold);
		
		System.out.println("Name:"+u.get_name());
		System.out.println("Membership:"+u.get_membership());

	}

}
