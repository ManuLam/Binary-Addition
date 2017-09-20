public class ContainDupe {
public static void main(String[]args) {
	int[] array = new int[6] {1,2,4,5,6,1};

	for(int i=0; i<=6; i++) {
		contain(5);

	}


	int	contain(int n) {
		if(n==0) {
		return true;
		}


	else {
		return contain(n-1)
		}
	}



    }
}