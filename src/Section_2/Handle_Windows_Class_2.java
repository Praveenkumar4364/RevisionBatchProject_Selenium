package Section_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
/*
*launch chrome browser
*navigate to shoppersstack and choose any one of the product
*and click on comapre button maximize ebay
*and search fof iphones and take a screenshot
*maximize amazon search for mobiles and take screen shot
*maximize flipkart and search fof googlepixel and take the screen shot
*
*
*https://www.amazon.in/
https://www.flipkart.com/
https://www.ebay.com/
*/
public class Handle_Windows_Class_2 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	//Thread.sleep(40000);
	driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']")).click();
	//Thread.sleep(40000);
	driver.findElement(By.xpath("//*[name()='svg' and contains(@class,'MuiSvgIcon-root MuiSvgIcon-c')]")).click();
	String p = driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	for (String cid : c) {
		driver.switchTo().window(cid);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("ebay"))
		{
			driver.manage().window().maximize();
			//Thread.sleep(5000);
			driver.findElement(By.name("_nkw")).sendKeys("iphone",Keys.ENTER);
			//Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot/ebay.png");
			FileHandler.copy(src, dest);
			//Thread.sleep(3000);
			driver.close();
		}
		if(url.contains("amazon"))
		{
			driver.manage().window().maximize();
			//Thread.sleep(5000);
			driver.findElement(By.name("field-keywords")).sendKeys("mobiles",Keys.ENTER);
			//Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot/amazon.png");
			FileHandler.copy(src, dest);
			//Thread.sleep(3000);
			driver.close();
		}
		if(url.contains("flipkart"))
		{
			driver.manage().window().maximize();
			//Thread.sleep(5000);
			driver.findElement(By.name("q")).sendKeys("googlepixel",Keys.ENTER);
			//Thread.sleep(3000);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot/flipkart.png");
			FileHandler.copy(src, dest);
			//Thread.sleep(3000);
			driver.close();
		}
	}
	//Thread.sleep(3000);
	driver.quit();
}
}
