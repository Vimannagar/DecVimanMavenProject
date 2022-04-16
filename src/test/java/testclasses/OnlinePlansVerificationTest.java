package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinePlansVerificationTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void buyOnlinePlan()
	{
		buyonline.selectPlan();
	}
	
	
	@Test(priority = 2)
	public void verifyURL()
	{
		String actualurl = buyonline.getUrl();
		
		String expectedurldata = "retirement";
		
		boolean ispresent = actualurl.contains(expectedurldata);
		
		
		Assert.assertTrue(ispresent);
		
		Assert.fail("Deliberately failing the test case");
		
		
	}
	

}
