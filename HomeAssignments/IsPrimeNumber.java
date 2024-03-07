package week1.HomeAssignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=31;
		boolean prime=true;
		for (int i = 2; i<input;i++) {
			if (input%i ==0) {
				prime = false;
				break;
			}
			
		}
		System.out.println(prime);

	}

}
