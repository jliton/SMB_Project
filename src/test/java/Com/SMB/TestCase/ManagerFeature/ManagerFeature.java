package Com.SMB.TestCase.ManagerFeature;

import org.testng.annotations.Test;

import Com.SMB.Base.TestBase;
import Com.SMB.POM.ForAssertionTest;
import Com.SMB.POM.ForClick;

public class ManagerFeature extends TestBase{
	
	@Test(priority=0)
	public  void LaunchingUrl() throws InterruptedException {
		
		log.debug("ManagerLogin TC executing...");
		ForClick.ClickOn("Manager_Login_Button");
     	log.debug("Clicked on manager login button");
		log.debug("Manager log in TC executed successfully....");
		Thread.sleep(5000);
		ForAssertionTest.ForAssertion("addCustBtn_xpath", "addCustBtn_xpath");
		
	}

}
