package testclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		String url = prop.getProperty("testsiteurl");
		
		driver.get(url);
			
	}
	

}
