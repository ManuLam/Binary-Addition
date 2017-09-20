// Rotate a Matrix... Anti-Clockwise and by 90 Degrees.
public class AntiRotateMatrix {
public static void main(String[]args) {	/* 1 2 3  >	3 6 9
										   4 5 6  > 2 5 8
										   7 8 9  > 1 4 7	ANTI-CLOCKWISE 90 Degrees	*/
	int n = 10;
	int[][] array = new int[n][n];
	int[][] array2 = new int[n][n];
	int num = 1;

 	for(int i=0; i<=n-1; i++) {
 		for(int j=0; j<=n-1; j++) {
 			array[i][j] = num;
 			num++;
 		System.out.print(array[i][j]+" ");				// Storing an array with numbers starting from 1 .. 2.. 3..
 			}
 		System.out.println();
 		}

		System.out.println();

	//	First Row(j) First Column(i) = First Row(i) Last Column(n-(j+1)  ..... array2[j][i] = array[i](n-(j+1))

		for(int i=0; i<=n-1; i++) {
		for(int j=0; j<=n-1; j++) {
			array2[j][i] = array[i][n-(j+1)];			// Storing into a second array with it being rotated.
			}
		}


 	for(int i=0; i<=n-1; i++) {
 		for(int j=0; j<=n-1; j++) {
			System.out.print(array2[i][j]+" ");			// Prints out the entire rotated array
 			}
 			System.out.println();
 		}

	}
}