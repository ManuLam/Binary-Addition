import java.util.Scanner;
public class RemoveAnElementGivenArray {
public static void main(String[]args) {	 // Even easier if I were to use ArrayLists to just remove a number
	Scanner in = new Scanner(System.in);
	int remove = in.nextInt();
	int[] array = {18,1,7,4,21,15,3,28}; // unsorted array , I will sort using a Bubblesort and then apply Binary Search to remove an element
	int start = 0 , fin = array.length-1 , temp = 0;

	for(int pass=1; pass<fin; pass++) {
	for(int i=start; i<fin; i++) {
		if(array[i]>array[i+1]) {
			temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
				}
			}
		}

	int first = 0 , last = array.length-1 , middle = (first+last)/2;

	while(first<=last) {
		if(array[middle]==remove) {
			array[middle] = 0;
			break;
				}
		else if(array[middle]>remove) {
			last = middle-1;
				}
		else {
			first = middle+1;
				}
		middle = (first+last)/2;
			}

	if(first>last) {
		System.out.println("Element not found");
				}
	else {
		for(int i=0; i<=fin; i++) {
			System.out.printf("%s ",array[i]);
		}
	}

	}
}