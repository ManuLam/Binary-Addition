import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class RemoveElementGivenArray {		// Remove a Given Element in a Given array. (array.splice(index, 1);)
	static Random ranNum = new Random();
	static Scanner input = new Scanner(System.in);
	static int n = input.nextInt();
	static int g = input.nextInt();
	static int[] array = new int[n];
	static int c = 0;
public static void main(String[]args) {		// Remove array.remove(int);

	for(int i=0; i<=array.length-1; i++) {
		array[i] = ranNum.nextInt();
		System.out.print(array[i]+" ");
	}

	remove(g);

	for(int i=0; i<=array.length-1; i++) {
		System.out.print(array[i]+" ");
	}

    }


    public static void remove(int g) {
    	array = ArrayUtils.remove(array, g);
    }

}