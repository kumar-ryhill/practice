package weinvest.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import weinvest.PageObjects.TaskA;
import weinvest.PageObjects.TaskB;
import weinvest.baseclass.WebdriverFactory;

public class TaskBTest
{

	@Test
	public void Login() throws Exception
	{
		WebDriver  driver = WebdriverFactory.Browsersetup();
		
		
	TaskB weather = new TaskB(driver);
	
	weather.ClickOninvestmentIdea();
	weather.ClickOnCustomizePortFolio();
	weather.ClickOnCustomise();
	weather.ClickOnAddStock();
	//weather.Adding_stocks();
	}

}
