package demo_package;
/*
launch chrome browser
navigate to flipkart
search for iphone click on any product
fetch current price,actual price,offer percentage
*/

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip_kart_Surrounding_Element {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	ele.sendKeys("iphone");
	ele.submit();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Starlight, 128 GB)']")).click();
	String PID=driver.getWindowHandle();
	Set<String> CID=driver.getWindowHandles();
	for(String ALD: CID)
	{
		if(!ALD.equals(PID))
		{
			driver.switchTo().window(ALD);
		}
	}
	
//	WebElement s=(WebElement) driver.findElements(By.xpath("//span[text()='Apple iPhone 14 (Starlight, 128 GB)']/../../../div[4]/div[1]/div/div"));
//	String s1=s.getText();
//	System.out.println(s1);
	String s=driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (Starlight, 128 GB)']/../../../div[4]/div[1]/div/div[1]")).getText();
	String s1=driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (Starlight, 128 GB)']/../../../div[4]/div[1]/div/div[2]")).getText();
	String s2=driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (Starlight, 128 GB)']/../../../div[4]/div[1]/div/div[3]")).getText();
	System.out.println("Product Price : "+s);
	System.out.println("Product actual price : "+s1);
	System.out.println("Product discount : "+s2);
	driver.quit();
	
}
}
