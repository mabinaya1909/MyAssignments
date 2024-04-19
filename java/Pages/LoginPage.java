package Pages;

import org.openqa.selenium.By;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	 public LoginPage enterUsername() {
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 return this;
	 }
	 public LoginPage enterPassword() {
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 return this;
	 }
	 public WelcomePage clickLoginButton() {
		 driver.findElement(By.className("decorativeSubmit")).click();
		 return new WelcomePage();
	 }

}
