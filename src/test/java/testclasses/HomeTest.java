package testclasses;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
	
	@Test(priority = 1)
	public void selectInsuranceType()
	{
		hp.selectInsurance("health");
	}

}
