package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyOnlinePlan {

WebDriver driver;
@FindBy(xpath = "//*[@data-action='online plans']") 
WebElement onlineplans;
	
public 	BuyOnlinePlan(WebDriver driver)
{
	this.driver = driver;
	
}



public void selectPlan()
{
	onlineplans.click();
}

}
