package week3.day1;

public class Safari extends Browser {
		public void readerMode() {
			System.out.println("Safari is in reader mode");

		}
		 public void fullScreenMode() {
			System.out.println("Safari is in full screen mode");

		}
		 public static void main(String[] args) {
				Safari sa=new Safari();
				sa.openURL();//inherited from Browser class
				sa.closeBrowser();//inherited from Browser class
				sa.navigateBack();//inherited from Browser class
				sa.readerMode();
				sa.fullScreenMode();
			}

}
