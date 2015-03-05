/*In two sorted arrays of integers, this program finds the pair of indices 
*(one into each array) which identify elements which sum to 
*a given integer, if any such pair exists.
*/

package examples;

import java.util.Arrays;
import java.util.Scanner;

public class AddingArray {

	public static void main(String args[])throws Exception{
		int[] a = {1,2,3,4,6,7,9};
	    int[] b = {3,4,5,6,7,8,1};
		int input;
		try{
			
		if(a.length != b.length){
				System.out.println("Two arrays should be of same size");
				System.exit(0);
			}
		    	 
		    System.out.print("Enter an Integer:"); 
			Scanner in = new Scanner(System.in); // Reading user input;
			input = in.nextInt();
			
			
			System.out.println("Given input is:" + input);
			System.out.println("Given arrays are :");
			System.out.println("Array A:" + Arrays.toString(a));
		    System.out.println("Array B:" + Arrays.toString(b));
		    System.out.println("Started to search...");
		    
			AddCompare(a,b,input); // Compares the input value with sum of two elements(one from each) from arrays A and B.
			in.close();
			 
			 }catch(Exception e){
			 System.out.println(e);			 
		 }
		
	}

	private static void AddCompare(int[] a, int[] b, int input) {
		int arraysize =a.length;
		        for (int i =0; i<arraysize; i++){
		        	for(int j=0; j< arraysize; j++){
				       int comp = a[i] + b[j];
				          if(comp == input){
		                  System.out.println("A ["+i+"] + B["+j+ "] =" +input);
		                  }
         	          			     
		              }
		        	
		      }
		      System.out.println("End of search. No more results to show.");

}
}