package weinvest.PageObjects;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import weinvest.baseclass.PageBase;

public class TaskC extends PageBase
{
	WebDriver driver;
	
	String textx= "X Portfolio recommendations based on your preferences";
	String texty="Y other portfolio choices available";
	
@FindBy(xpath="//ul[@class='model-portfolio-navs hidden-sm hidden-xs']/li")
private List<WebElement> tabs;

public TaskC(WebDriver driver)
{
	super(driver);
	//this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	
	
public void tab()
{
	int size = tabs.size();
	for(int i=0;i<=size;i++)
	{
		if(tabs.contains(textx)&&tabs.contains(texty))
		{
			System.out.println("text present");
			
		}else
		{
			System.out.println("text not present");
		}
		
	   
	}
}

public  void resizeBrowser() throws AWTException {
	Dimension d = new Dimension(375,667);
	driver.manage().window().setSize(d);
	
	this.tab();
}
	
	

	
		   
	  
}


