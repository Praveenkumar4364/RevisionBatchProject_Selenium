package Section_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * launch chrome browser
 * navigate to shoppersstack.com
 * choose any one of the product
 * click on compare button -it shows 3 child windows
 * in which fetch all window id's
 */
public class Scenario_2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(40000);
	WebElement ele= driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']"));
	ele.click();
	Thread.sleep(40000);
	driver.findElement(By.xpath("//*[name()='svg' and contains(@class,'MuiSvgIcon-root MuiSvgIcon-co')]")).click();
	Thread.sleep(10000);
	String P= driver.getWindowHandle();
	Set<String> C=driver.getWindowHandles();
	for(String Ch:C)
	{
		if(!P.equals(Ch))
		{
			String s= driver.switchTo().window(Ch).getTitle();
			//System.out.println(s);
			String s1=driver.switchTo().window(Ch).getCurrentUrl();
			System.out.println("Title : "+s+"---"+"URL : "+s1);
		}
	}
	driver.quit();
}
}
