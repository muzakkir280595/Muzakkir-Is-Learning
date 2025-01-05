package toString;

public class user {
	private String _name;   //If we put private will avoid it to be used on another class.
	private String _membership = "Bronze";
	public enum Membership {Bronze,Silver,Gold};

	public user(String name, String membership) {
		set_name(name);
		set_membership(membership);
	}

	public user() {
		
	}

	public String toString() {
		return get_name() + " " + get_membership();
	}

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

}