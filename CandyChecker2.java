// Version 1.1
import java.util.*;
public class CandyChecker2 {
public static void main(String[]args) {

	Scanner input = new Scanner(System.in);
	int h = 3;	//input.nextInt();
	int w = 5;	//input.nextInt();
	int b = 6;	//input.nextInt();
	int t = b+h;
	int m = 2;
	int highscore = 0;
	String sen =  "366426321533554"; //"111117123511512"; //"614426321533554"; "261465323245156";
	int[][] array = new int[t][w];
	int p = 0;

	for(int i=0; i<h; i++) {
	for(int j=0; j<w; j++) {
		array[i][j] = Character.getNumericValue(sen.charAt(p));
		System.out.print(array[i][j]);
		p++;
		}
		System.out.println();
	}
	System.out.println();

	// Now to implement a check system
	// This is to check VERTICALLY (No Gap)

	int count1 = 0;
	int space1 = 0;
	int temp1 = 0;

	for(int i=0; i<w; i++) {
		count1 = 0;
		temp1 = array[0][i];
	for(int j=0; j<h; j++ ) {

		if(temp1==array[j][i]) {
			count1++;
		}

		else if(temp1!=array[j][i]) {
		count1=1;
		temp1 = array[j][i];
		}

		if(count1==2) {	//fix...
			System.out.println("A combo of "+array[j][i]+" (2 ina row) in Column "+(i+1));
			}
		if(count1==3) {
			highscore += Math.pow(count1,2);
			}
		if(count1==4) {
			highscore += Math.pow(count1,2);
			}
		if(count1==5) {
			highscore += Math.pow(count1,2);
			}
		}
	}

	// This is to check HORIZONTALLY (No Gap)

	int count2 = 0;
	int space2 = 0;
	int temp2 = 0;

	for(int i=0; i<h; i++) {
		count2 = 0;
		temp2 = array[i][0];
	for(int j=0; j<w; j++ ) {

		if(temp2==array[i][j]) {
			count2++;
		}

		else if(temp2!=array[i][j]) {
		count2=1;
		temp2 = array[i][j];
		}

		if(count2==2) {	//fix, for highscore + for combo possibility
			if(temp2==array[i][j])
			System.out.println("A combo of "+array[i][j]+" (2 ina row) in Row "+(i+1));

			if(i!=(h-h)&&i!=(h-1)&&(j-2)==(w-w)) {		// hard confusing code >.<
				if(temp2==array[i-1][j-2] || temp2==array[i+1][j-2]) {	// Checking for left side of combo above and bottom (Not first or last row)
					System.out.println("A POSSIBLE SOLUTION for element '"+temp2+"'Left side NOT TOP NOT BOTTOM");
				}
			}
			else if(i==(h-h)&&(j-2)==(w-w)) {
				if(temp2==array[i+1][j-2]) {
					System.out.println("A POSSIBLE SOLUTION for element '"+temp2+"' on Left side TOP ROW");
				}
			}






			}
		else if(count2==3) {
			highscore += Math.pow(count2,2);
			}
		else if(count2==4) {
			highscore += Math.pow(count2,2);
			}
		else if(count2==5) {
			highscore += Math.pow(count2,2);
			}
		}
	}

//--------------------------------------------------------------------------------------------------------------------------

		// PHYICALLY CHECKING FOR APPROVED COMBOS VERTICALLY (With Gap)

	for(int i=0; i<(h-2); i++) {
	for(int j=0; j<w; j++) {
		if(array[i][j]==array[i+2][j]) {
			if(j!=(w-1) && j!=(w-w)) {
				if(array[i][j]==array[i+1][j+1] || array[i][j]==array[i+1][j-1]) {
					System.out.println("A POSSIBLE SOLUTION for element '"+array[i][j]+"' (2 with a space gap) in Column "+(j+1));
						}
					}
			else if(j==(w-w)) {
				if(array[i][j]==array[i+1][j+1]) {
					System.out.println("A POSSIBLE SOLUTION for element '"+array[i][j]+"' (2 with a space gap) in Column "+(j+1));
						}
					}
			else if(j==(w-1)) {
				if(array[i][j]==array[i+1][j-1]) {
					System.out.println("A POSSIBLE SOLUTION for element '"+array[i][j]+"' (2 with a space gap) in Column "+(j+1));
					}
				}
			}
		}
	}

	System.out.println();
	// PHYICALLY CHECKING FOR APPROVED COMBOS HORIZONTALLY (With Gap)

	for(int i=0; i<h; i++) {
	for(int j=0; j<(w-2); j++) {
		if(array[i][j]==array[i][j+2]) {
			if(i!=(h-1) && i!=(h-h)) {
				if(array[i][j]==array[i+1][j+1] || array[i][j]==array[i-1][j+1]) {
					System.out.println("A POSSIBLE SOLUTION for element '"+array[i][j]+"' (2 with a space gap) in Row "+(i+1));
				}
			}
			else if(i==(h-h)) {
				if(array[i][j]==array[i+1][j+1]) {
					System.out.println("A POSSIBLE SOLUTION for element '"+array[i][j]+"' (2 with a space gap) in Row "+(i+1));
				}
			}
			else if(i==(h-1)) {
				if(array[i][j]==array[i-1][j+1]) {
			System.out.println("A POSSIBLE SOLUTION for element '"+array[i][j]+"' (2 with a space gap) in Row "+(i+1));
						}
					}
				}
			}
		}

	System.out.println(highscore);  // Total Highscore Possible


	}
}