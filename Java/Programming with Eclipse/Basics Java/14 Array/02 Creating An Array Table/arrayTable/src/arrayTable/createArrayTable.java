package arrayTable;

public class createArrayTable {

	public static void main(String[] args) {
		
		System.out.println("Index\tValue");  //This is to create two column of table which name Index and Value
		int bucky[] = {32, 12, 18,54,2};
		
		//variable.length is equal to the length that we have already set.
		
		for(int counter=0;counter<bucky.length;counter++) { 
			System.out.println(counter+ "\t" + bucky[counter]);    //1st counter inside the bracket represent incremental value for counter++ and bucky[counter] will represent value of the array.
		}

	}

}
