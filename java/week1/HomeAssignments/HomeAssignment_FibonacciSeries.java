package week1.HomeAssignments;

public class HomeAssignment_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b = 1,c;
		int range=8;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i <=range; i++) {
			c=b+a;
			System.out.println(c);
			a=b;
			b=c;
			
		}
			
		}

	}


