package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage
{
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsButton;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skilllRaryDemo;
	
	@FindBy(name="q")
	private WebElement searchTestBox;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement goButtton;
	
	public SkillRaryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton()
	{
		gearsButton.click();
	}
	
	public void skilllRaryDemo()
	{
		skilllRaryDemo.click();
	}
	public void searchTestBox(String name)
	{
		searchTestBox.sendKeys(name);
	}
	public void goButtton()
	{
		goButtton.click();
	}
	

}
