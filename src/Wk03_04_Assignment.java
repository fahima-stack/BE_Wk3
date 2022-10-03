//import java.util.; //* import everything in util. util imports methods from a certain class. 

import java.util.Scanner;
import java.util.ArrayList; //type 'import ArrayList' + press ctrl space to autofill 
import java.util.List; 

public class Wk03_04_Assignment { //open class

	public static void main(String[] args) { //main method
		
System.out.println("Question 1a");
		
		int[] ages = new int[] {3,9,23,64,2,8,28,93};
		
		int subtractLastFirst = (ages[ages.length-1] - ages[0]); 
		
		System.out.println(subtractLastFirst);
		
//		ArrayList<Integer> arr=new ArrayList<>(); //better to use List first as general so can modify later if needed. 
		
System.out.println("Question 1b"); 
		
		List<Integer> arr=new ArrayList<>();
		System.out.println(arr.size()); //Prints 0; currently 0 elements as I haven't imported my static Array into the dynamic Array/Array list.

		for (int i = 0; i < ages.length; i++) {
			arr.add(ages[i]);	
		} //for loop is not a method, it's an iterator 
		arr.add(24);
		 
		System.out.println(arr); // prints [3, 9, 23, 64, 2, 8, 28, 93, 24]
		
System.out.println("Question 1c");

		int sumAge = 0;
		for (int i = 0; i < ages.length; i++) {
			sumAge += ages[i];
		}
		int averageAge = sumAge / ages.length; 
		
		System.out.println(averageAge);
		
		
System.out.println("Question 2a"); 
		
		String[] names = new String[] {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		 
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
			
		System.out.print(nameLengths[i] + " "); //omit ln so numbers are on same line
		}

System.out.println("");
System.out.println("Question 6");

		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println(sum);

		
System.out.println("Question 7-13 Methods");

		System.out.println(words("Hello", 3));

		System.out.println(fullname("Fahima", "Begum"));

		int[] x = new int[] {25,50,75};

		System.out.println("array bigger than 100? " + big100(x));

		double[] array = new double[] {25.3,50.5,75.8};

		System.out.println("array of doubles average? " + avg(array));

		double[] arr2 = new double[] {30.5, 80.4, 100.4};

		System.out.println("array 1 bigger than array 2? " + bigfirst(array, arr2));

		System.out.println("will I buy a drink? " + willBuyDrink(true, 10.6));

		isyournameFahima();

	} //close method
	
	
	 public static String words(String word, int n)
	    {
	        String str = "";

	        for(int i = 0; i < n; i++)
	        {
	            str+=word;
	        }

	        return str; 
	        }
	 
	 
	 public static String fullname(String firstName, String secondName)
	    {
	        String str = "";

	        str = firstName + " " + secondName;

	        return str;
	    }
	 
	 
	 public static boolean big100(int[] arr)
	    {
	        int sum = 0;
	        for(int i = 0; i < arr.length; i++)
	        {
	            sum+=arr[i];
	        }

	        if(sum > 100)
	        {
	            return true;
	        }

	        else 
	        {
	            return false;
	        }
	    }
	 
	 
	 public static double avg(double[] arr)
	    {
	        double sum = 0;
	        for(int i = 0; i < arr.length; i++)
	        {
	            sum+=arr[i];
	        }

	        double avg = sum/arr.length;

	        return avg;
	    }
	 
	 
	 public static boolean bigfirst(double[] arr, double[] arr2)
	    {
	        double sum = 0;
	        double sum2 = 0;

	         for(int i = 0; i < arr.length; i++)
	        {
	            sum+=arr[i];
	        }

	         for(int i = 0; i < arr2.length; i++)
	        {
	            sum2+=arr2[i];
	        }

	         double avg = sum/arr.length;

	         double avg2 = sum2/arr2.length;

	         if(avg > avg2)
	         {
	             return true;
	         }

	         else
	         {
	             return false;
	         }

	    }
	 
	 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	    {
	        if(isHotOutside == true && moneyInPocket > 10.50)
	        {
	            return true;
	        }

	        else
	        {
	            return false;
	        }
	    }
	 
	  public static void isyournameFahima()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("what is your name?");
	        String str = sc.nextLine();
	        if(str.toLowerCase().equals("fahima")) //.toLowerCase() method converts a string to lower case letters. Java String class equals() method compares the two given strings based on the content of the string.
	        {
	            System.out.println("Niiiice you have a cool name");
	        }

	        else
	        {
	            System.out.println("your name isn't Fahima how unfortunate");
	        }

	    }
} //close class
