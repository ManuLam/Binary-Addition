import java.util.Scanner;

public class pigLatinNOLOOPisHARD {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a word");
	String word = in.next().toLowerCase();
	int n=99, a=99, e=99, i=99, o=99, u=99;
	if(word.indexOf("a")>0) a = word.indexOf("a");	if(word.indexOf("e")>0) e = word.indexOf("e");	if(word.indexOf("i")>0) i = word.indexOf("i");	if(word.indexOf("o")>0) o = word.indexOf("o");	if(word.indexOf("u")>0) u = word.indexOf("j");
	n = Math.min( Math.min( Math.min(a, e) , Math.min(i, o) ) , u );
	System.out.print(word + " in PigLatin is : " + word.substring(n, word.length()) + "-" + word.substring(0,n) + "ay");
	}
}