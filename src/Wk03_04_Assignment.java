import java.util.ArrayList;

public class Wk03_04_Assignment { //open class

	public static void main(String[] args) { //main method

		int[] ages = new int[8]; 
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
//		ArrayList<Integer> arr=new ArrayList<>();
//		System.out.println(arr.size()); //Prints 0; currently 0 elements as I haven't imported my static Array into the dynamic Array/Array list.
//
//		for (int i=0; i < ages.length; i++) {
//			arr.add(ages[i]);	
//		} //for loop is not a method, it's an iterator 
//		arr.add(24);
//		 System.out.println(arr); // prints [3, 9, 23, 64, 2, 8, 28, 93, 24]
		
		
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println(arr.size()); //Prints 0; currently 0 elements as I haven't imported my static Array into the dynamic Array/Array list.

		for (int i=0; i < ages.length; i++) {
			arr.add(ages[i]);	
		} //for loop is not a method, it's an iterator 
		arr.add(24);
		 System.out.println(arr); // prints [3, 9, 23, 64, 2, 8, 28, 93, 24]
		 
	} //close method

} //close class
