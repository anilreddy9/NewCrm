package testauto;

import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectClass {
WebDriver driver;
@Test
public void test() throws InterruptedException
		{
	System.setProperty("webdriver.chrome.driver", "D:\\MyEclipseProject\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("window.scrollBy(0,500)");
	WebElement ele = driver.findElement(By.name("dropdown"));
	Thread.sleep(2000);
	if(ele.isDisplayed())
	{
	Select select = new Select(ele);
	select.selectByVisibleText("Manual Testing");
	Thread.sleep(2000);
	select.selectByIndex(1);
	Thread.sleep(2000);
	select.selectByValue("ddperformance");
	Thread.sleep(2000);
	String Text = select.getFirstSelectedOption().getText();
	System.out.println(Text);
	Thread.sleep(4000);
	}
	else
	{
		System.out.println("element not found");
	}
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\\div[@class='listbuilder-popup-scale']")));
		}
}
