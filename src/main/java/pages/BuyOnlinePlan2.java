package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BuyOnlinePlan2 {

WebDriver driver;



public BuyOnlinePlan2(WebDriver driver)
{
	this.driver = driver;
	
}



public void selectPlan()
{
	WebElement onlineplans = driver.findElement(By.xpath("//*[@data-action='online plans']"));

	Actions act = new Actions(driver);
	
	act.moveToElement(onlineplans).perform();

}

}
