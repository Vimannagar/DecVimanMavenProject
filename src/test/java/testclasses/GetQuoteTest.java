package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GetQuoteTest extends BaseTest {
	

 	
	@Test(priority = 3)
	public void titleValidation()
	{
		boolean returnedvalue = gq.verifyTitle();
		
		Assert.assertEquals(returnedvalue, true);
	}
	
	@Test(priority = 4)
	public void submit() throws InterruptedException
	{
		gq.enterData();
		
		gq.submitData();
		
	}

}
