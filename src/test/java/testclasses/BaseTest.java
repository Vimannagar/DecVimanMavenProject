package testclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuyOnlinePlan;
import pages.BuyOnlinePlan2;
import pages.GetQuote;
import pages.HomePage;

public class BaseTest {
	public static WebDriver driver;
	public BuyOnlinePlan buyonline;
public	HomePage hp;
public	GetQuote gq;
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--disable-notifications");
		
//		options.addArguments("--incognito");
				
//		options.addArguments("--headless");
				
		 driver = new ChromeDriver(options);
		
//		driver.manage().window().maximize();
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		String url = prop.getProperty("testsiteurl");
		
		driver.get(url);
			
	}
	
	@BeforeClass
	public void createObjects() throws IOException
	{
		 buyonline = new BuyOnlinePlan(driver);
		 hp = new HomePage(driver);
		 gq = new GetQuote(driver);
		 
		 
	}
	
	
	

}
