package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 

{
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumTraining;
	
	public WebElement getSeleniumTraining() {
		return seleniumTraining;
	}

	public WebElement getCartArea() {
		return cartArea;
	}

	@FindBy(id="cartArea")
	private  WebElement cartArea;
	
	@FindBy(xpath="//a[@class='btn btn-social-icon btn-facebook']")
	private WebElement facebookButton;
	
	public void facebookButton()
	{
		facebookButton.click();
	}
	

}
