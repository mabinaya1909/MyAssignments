package week3.Assignment;

public class LoginPage extends BasePage{
	public void performCommonTasks() {
		// TODO Auto-generated method stub
		System.out.println("This method is to perform task from Login page class");
	}
	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		BasePage bp=new BasePage();
		bp.performCommonTasks();
	}
}
