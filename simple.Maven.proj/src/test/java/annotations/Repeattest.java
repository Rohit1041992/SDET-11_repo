package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Repeattest {
	
	@Test(priority=1)
	public void createOrg()
	{
		Reporter.log("createOrg",true);
	}
	@Test(priority=2,enabled=false)
	public void deleteOrg()
	{
		Reporter.log("deleteOrg",true);
	}
	@Test(priority=1)
	public void editOrg()
	{
		Reporter.log("editOrg",true);
	}

}
