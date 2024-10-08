package base;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class TestBase 
{
	
	public static WebDriver driver;
	
	@BeforeTest
    public static void initialization() throws IOException

    {
    	
    	Properties prop = new Properties();
		InputStream obj=TestBase.class.getResourceAsStream("Data.properties");
		prop.load(obj);
		System.out.println(prop.getProperty("url"));
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/"+prop.getProperty("driverpath")+ "/chromedriver");
		//driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
    }
    

}
