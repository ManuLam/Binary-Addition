public class AllMissingElementsInArray {
public static void main(String[]args) {
	int[] array = {1,5,7,10,15,20};
	int start = 0 , last = array.length-1;

	while(start<last) {
		for(int k=array[start]+1; k<=array[start+1]-1; k++) {
		System.out.printf("%s ",k);
		}
		start++;

		}
	}
}