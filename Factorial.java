import java.util.Scanner; // Speed Code and Timed, I programmed this in exactly 1 minute.
public class Factorial {
public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();

	System.out.println(fac(n));
		}

    public static int fac(int n) {
    	int sum = 1;

    	for(int i=1; i<=n; i++) {
    		sum *= i;

    	}
    	return sum;
    }

}