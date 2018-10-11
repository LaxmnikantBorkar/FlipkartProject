package stepdefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class FlipkartHookups extends FlipkartBaseclass {
	
	@Test
	@Before()
	public void openBrowser() {

		System.setProperty(
				"Webdriver.chrome.driver",
				"C:\\ejagruti\\mm\\DRIVERS\\chromedriver_from_32 and 64 bit_worked for version_v64-66.exe");
			
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println("BrowserOpened");
		
	}
	@After()
	public void intilize1() {
		//driver.close();
		System.out.println("driver close for clean up");
	}
}
