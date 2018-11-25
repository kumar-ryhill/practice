package weinvest.baseclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class PageBase {
	
	WebDriver driver;
	Actions actions = null;
	public PageBase(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}


	public void enterValue(WebElement element, String value)
	{
		try
		{
			if(element.getTagName().equals("input"))
				element.clear();
			element.sendKeys(value);
		}catch(Exception e)
		{
			org.testng.Assert.fail();
		}
		
	}
	
	
	public void ClickOnElement(WebElement element)
	{
		element.click();
	}
	
	public void switchToNewWindow() {

		String firstWindow = driver.getWindowHandle();
		System.out.println("kumar");
		String newWindow = "";
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			if (!window.equals(firstWindow)) {
				newWindow = window;
			}
		}

		driver.switchTo().window(firstWindow);
		driver.switchTo().window(newWindow);
	}
	
	
	
	public void scrollToElement(WebElement element) {
		int elementPosition = element.getLocation().getY();
		String js = String.format("window.scroll(0, %s)", elementPosition);
		((JavascriptExecutor) driver).executeScript(js);
	}
	
	
	
	
	public void keyRight() {
		actions.sendKeys(Keys.ARROW_LEFT).perform();

	}
	
	public void forceClickElement(WebElement element) {
		try {

			actions.moveToElement(element);
			actions.click();
			actions.build().perform();
		} catch (Exception e) {
			Assert.fail("Failed to force click element");
		}
	}

		
	
}
	
	
	

