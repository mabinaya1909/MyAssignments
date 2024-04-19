package week3.day1;

public class Chrome extends Browser {
	 public void openIncognito() {
		System.out.println("Chrome is launched in Incognito mode");

	}
	 public void clearCache() {
		System.out.println("Cache Cleared");

	}
	 public static void main(String[] args) {
		Chrome ch = new Chrome();
		ch.openURL();//inherited from Browser class
		ch.closeBrowser();//inherited from Browser class
		ch.navigateBack();//inherited from Browser class
		ch.openIncognito();
		ch.clearCache();
	}

}
