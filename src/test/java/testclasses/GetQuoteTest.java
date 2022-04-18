package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class GetQuoteTest extends Listeners {
	

 	
	@Test(priority = 3)
	public void titleValidation()
	{
		test.info("Verfying the title");
		boolean returnedvalue = gq.verifyTitle();
		
		Assert.assertEquals(returnedvalue, false);
		test.info("Title has been verified");
		
	}
	
	@Test(priority = 4)
	public void submit() throws InterruptedException
	{
		test.info("Entering the data to the form");
		gq.enterData();
		test.info("Data has been entered");
		
		gq.submitData();
		test.info("Data has been submitted");
	}

}
