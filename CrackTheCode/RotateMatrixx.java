// Rotate a Matrix... Clockwise and by 90 Degrees.
public class RotateMatrix {
public static void main(String[]args) {	/* 1 2 3  >	7 4 1
										   4 5 6  > 8 5 2
										   7 8 9  > 7 8 9	CLOCKWISE 90 Degrees	*/
	int n = 10;
	int[][] array = new int[n][n];
	int[][] array2 = new int[n][n];
	int num = 1;

 	for(int i=0; i<=n-1; i++) {
 		for(int j=0; j<=n-1; j++) {
 			array[i][j] = num;
 			num++;
 		System.out.print(array[i][j]+" ");
 			}
 		System.out.println();
 		}

		System.out.println();

	//	First(0)= Last(n-1)	 ............ array2[i][j] =	array[(n-(j+1)][i]

		for(int i=0; i<=n-1; i++) {
		for(int j=0; j<=n-1; j++) {
			array2[i][j] = array[n-(j+1)][i];
			}
		}

 	for(int i=0; i<=n-1; i++) {
 		for(int j=0; j<=n-1; j++) {
			System.out.print(array2[i][j]+" ");
 			}
 			System.out.println();
 		}

	}
}

