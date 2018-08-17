package testauto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	WebDriver driver;
	
	@BeforeTest
	public void first()
	{
		System.out.println("After Test Method");
	}
	
	@Test
public void open() throws InterruptedException
{
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");*/
		
	System.setProperty("webdriver.chrome.driver", "D:\\MyEclipseProject\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Google";
	if(ExpectedTitle.equals(ActualTitle))
	{
		System.out.println("Title Verified");
	}
	else
	{
		System.out.println("Title Not Verified");	
	}
	WebElement ele = driver.findElement(By.xpath(".//input[@id=\"lst-ib\"]"));
	
	if(ele.isDisplayed())
	{
		ele.clear();
		ele.sendKeys("Namaste Anna");
		System.out.println("Working Fine");
	}
	else
	{
		System.out.println("Element Biscuit");
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value=\"Google Search\"]")).click();
	}
	
	@AfterTest
	public void Before()
	{
		System.out.println("After Test Method");
		driver.quit();
	}
}
