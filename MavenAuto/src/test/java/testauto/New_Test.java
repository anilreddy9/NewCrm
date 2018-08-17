package testauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Test {
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MyEclipseProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.readwhere.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='rw_login_btn']")).click();
	    Thread.sleep(3000);
	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println(size);
	    for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
		    driver.switchTo().defaultContent();
		    }
	    
	    //driver.switchTo().frame("rw_iframe");
		driver.findElement(By.xpath(".//*[@id='rw_iframe']/div[2]/div[4]/div/form/div[1]/div/div/input")).clear();
		driver.findElement(By.xpath(".//*[@id='rw_iframe']/div[2]/div[4]/div/form/div[1]/div/div/input")).sendKeys("Testingdummy@gmail.com");
}
}