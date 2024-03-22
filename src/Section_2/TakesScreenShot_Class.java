package Section_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*
 *launch chrome browser
 *navigate to flipkart
 *navigate to login page perform operation
 *and take screenshot of next web page 
 */
public class TakesScreenShot_Class {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	ele.sendKeys("9381112093");
	
	driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
//	Thread.sleep(20000);
//	
//	driver.findElement(By.xpath("//button[text()='Verify']")).click();
	
	Thread.sleep(3000);
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./screenshot/flip.jpg");
	
	FileHandler.copy(src, dest);
	
	driver.quit();
}
}
