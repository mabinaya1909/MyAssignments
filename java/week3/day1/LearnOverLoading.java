package week3.day1;

public class LearnOverLoading {
	public void reportStep(String msg,String status) {
		System.out.println(msg+status);

	}
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg+status+snap);

	}
	public static void main(String[] args) {
		LearnOverLoading ol= new LearnOverLoading();
		ol.reportStep("Test", "Leaf");
		ol.reportStep("example", "Program", false);
	}
	

}
