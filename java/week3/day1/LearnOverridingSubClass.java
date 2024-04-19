package week3.day1;

public class LearnOverridingSubClass extends LearnOverRidingSuper {
	
	public void learnOverRidingMethodForBaseClass() {
		System.out.println("This is to print the output from sub class");

	}

	public static void main(String[] args) {
		LearnOverridingSubClass sub = new LearnOverridingSubClass();
		sub.learnOverRidingMethodForBaseClass();
		LearnOverRidingSuper sup = new LearnOverRidingSuper();
		sup.learnOverRidingMethodForBaseClass();
		

	}
	


}
