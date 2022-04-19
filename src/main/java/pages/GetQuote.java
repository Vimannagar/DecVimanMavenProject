package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetQuote extends BaseClass {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@class='btnValSec adultMemVal']//button[text()='+']")
	private WebElement adultnumber;

	@FindBy(xpath = "//*[@id='txtMobile']")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//*[@id='txtPinCode']")
	private WebElement pincode;
	
	@FindBy(xpath = "//*[@id='ctl00_Content_C001_btnCalculte']")
	private WebElement getquotebutton;
	

	WebDriverWait wait;
	
	
	public GetQuote(WebDriver driver) throws IOException
	{
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, 60);

	}
	
	public boolean verifyTitle()
	{
		String titleofpage = driver.getTitle();
		
		boolean ispresent = titleofpage.contains("Health");
		
		return ispresent;
	}
	
	
	public void enterData()
	{
		wait.until(ExpectedConditions.elementToBeClickable(adultnumber));
		adultnumber.click();
		
		mobilenumber.sendKeys(prop.getProperty("mobilenumber"));
	
		pincode.sendKeys(prop.getProperty("pincode"));
		
	}
	
	public void submitData() throws InterruptedException
	{
		Thread.sleep(2000);
		getquotebutton.click();
		
	}

}
