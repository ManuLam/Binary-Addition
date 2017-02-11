import java.util.Scanner;

public class ReturnSumTwoLargest {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	int[] array = {5,1,6,8,3,7,2,10,17,15};	// unsorted array , I'll sort using a Bubblesort or just ArrayList sort
	int first = 0 , last = array.length-1 , temp = 0;

	for(int pass=1; pass<last; pass++) {	// Bubblesort via O(N^2) method
	for(int i=first; i<last; i++) {
		if(array[i]>array[i+1]) {
			temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
				}
			}
		}

	for(int k =0; k<=last; k++) {
	System.out.printf("%s ",array[k]);		// Printing out the sorted array
		}

	System.out.println("\n"+(array[last]+array[last-1]));

    }
}