package weinvest.PageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import weinvest.baseclass.PageBase;

public class TaskB extends PageBase {

	public WebDriver driver;

	@FindBy(css = "#btn-explore79")
	private WebElement investmenIdea;

	@FindBy(xpath = "//*[@id=\"page-top\"]/div[3]/section/div[1]/div/div/div/div/div[2]/div[1]/div[1]/a")
	private WebElement customize_Portfolio;

	@FindBy(xpath = "//div[@class='row portfolio-constituents-header']/div[3]")
	private WebElement customise;

	// @FindBy(xpath="//div[@class='row constituent-row
	// vertical-align']/div[2]/div[2]/input")
	@FindBy(xpath = "//div[@class='row constituent-category vertical-align']/div[4]/div/a")

	private WebElement addstock;

	@FindBy(xpath = "//*[@id='modal-1']/div/div/div[2]/div/div/div[66]/div[4]/button")
	private WebElement AddEits;

	// *[@id="modal-1"]/div/div/div[2]/div/div/div[66]/div[4]/button

	public TaskB(WebDriver driver) {
		super(driver);
		// this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void ClickOninvestmentIdea() {
		try {
			mouseHover(investmenIdea);
			if (investmenIdea.isDisplayed())
				investmenIdea.click();

		} catch (Throwable t) {
			org.testng.Assert.fail();
		}
	}

	public void ClickOnCustomizePortFolio() {
		try {

			if (customize_Portfolio.isDisplayed())
				customize_Portfolio.click();

		} catch (Throwable t) {
			org.testng.Assert.fail();
		}
	}

	public void ClickOnCustomise() {
		try {

			if (customise.isDisplayed())
				customise.click();

		} catch (Throwable t) {
			org.testng.Assert.fail();
		}
	}

	public void ClickOnAddStock() throws InterruptedException {
		//String windowHandle = driver.getWindowHandle();
		//System.out.println("parent windoe:"+ windowHandle);
		mouseHover(addstock);
		
		try {

			if (addstock.isDisplayed())
			{
				addstock.click();
				switchToNewWindow();
				
					mouseHover(AddEits);
					forceClickElement(AddEits);
			}
			

		} catch (Throwable t) 
		{
			org.testng.Assert.fail();
		}
	}
}

	
	
	


