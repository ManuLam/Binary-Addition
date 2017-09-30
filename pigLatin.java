import java.util.Scanner;

public class pigLatin {
public static void main(String[]args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = in.next();
    System.out.print(word + " in PigLatin is : " + intoPigLatin(word));
    }

    public static String intoPigLatin(String s) {
        String newWord = "";

		if(Character.toString(s.charAt(0)).matches("[aeiou]||[AEIOU]")) newWord = s + "way";
		else if((Character.toString(s.charAt(0)).matches("[aeiou]||[AEIOU]")) == false && (Character.toString(s.charAt(1)).matches("[aeiou]||[AEIOU]")) == true ) newWord = s.substring(1, s.length()) + s.charAt(0)+ "ay";
		else if((Character.toString(s.charAt(0)).matches("[aeiou]||[AEIOU]")) == false && (Character.toString(s.charAt(1)).matches("[aeiou]||[AEIOU]")) == false ) newWord = s.substring(2, s.length()) +s.substring(0, 3) + "ay";
		else {
        for(int i=0; i<s.length(); i++) {
        if(Character.toString(s.charAt(i)).matches("[aeiou]||[AEIOU]")) {
            newWord = s.substring(i, s.length()) + "-" + s.substring(0,i) + "ay";
            break;
        		}
     		}
		}
        return newWord;
    }

}