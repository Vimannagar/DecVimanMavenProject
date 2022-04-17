package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Health Insurance']")
	private WebElement healthinsurance;

	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Car Insurance']")
	private WebElement carinsurance;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Two Wheeler Insurance']")
	private WebElement twowheelerinsurance;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	public void selectInsurance(String insurancetype)
	{
		if(insurancetype.contains("health"))
		{
			healthinsurance.click();
			
		}
		else if(insurancetype.contains("car"))
		{
			carinsurance.click();
		}
		
		else
		{
			twowheelerinsurance.click();
			
		}
	}
	

	


}
