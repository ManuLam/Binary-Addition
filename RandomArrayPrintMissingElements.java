public class test {	// Print missing elements in this array!
public static void main(String[]args) {
	int[] array = {5,1,9,3,30,20,18};
	int first = 0 , last = array.length-1 , temp = 0;

	for(int pass=1; pass<=last; pass++) {		// Bubblesort using if i>i+1 change places
	for(int i=first; i<last; i++) {
		if(array[i]>array[i+1]) {
			temp = array[i+1];
			array[i+1] = array[i];
			array[i] = temp;
				}
			}
		}

		int start = 0 , fin = array.length-1;

		while(start<fin) {						// Finding difference between i and i+1 and printing within a sorted array
			for(int k=array[start]+1; k<array[start+1]; k++) {
				System.out.printf("%s ",k);
				}
				start++;
			}
    }
}
