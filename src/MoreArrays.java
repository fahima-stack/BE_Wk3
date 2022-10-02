
public class MoreArrays { //{open class{open method{method}close method}close class}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] multiplesOf3 = new int [10];
	
	for (int i = 1; i <= multiplesOf3.length; i++) { //started at i=1 because going to assign each element as i*3 
		multiplesOf3[i - 1] = i * 3; // i - 1 is element 0. So element 0 is i*3
		System.out.println("number: " + multiplesOf3[i - 1]); //prints number: 3-30 [elements 1-9]
	} 
	
	int[] multiplesOf5 = new int[10]; 
	
		for (int i = 0; i < multiplesOf5.length; i++) {
		multiplesOf5[i] = (i + 1) * 5; //element [0] = (0+1)*5
		System.out.println(multiplesOf5[i]); //prints 5-50 [elements 0-9]
		}
	
	}

}
