package week1.HomeAssignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=99;
		int count=0;
		for (int i = 2; i < input; i++) {
			if (input%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not a prime Number");
		}
		
		}
		
}