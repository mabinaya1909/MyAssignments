package week5.day2;

import org.testng.annotations.Test;

public class LearnTestNGAttributes {
	@Test
	public void createLead() {
		System.out.println("Lead is created successfully");
	}
	@Test(priority = 4,enabled = false)
	public void deleteLead() {
		System.out.println("Lead is deleted successfully");
	}
	@Test(priority = 1, invocationCount = 5, timeOut = 80000) 
		public void EditLead() {
		System.out.println("Lead is edited successfully");
	}
	@Test(priority = 3)
	public void MergeLead() {
		System.out.println("Lead is merged successfully");
	}
	@Test(priority = 2)
	public void printLead() {
		System.out.println("Lead is printed successfully");
	}
	

}
