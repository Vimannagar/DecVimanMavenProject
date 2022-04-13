package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyOnlinePlan {

	WebDriver driver;
	@FindBy(xpath = "//*[@data-action='online plans']")
	private WebElement onlineplans;

	@FindBy(xpath = "//*[@class='third_navUL third_navUL03']//span[text()='Retirement Plan']")
	private WebElement retirementplans;

	public BuyOnlinePlan(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void selectPlan() {
		Actions act = new Actions(driver);

		act.moveToElement(onlineplans).perform();

		retirementplans.click();
		
		
	}
	
	
	public String getUrl()
	{
		 String url = driver.getCurrentUrl();
		 
		 return url;
	}

}
