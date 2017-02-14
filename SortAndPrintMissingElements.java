public class SortAndPrintMissingElements {
public static void main(String[]args) {
	int[] array = {20,5,15,1,48,41,35,28};
	int n = array.length-1 , temp = 0;

	for(int pass=1; pass<n; pass++) {
	for(int i=0; i<n; i++) {
		if(array[i]>array[i+1]) {
			temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
			}
		}
	}

	//{1,5,10,15,20,25} > 2,3,4 ,6,7,8,9...

	for(int i=0; i<n; i++) {
	for(int j=array[i]+1; j<array[i+1]; j++) {
		System.out.printf("%s ",j);
			}
		}
    }
}