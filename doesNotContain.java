import java.util.Scanner;

public class doesNotContain {

    public String whatsMissing(String s) {
        String a = "abcdefghijklmnopqrstuvwxyz";

        int k = s.length();

        for(int i = 0; i < k; i++) {
        a = a.replace(Character.toString(s.charAt(i)), "");
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tst a = new tst();

        System.out.println("Test Case:");
        String s = sc.nextLine();
        System.out.println("Does not contain: " + a.whatsMissing(s));
    }

}