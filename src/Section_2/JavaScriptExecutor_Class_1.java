package Section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor_Class_1 {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.name("q"));
	ele.sendKeys("honor");
	ele.submit();
	Thread.sleep(1000);

//JavascriptExecutor jse=(JavascriptExecutor) driver;
	/*
	jse.executeScript("window.scrollBy(0,500)");//it executes multiple times
	Thread.sleep(1000);
	jse.executeScript("window.scrollBy(0,500)");
	*/
	/*
	jse.executeScript("window.scrollTo(0,500)");//it executes only once
	Thread.sleep(1000);
	jse.executeScript("window.scrollTo(0,500)");
	*/
	/*
	WebElement m= driver.findElement(By.xpath("//div[text()='Honor 7A (Blue, 32 GB)']"));
	jse.executeScript("arguments[0].scrollIntoView(false)",m);//element visible in bottom
	jse.executeScript("arguments[0].scrollIntoView(true)",m);//element visible in top
	*/
	
	/*
	WebElement m= driver.findElement(By.xpath("//div[text()='Honor 7A (Blue, 32 GB)']"));
Actions act=new Actions(driver);
	//act.scrollToElement(m).perform();
	//act.moveToElement(m).perform();
	*/
	
Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
