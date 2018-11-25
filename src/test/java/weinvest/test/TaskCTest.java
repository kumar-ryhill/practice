package weinvest.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import weinvest.PageObjects.TaskC;
import weinvest.baseclass.WebdriverFactory;

public class TaskCTest {
	
	
	@Test
	public void Login() throws Exception
	{
		WebDriver  driver = WebdriverFactory.Browsersetup();
		
		
	TaskC weather = new TaskC(driver);
	

	weather.tab();
	weather.resizeBrowser();
	
	//weather.Adding_stocks();
	}

}
