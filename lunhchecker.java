// Luhn number checker
//123456
/*The Luhn algorithm was developed by German computer scientist Hans Peter Luhn in 1954.
 *It calculates simple checksum formula used to validate identification numbers such as credit card numbers.
 *The algorithm was designed to protect against accidental errors, such as a digit mistyping. It will detect any single-digit error,
 *as well as almost all transpositions of adjacent digits. It will not, however, detect transposition of the two-digit sequence 09 to 90 (or vice versa).
The calculator below gives Luhn checksum of the given digit sequence. The sequence is considered valid if the checksum mod 10 equals to zero.
It also gives the next check digit to be appended at the end of source sequence to form valid number according Luhn algorithm. */

import java.util.Scanner;

public class lunhchecker {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	int len = String.valueOf(x).length();
	int total = 0;
	int counter = 2;


	for(int i=len; i>0; i--) {
		if(counter==2) { total += value(x%10); x/=10; counter=1;}
			else { total += x%10; counter++; x/=10; }
					}

	if(total%10==0) System.out.println(total+" % 10 = "+total%10+" is valid");
		else System.out.println(total+" % 10 = "+total%10+" is not valid");

			}

	public static int value(int a) {
	int temp = 0;
	switch(a) {
		case 1: temp = 2; break;
		case 2: temp = 4; break;
		case 3: temp = 6; break;
		case 4: temp = 8; break;
		case 5: temp = 1; break;
		case 6: temp = 3; break;
		case 7: temp = 5; break;
		case 8: temp = 7; break;
		case 9: temp = 9; break;
		default: break;
		}
		return temp;
	}


}