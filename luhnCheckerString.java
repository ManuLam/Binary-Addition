// Luhn number checker
//123456
/*The Luhn algorithm was developed by German computer scientist Hans Peter Luhn in 1954.
 *It calculates simple checksum formula used to validate identification numbers such as credit card numbers.
 *The algorithm was designed to protect against accidental errors, such as a digit mistyping. It will detect any single-digit error,
 *as well as almost all transpositions of adjacent digits. It will not, however, detect transposition of the two-digit sequence 09 to 90 (or vice versa).
The calculator below gives Luhn checksum of the given digit sequence. The sequence is considered valid if the checksum mod 10 equals to zero.
It also gives the next check digit to be appended at the end of source sequence to form valid number according Luhn algorithm. */
//371449635398431 proves valid
import java.util.Scanner;

public class luhnCheckerString {
public static void main(String[]args) {
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	int count = 0 , sum = 0;

    	for(int i = s.length()-1; i >= 0; i--) {
    		if(count%2!=0 && count != 0) {
    			sum += value(Character.getNumericValue(s.charAt(i)));
    		}
	 	    else if(count%2==0) {
    		sum += Character.getNumericValue(s.charAt(i));
			}
    		count++;
    	}

	if(sum%10==0) System.out.println(sum+" % 10 = "+sum%10+" is valid");
		else System.out.println(sum+" % 10 = "+sum%10+" is not valid");

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
