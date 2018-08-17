package testauto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTesting {
	
@Test
	public void AlertTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MyEclipseProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
        alert.accept();
        
	}
}
