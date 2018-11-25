package weinvest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import weinvest.PageObjects.TaskA;
import weinvest.baseclass.WebdriverFactory;
public class TaskATest {
	//WebDriver driver ;


	@Test
	public void Login() throws Exception
	{
		WebDriver  driver = WebdriverFactory.Browsersetup();
		
		
	TaskA weather = new TaskA(driver);
	
	weather.ClickOninvestmentIdea();
	weather.ClickOnCustomizePortFolio();
	weather.ClickOnCustomise();
	weather.slider();
	//weather.verifySPDR();
			
			//PageFactory.initElements(driver,Loginpage.class);
	
		
	/*PLPPage plppage = new PLPPage(driver);
			//PageFactory.initElements(driver,PLPPage.class);
	plppage.AddItemToCart();
	Thread.sleep(2000);
	plppage.checkout();*/
	
	}
	
	
	

}
