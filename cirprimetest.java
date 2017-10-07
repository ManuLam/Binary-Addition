public class cirprimetest {
public static void main(String[]args) {
	int i = 419;
	String tempR = "";
	String tempL = "";

	System.out.println(i);

	for(int k = 1; k < String.valueOf(i).length(); k++) {
	tempR += String.valueOf(i).charAt(k);
		}

	tempR += String.valueOf(i).charAt(0);

	tempL += String.valueOf(i).charAt(String.valueOf(i).length()-1);

	for(int k = 0; k < String.valueOf(i).length()-1; k++) {
	tempL += String.valueOf(i).charAt(k);
		}


	System.out.println(tempL);




    }


}