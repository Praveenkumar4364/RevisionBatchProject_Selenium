package Section_2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *launch the chrome browser
 *navigate to shoppersstack
 *choose any product click on compare button 
 *maximize ebay window and search for iphones 
 *
 *
 
 */
public class Handle_Multiple_Windows_2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(40000);
	driver.findElement(By.xpath("//span[text()='Levis Mens Regular Fit Tee']")).click();
	Thread.sleep(40000);
	driver.findElement(By.xpath("//*[name()='svg' and contains(@class,'MuiSvgIcon-root MuiSvgIcon-c')]")).click();
	String p = driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	for (String cid : c) {
		driver.switchTo().window(cid);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("www.ebay.com"))
		{
			driver.manage().window().maximize();
			Thread.sleep(6000);
			driver.findElement(By.id("gh-ac")).sendKeys("iphone",Keys.ENTER);
		}
		
	}
	
}
}
