package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flipkartLocators.FlipkartLocators;

public class FlipkartStepdefinition extends FlipkartBaseclass{
	
	/*WebDriver driver;
	FlipkartLocators fl;*/
	
	@Test
	@Given("^invoke browser for Signin$")
	public void invokeforSignUP() throws InterruptedException{
		
		/*System.setProperty(
				"webdriver.chrome.driver",
				"C:\\ejagruti\\mm\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		fl = new FlipkartLocators(driver);
		System.out.println("Browser Opened");
		*/driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		System.out.println("flipkart site opened");

		
	}
	@When("^enter UserFName \"(.*)\"$")
	public void eneterUserFirstName(String UserFirstName){
		fl.ObjUserFirstName.sendKeys(UserFirstName);
	}
	
	@When("^enter UPassword \"([^\"]*)\"$")
	public void enter_UPassword(String UPassword) throws Throwable {
	   fl.ObjPassword.sendKeys(UPassword);
	}

	@Then("^click on SaveButton$")
	public void click_on_SaveButton() throws Throwable {
	    fl.ObjSaveButton.click();
	}

	
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
