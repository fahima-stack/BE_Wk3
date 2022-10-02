import java.util.*; //* import everything in util. util imports methods from a certain class. methods do stuff.

public class Wk03_04_Assignment { //open class

	public static void main(String[] args) { //main method

//		int[] ages = new int[8]; 
//		
//		ages[0] = 3;
//		ages[1] = 9;
//		ages[2] = 23;
//		ages[3] = 64;
//		ages[4] = 2;
//		ages[5] = 8;
//		ages[6] = 28;
//		ages[7] = 93;
		
		int[] ages = new int[] {3,9,23,64,2,8,28,93};
		
//		ArrayList<Integer> arr=new ArrayList<>();
//		System.out.println(arr.size()); //Prints 0; currently 0 elements as I haven't imported my static Array into the dynamic Array/Array list.
//
//		for (int i=0; i < ages.length; i++) {
//			arr.add(ages[i]);	
//		} //for loop is not a method, it's an iterator 
//		arr.add(24);
//		 System.out.println(arr); // prints [3, 9, 23, 64, 2, 8, 28, 93, 24]
		 
		List<Integer> arr=new ArrayList<>();
		System.out.println(arr.size()); //Prints 0; currently 0 elements as I haven't imported my static Array into the dynamic Array/Array list.

		for (int i = 0; i < ages.length; i++) {
			arr.add(ages[i]);	
		} //for loop is not a method, it's an iterator 
		arr.add(24);
		 
		System.out.println(arr); // prints [3, 9, 23, 64, 2, 8, 28, 93, 24]
		 
		String[] names = new String[] {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
	    System.out.println("Question 2a"); 
		 
		 int sum = 0;
		 for (int i = 0; i < names.length; i++) {
			 sum += names[i].length(); //when you take length of string have to use (), when it's an array you don't, see lines below.  
		 }
		int size = names.length; //gives you the length of the array (no. of elements it has), when it's an array you don't use () 
	    
		String name = "sam"; 
		System.out.println("the length of the name is " + name.length()); //prints the length of the name is 3 - the no. of characters in the string, have to use ()
		int average = sum / size;
		System.out.println(average); 
		
		System.out.println("Question 2b"); 
		
		String concatenate = "";
		
		for (int i = 0; i < names.length; i++) {
			concatenate += names[i]; 
			concatenate += " "; } 
		System.out.println(concatenate);
		
		System.out.println("Question 5");
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			
		System.out.print(nameLengths[i] + " ");
		}
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("");
		System.out.println(sum);
		
	} //close method

} //close class
