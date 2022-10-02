
public class Methods {

	public static void main(String[] args) { //main method
		// creating method
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName	= createFullName(firstName, lastName); 
		String fullName2 = createFullName("Sam", lastName);		
		
		System.out.println(fullName); //prints Bob Ross
		System.out.println(fullName2); //Prints Sam Ross

	}

	public static String createFullName(String x, String y) { //new method outside main and in class
		String fullName = x + " " + y;
		return fullName; 
		
	} 
} 



