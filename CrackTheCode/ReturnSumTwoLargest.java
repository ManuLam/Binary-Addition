// Given a size of an array by the User, then filled with random numbers.. Find the sum of the two Largest Numbers
import java.util.Scanner;			// Importing a Scanner, so the user can enter a "n" size array
import java.util.Random;			// Random numbers are generated for the entire array
public class ReturnSumTwoLargest {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	Random numGen = new Random();
	int n = input.nextInt();
	int[] array = new int[n];		// The User decides the array size
	int big1 = 0 , big2 = 0;

	for(int i=0; i<=array.length-1; i++) {
		array[i] = numGen.nextInt(100);
		if(array[i]>big2 && array[i]>big1) {		// If current number is bigger than Big2 and Big1, it is stored as Big1
			big1=array[i];
		}
		else if(array[i]>big2 && array[i]<big1) {	// If current number is bigger than Big2 and Smaller Big1, it is stored as Big2
			big2=array[i];
		}
	}

	for(int i=0; i<=array.length-1; i++) {			// Prints out the entire array with random numbers stored
		System.out.print(array[i]+" ");
	}

		System.out.println("\nThe sum of the Two largest numbers = "+(big1+big2));	// Adds the sum of the two largest numbers
	}
}
