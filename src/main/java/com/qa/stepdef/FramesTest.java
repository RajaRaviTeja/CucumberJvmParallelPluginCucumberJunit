package com.qa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 
import io.cucumber.java.en.When;


public class FramesTest  extends BaseTest{

	BaseTest baseTest;
	WebDriver driverr;
	public FramesTest(BaseTest baseTest){
		this.baseTest=baseTest;
		this.driver=baseTest.driver;
	}
	By image=By.xpath("//img[@id='enterimg']");
	By switchTo=By.linkText("SwitchTo");
	By switchToMenu = By.xpath("//li[@class='dropdown']/a[contains(text(),'SwitchTo')]/following-sibling::ul[@class='dropdown-menu']");
	By alertLink = By.xpath("//li[@class='dropdown']/a[contains(text(),'SwitchTo')]/following-sibling::ul[@class='dropdown-menu']/li//a[contains(text(),'Frames')]");
	By singleFrame = By.id("singleframe");
	
		@When("User switch to Frame page")
		public void user_switch_to_Frame_page() {
 
			driver.switchTo().frame(baseTest.getWebElement(singleFrame));
			
		}

	
}
