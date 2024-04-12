package week3.Assignment;

public class LoginTestData extends TestData{
	 public void enterUsername() {
		System.out.println("this method is to enter username");
	}
	 public void enterPassword() {
		 System.out.println("this method is to enter password");
	}
	 public static void main(String[] args) {
		LoginTestData lo=new LoginTestData();
		lo.enterCredentials();
		lo.enterPassword();
		lo.enterUsername();
		lo.navigateToHomePage();
	}

}
