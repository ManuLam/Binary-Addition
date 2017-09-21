//Rotating an array so that the highest value in the sorted array is located in the center,

public class spiral {
public static void main(String[]args) {
	int size = 10;
    int[][] array = new int[size][size]; // Left to right, then up to down, down to up, left to right repeat
    int count = 1;

	int c1 = 0 , c2 = size-1 , r1 = 0 , r2= size-1;		//different varibles to change the positions

	while(count<=size*size) {				//when the array elements aren't all placed, run it

    for(int i=c1; i<=c2; i++) {
    array[r1][i] = count++;
      }
    for(int j=r1+1; j<=r2; j++) {
    array[j][c2] = count++;
      }
    for(int i=c2-1; i>=c1; i--) {
    array[r2][i] = count++;
      }
    for(int j=r2-1; j>=r1+1; j--) {
    array[j][c1] = count++;
      }
      c1++;
      c2--;
      r1++;
      r2--;
	}

	int	top = 1, end = size-2 , left = 0 , right = size-1;






	for(int i=0; i<size; i++) {				//displaying array
		for(int j=0; j<size; j++) {
			System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}


    }
}