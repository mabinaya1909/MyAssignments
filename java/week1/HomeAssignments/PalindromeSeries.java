package week1.HomeAssignments;

public class PalindromeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=541;
		int output=0;
		System.out.println("Check "+input+" is a Palindrome number");
		/*To reverse a number*/
		for(int i=input;i>0;i=i/10) {
			int remainder=i%10;
			output=output*10+remainder;
		}
		if (input==output) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		

	}

}
