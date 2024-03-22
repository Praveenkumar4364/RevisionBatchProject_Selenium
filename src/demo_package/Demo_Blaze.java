package demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *launch the browser
 *navigate to demo blaze
 *identify the price of nokia lumia 1520 
 */
public class Demo_Blaze {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	Thread.sleep(2000);
	String s=driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']/../../h5")).getText();
	System.out.println(s);
	String price = driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']/../../h5")).getText();
	System.out.println(price);

	driver.quit();
}
}
