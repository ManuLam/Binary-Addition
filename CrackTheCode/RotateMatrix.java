public class RotateMatrix {
//static	int n = 3;
// static	int[][] array = new int[n][n];
public static void main(String[]args) {

	int num = 1;

 	for(int i=0; i<=n-1; i++) {
 		for(int j=0; j<=n-1; j++) {
 			array[i][j] = num;

 			num++;
 		System.out.print(array[i][j]+" ");
 			}
 		System.out.println();
 		}

//first = last aka  1 goes to 3

		Recursion(n);


 	for(int i=0; i<=n-1; i++) {
 		for(int j=0; j<=n-1; j++) {
			System.out.print(array[i][j]+" ");
 			}
 		System.out.println();
 		}
	}

//		public static int Recursion(int x) {
//		for(int i=0; i<=n-1; i++) {
// 		array[n-x][i] = array[i][n-x];
//		}
//			return Recursion(x-1);
 	}
}

