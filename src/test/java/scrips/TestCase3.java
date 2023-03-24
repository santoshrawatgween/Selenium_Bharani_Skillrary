package scrips;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillRaryLoginPage;
import pomPages.Twitter;

public class TestCase3 extends BaseClass
{

	@Test
	public void tc3() throws FileNotFoundException, IOException
	{
		SkillRaryLoginPage s1=new SkillRaryLoginPage(driver);
		s1.searchTestBox(pdata.getData("courseName"));
		s1.goButtton();		
		
		CoursePage cp1= new CoursePage(driver);
		cp1.corejavaForSeleneium();
		
		Twitter t1 = new Twitter(driver);
		t1.twitter();
		
	}
}
