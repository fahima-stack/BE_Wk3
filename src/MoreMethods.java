
public class MoreMethods {

	public static void main(String[] args) { //main method
		
		//invoking methods 
		
		int[] myArray = new int[] {7,10,8};  //In order to do something with the instructions/ method, need to call/invoke the method by passing something into it. So by creating an array here.
//	int sum = sumArray(myArray);
//		System.out.println(sum); //Prints 25. can do this in one step below instead of assigning the variable unless you're going to use it somewhere. 
		
		System.out.println(sumArray(myArray)); //if use the value return once, can just print. 
	
//		String[] strings = new String[] {"test"}; 
//		sumArray(strings); //type safety in java. Can't pass a String array into the method signature like if someone writes instructions on how to wash a car and then someone passes a doughnut into it - can't follow the instructions and get the same outcome. Anytime you call the method, it is the value of its return type. 
		
		double[] grades = new double[] {88.7,92.5,100,67.3,78.9};
		
		System.out.println(calculateAverage(grades)); //passing grades array through the calculateAverage method. 
		
		System.out.println(multiplyString("Hello", 3)); //prints HelloHelloHello; go through i=0,1,2 then stops as i<num so prints 3Hello. 
		}
		
	
	 /*
	  * Takes an array of ints and returns the sum of all the ints
	  */
	
	public static int sumArray(int[] numbers) { //Don't know what array is or how many elements are in that array, just know it's an array of ints. No array created, these are just instructions for if an array comes in just like writing instructions for how to wash a car; don't know what car/how many but you follow the instructions as it will work on any car. 
		int sum = 0;
		for (int number : numbers) { //Don't know how many elements in the array so need to iterate over the array. Can use a for loop or enhanced for loop. int number in number so for each number in our numbers array going to add that to sum. 
			sum += number; 
		}
		return sum;
		
	}
		
	//Invoking method calculateAverage 
	
	/*
	 * Takes an array of double and returns the average of all elements in the array
	 */
		
	public static double calculateAverage(double[] numbers) {
		double sum = 0; 
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	/*
	 * Takes a String and an int and returns the String concatenated with itself
	 * int number of times
	 */
	
	public static String multiplyString(String str, int num) { //means if I pass in hello and 3, it's gonna return hellohellohello in one String
	 	String result = "";//Can't use enhanced for loop, don't have an array to iterate over. Have to use a traditional for loop. 
		for (int i = 0; i < num; i++) { 
			result += str;
		}
		return result; 
	}
}
	

 	
