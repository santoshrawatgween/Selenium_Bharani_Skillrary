package scrips;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.FacebookPage;
import pomPages.SkillRaryDemoLoginPage;
import pomPages.SkillRaryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillRaryLoginPage s1 = new SkillRaryLoginPage(driver);
		s1.gearsButton();
		s1.skilllRaryDemo();
		utilities.switchtabs(driver);
		
	
		
		SkillRaryDemoLoginPage sd1=new SkillRaryDemoLoginPage(driver);
		utilities.dropdown(sd1.getTestingDropDown(),"Testing");
		
		
		TestingPage tp1= new TestingPage(driver);
		utilities.dragAndDrop(driver, tp1.getSeleniumTraining(), tp1.getCartArea());
		tp1.facebookButton();
		
		FacebookPage fb1= new FacebookPage(driver);
		fb1.likes();
		
		
	}

}
