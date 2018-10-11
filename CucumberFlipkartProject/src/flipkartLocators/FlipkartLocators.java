package flipkartLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLocators {
	WebDriver driver;

	public FlipkartLocators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/parent::label/preceding-sibling::input")
	public WebElement ObjUserFirstName;

	@FindBy(xpath = "//span[contains(text(),'Enter Password')]/parent::label/preceding-sibling::input")
	public WebElement ObjPassword;

	@FindBy(xpath = "//span[contains(text(),'Login')]/parent::button")
	public WebElement ObjSaveButton;

}
