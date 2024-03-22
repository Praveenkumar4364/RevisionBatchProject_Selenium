package Section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*
 * launch chrome browser navigate to flipkart applicartion
 * search for google pixel
 * the scroll u[ to fifth product
 * and fetch offer percentage of that particular product
 * if that offer percentage is less than 30% print not worthy else print worthy
 */
public class Keyboard_Handling_3 {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement ele= driver.findElement(By.name("q"));
	ele.sendKeys("google pixcel");
	ele.submit();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(2000);
	
	Select s=new Select(ele);
	
	
	String per= driver.findElement
	(By.xpath("//div[text()='Google Pixel Buds Pro with Active Noise Cancellation Bluetooth Headset']/../../div[2]/div/div/div[3]/span")).getText();
	if(!per.contains("30% off"))
	{
		System.out.println("Not worthy");
	}
	else
	{
		System.out.println("worthy");
	}
	driver.quit();
	
}
}
