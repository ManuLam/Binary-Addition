//Remove dupe characters in a String
// example: altaration -> altrion
import java.util.Scanner;
public class removeDupeCharacters {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();

	System.out.println(removeDupeChar(s));
	}

	public static String removeDupeChar(String s) {
		char[] cAry = s.toCharArray();
		String k = new String(Character.toString(s.charAt(0)));

		for(int i=1; i<s.length(); i++) {
			boolean t = true;
			for(int j=0; j<i; j++) {
				if(s.charAt(i)==cAry[j]) t = false;
			}

			if(t==true) k += s.charAt(i);
		}

		return k;
	}

}

/* //Remove dupe characters in a String // SCRAP
// example: altaration -> altrion
import java.util.Scanner;
public class dupeInStrings {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	System.out.println(removeDupeChar(s));
	}

	public static String removeDupeChar(String s) {
		char[] cAry = s.toCharArray();

		for(int i=1; i<s.length(); i++) {
			for(int j=0; j<i; j++) {
			if(s.charAt(i)==cAry[j]) {
					s.replace(Character.toString(s.charAt(i),""));
				}
			}
		}

		return s;
	} */

//}