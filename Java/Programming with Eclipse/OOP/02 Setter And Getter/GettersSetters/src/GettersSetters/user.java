package GettersSetters;

public class user {
	String _name;   //If we put private will avoid it to be used on another class.
	String _membership;

	void set_name(String name){
		_name=name;	//Can use also this.name
	}

	String get_name() {						//Don't need any arguments.
		return _name;
	}
	
	void set_membership(String membership){
		_membership=membership;	//Can use also this.membership
	}

	String get_membership() {						//Don't need any arguments.
		return _membership;
	}

}