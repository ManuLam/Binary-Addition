import java.util.Scanner;

public class FibRecursion {
public static void main(String[]args) {

	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	System.out.println("The "+n+" term of the Fibonacci series is "+rFib(n));

		}

   public static int rFib(int n) {

   	if(n==1 || n==2) {
   		return 1;
   		}

   	else {
   		return rFib(n-1) + rFib(n-2);
   		}

   }


}