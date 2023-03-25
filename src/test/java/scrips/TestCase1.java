package scrips;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillRaryDemoLoginPage;
import pomPages.SkillRaryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		
		SkillRaryLoginPage s= new SkillRaryLoginPage(driver);
		s.gearsButton();
		s.skilllRaryDemo();
		utilities.switchtabs(driver);
		
		SkillRaryDemoLoginPage sd1= new SkillRaryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd1.getCourseButton());
		sd1.seleniumTraining();
		
		AddToCartPage a1 = new AddToCartPage(driver);
		utilities.doubleClick(driver,a1.getPlus());
		a1.cartButton();
		
		utilities.alertPopUpOk(driver);
	}
	
	

}
