package weinvest.PageObjects;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import weinvest.baseclass.PageBase;

public class TaskA extends PageBase {
	
	public WebDriver driver;
	
	
	
	
	@FindBy(css="#btn-explore79")
	private WebElement investmenIdea;
	
	@FindBy(xpath="//*[@id=\"page-top\"]/div[3]/section/div[1]/div/div/div/div/div[2]/div[1]/div[1]/a")
	private WebElement customize_Portfolio;
	

	@FindBy(xpath="//div[@class='row portfolio-constituents-header']/div[3]")
	private WebElement customise;
	
	//@FindBy(xpath="//div[@class='row constituent-row vertical-align']/div[2]/div[2]/input")
	@FindBy(xpath="//div[@class='col-md-9']/input[1]")

	private WebElement slider;
	
	@FindBy(xpath="//*[@id='customise-portfolio']/div/div[2]/div/div[1]/div[2]/a")
	private WebElement Rebalance;
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[1]/div[4]/a")
	private WebElement invest;
	
	@FindBy(xpath="//*[@id='customise-portfolio']/div/div[2]/div/div[3]/div/div[2]/div[2]/div[1]/text()[1]")
	private WebElement valueAfterRebalance;
	
	
	
	
	public TaskA(WebDriver driver)
	{
		super(driver);
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void ClickOninvestmentIdea()
	{
		try {
			mouseHover(investmenIdea);
		if(investmenIdea.isDisplayed())
			investmenIdea.click();
		
		}catch(Throwable t)
		{
			org.testng.Assert.fail();
		}
	}
	
	
	public void ClickOnCustomizePortFolio()
	{
		try {
			
		if(customize_Portfolio.isDisplayed())
			customize_Portfolio.click();
		
		}catch(Throwable t)
		{
			org.testng.Assert.fail();
		}
	}
	
	
	public void ClickOnCustomise()
	{
		try {
			
		if(customise.isDisplayed())
			customise.click();
		
		}catch(Throwable t)
		{
			org.testng.Assert.fail();
		}
	}
	
	
	public void slider() throws InterruptedException
	{
		mouseHover(slider);
		slider.click();
		for(int i=0;i<=18;i++)
		{
			slider.click();
		}
		

		ClickOnElement(Rebalance);
		//driver.wait(4000);
		ClickOnElement(invest);
	
		/*On next page” verify that “SPDR…” under “What your portfolio contain ?” to be 50%
		 */
		 
		WebElement  profitfolio = driver.findElement(By.xpath("//ul[@class='list-group constituent-list clearfix']/li[1]"));
		scrollToElement(profitfolio);
		WebElement Element = driver.findElement(By.xpath("//ul[@class='list-group constituent-list clearfix']/li[1]/div/div/div[3]/span[1]"));
	mouseHover(Element);
	String ActualValue= Element.getText();
	System.out.println(ActualValue);
	assertEquals("Verify Value", "50%", ActualValue);
	
	
	}
	
	
	

	
	
	

	
	

}
