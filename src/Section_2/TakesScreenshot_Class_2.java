package Section_2;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

/*
  launch chrome browser
  navigate to flipkart
  mouse over on electronics
  then take the screenshot
  which should show the content of
  then click on gaming
  take the screenshot of the products visible the fetch the current price of first product
*/
public class TakesScreenshot_Class_2 {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(7000);
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/ele.png");
	FileHandler.copy(src, dest);
	
	
	driver.findElement(By.xpath("//a[text()='Gaming']")).click();
	
	Thread.sleep(7000);
	
	File src1 = ts.getScreenshotAs(OutputType.FILE);
	File dest1=new File("./screenshot/gmg.png");
	FileHandler.copy(src1, dest1);
	
	String s = driver.findElement(By.xpath("(//a[contains(@title,'Bestor')])[1]/../a[3]/div/div[1]")).getText();
	System.out.println(s);
	driver.quit();
}
}
