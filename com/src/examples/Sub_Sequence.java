/* Sub_Sequence.java gives the largest monotonically contagious 
 * subsequence in a sequence and reverses it.
 */
package examples;

import java.util.Arrays;
import java.util.LinkedList;

public class Sub_Sequence {
	
	public static void main(String args[]){
		int[] s = {1,2,3,4,9,1,4,5,6,7,8,9,3,1,2,3,4,5,1};
		int subseq_size_tmp = 0; // This variable store the size of largest subsequence.
		LinkedList<Integer> temp_a = new LinkedList<Integer>(); // Intermediate variable keeping track of all subsequences.
		LinkedList<Integer> subseq = new LinkedList<Integer>(); // Stores largest subsequence.
		System.out.println("Given array is :" + Arrays.toString(s));
			
		for(int i = 0; i < s.length; i++){
		if(temp_a.isEmpty()){
			temp_a.add(s[i]);
			}
		else if(s[i] >= temp_a.getLast()){
			temp_a.clone();
			temp_a.add(s[i]);
			}
		else if(s[i] < temp_a.getLast()){
			if(temp_a.size() > subseq_size_tmp){
		    subseq.clear();
			subseq.addAll(temp_a);
			subseq_size_tmp =temp_a.size();
			}
			temp_a.clear();
			temp_a.clone();
			temp_a.add(s[i]);
    	 	}
		}
		
		System.out.println("The largest subsequence of given array is "+subseq);
		reverse(subseq);			  // Method responsible for reversing the largest subsequence.
		
	}

	private static void reverse(LinkedList<Integer> ss) {
		LinkedList<Integer> reverse_ss = new LinkedList<Integer>();
		int subseq_size = ss.size();  
		      	  for(int j = subseq_size-1; j >= 0; j--){
	        		  reverse_ss.add(ss.get(j));
	        	  }
	        	  System.out.println("Reversing of largest subsequence"+ reverse_ss);
	        }

}
