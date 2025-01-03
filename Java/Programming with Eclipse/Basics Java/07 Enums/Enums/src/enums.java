
public class enums {
	
//If want to use enum, the enum expression must be used before public static void main(String[] args) or easy to say need to added at the top of the class after the class name.

	enum Rating {G, PG, PG13, R, MA, X};
	
	public static void main(String[] args) {
		
		Rating myMovie = Rating.G;
		
		switch(myMovie) {
		
		case G:
			System.out.println("This movie is suitable for kids to watch");
			break;
			
		case PG:
			System.out.println("This movie is suitable for kids to watch, BUT, Need to have parent to monitor them");
			break;
		
		}
		
		

	}

}
