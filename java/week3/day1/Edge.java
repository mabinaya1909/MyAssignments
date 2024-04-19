package week3.day1;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("Take snap from edge");

	}
	 public void clearCookies() {
		System.out.println("Clear edge cookies");

	}
	 public static void main(String[] args) {
		Edge ed=new Edge();
		ed.openURL();//inherited from Browser class
		ed.closeBrowser();//inherited from Browser class
		ed.navigateBack();//inherited from Browser class
		ed.takeSnap();
		ed.clearCookies();
	}

}
