import java.util.Scanner;
public class RecursivePathingTriangle {
public static int max = 0;
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	int[][] a = new int[15][15];
	int x = 0, r = 0;
	int i = 0;

		while(i < 15) {
			for(i = 0; i <= x; i++) {		// 0 >>> 14
				a[r][i] = in.nextInt();
			}
			r++;
			x++;
		}

		for(int k = 0; k < 15; k++) {
			for(int j = 0; j < 15; j++) {
				System.out.print(a[k][j]+ " ");
			}
			System.out.println();
		}

	rec(a, 0, 0, 0);
	System.out.print(max);

    }

	public static int rec(int[][] a, int r, int c, int sum) {
		if(r > a.length-1) {
			return 0;
		}

			sum += a[r][c];
			if(sum > max) max = sum;
		return rec(a, r+1, c, sum) & rec(a, r+1, c+1, sum);
	}

}

//75
//95 64
//17 47 82
//18 35 87 10
//20 04 82 47 65
//19 01 23 75 03 34
//88 02 77 73 07 63 67
//99 65 04 28 06 16 70 92
//41 41 26 56 83 40 80 70 33
//41 48 72 33 47 32 37 16 94 29
//53 71 44 65 25 43 91 52 97 51 14
//70 11 33 28 77 73 17 78 39 68 17 57
//91 71 52 38 17 14 91 43 58 50 27 29 48
//63 66 04 68 89 53 67 30 73 16 69 87 40 31
//04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
//Answer = 1074 , This program finds the maximum value possible from top to bottom of triangle by doing so recursively	
