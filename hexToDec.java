import java.util.Scanner;

public class hexToDec {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	String hex = in.nextLine();
	String val = "0123456789ABCDEF";
	int dec = 0 , count = 0;

	hex = hex.toUpperCase();

	for(int i=hex.length()-1; i>=0; i--) {
		dec += (int)Math.pow(16,count)*val.indexOf(hex.charAt(i));
			count++;
			}

			System.out.print(hex+" To Decimal is: "+dec);

    }
}