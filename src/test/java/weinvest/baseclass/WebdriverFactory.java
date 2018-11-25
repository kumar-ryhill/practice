package weinvest.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverFactory {
	
	public static WebDriver driver ;
	public static String chromeExe;
	
	public static Properties prop ;
	@BeforeClass
	public static  WebDriver Browsersetup() throws Exception
	{
		 prop = new Properties();
		
		FileInputStream fi = new FileInputStream("src"+File.separator+"test"+File.separator+"resource"+File.separator+"data.properties");
		prop.load(fi);
	String browser =prop.getProperty("Browser");
		
		if(browser.equals("chrome"))
		{
		
		
		chromeExe = "src" + File.separator + "test" + File.separator + "resource" + File.separator
				+ "chromedriver.exe";// set the path to chromedriver
		}
	
		System.setProperty("webdriver.chrome.driver", chromeExe);
	ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	
	

	       

	        
	        
	}


