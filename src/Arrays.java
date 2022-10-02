
public class Arrays {

 public static void main(String[] args) {

	 	String studentName1 = "Tom Sawyer"; //Array [] is an object and can have an array of strings, int etc. It's not dynamic, have to declare no.of elements: grouping similar data together e.g. you wouldn't have shopping list items on a different paper, would write each item on a different line of the paper, so the food items are still distinct but belong to that paper.  
	 	String studentName2 = "Jack Smith"; 
	 	String studentName3 = "Bill Turner"; 
	 	
	 	String[] students = new String[3]; //you always use new when you create an object and arrays are objects
	 	
	 	students[0] = studentName1;
		students[1] = studentName2;
		students[2] = studentName3;		
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) { //Printing all elements in an array using a for loop
			System.out.println(students[i]);  //faster way to print out all 3 using for loop  that Sysout each time. Prints all 3 elements in array.
			System.out.println(students[2]);  //prints Bill Turner 3 times (i=2) because the expression iterates 3 times before it reaches i=3 and evaluates to false as it starts at i=0. 
		}
		
		System.out.println("Enhanced for loop: ");
		//enhanced for loop block/scope
		for (String student : students)  { //means for each 'student' (can name anything e.g. x) in (:) students array 
			System.out.println(student);  //for variable 'student' (can name variable anything e.g. x). Prints all elements in array. 
			}
		}

}