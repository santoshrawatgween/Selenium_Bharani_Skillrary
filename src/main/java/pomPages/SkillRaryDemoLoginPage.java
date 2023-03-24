package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SkillRaryDemoLoginPage
{
	public SkillRaryDemoLoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
		
	@FindBy(id="course")
	private WebElement courseButton;
	
	public WebElement getCourseButton() 
	{
		return courseButton;
	}


	public WebElement getSeleniumTraining() {
		return seleniumTraining;
	}

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumTraining;
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement testingDropDown;
	
	
	
	public WebElement getTestingDropDown() {
		return testingDropDown;
	}


	public void seleniumTraining()
	{
		seleniumTraining.click();
	}

}
