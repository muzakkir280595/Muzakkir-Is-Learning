package Constructors;

public class user2 {
	private String _name="test";   //If we put private will avoid it to be used on another class.
	private String _membership="testz";
	public enum Membership {Bronze,Silver,Gold};

	void set_name(String name){
		_name=name;	//Can use also this.name
	}

	String get_name() {						//Don't need any arguments.
		return _name;
	}
	
	void set_membership(String membership){
		_membership=membership;	//Can use also this.membership
	}

	void set_membership(Membership membership){
		_membership=membership.name();
	}

	String get_membership() {						//Don't need any arguments.
		return _membership;
	}
	
	public user2(String name, String membership) {     //Link to user u = new user("Mojako","Silver");
		set_name(name);
		set_membership(membership);
	}

	public user2() {    //Link to user2 u = new user();
	} 

}