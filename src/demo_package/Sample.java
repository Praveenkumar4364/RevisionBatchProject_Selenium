package demo_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * launch the chrome browser 
 * navigate to flipkart search for google pixel
 * print ratings of all the products,all product names
 */
public class Sample {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement ele= driver.findElement(By.name("q"));
	ele.sendKeys("google pixel");
	ele.submit();
	List<WebElement> name= driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> r=driver.findElements(By.xpath("//div[@class='_4rR01T']/../../div[1]/div[2]/span/div"));
	System.out.println("-------------------------------------------NAMES----------------------------------------------");
	for(WebElement n:name)
	{
		String sn=n.getText();
		System.out.println(sn);
	}
	System.out.println("-------------------------------------------RATINGS----------------------------------------------");
	for(WebElement rating:r)
	{
		String sr=rating.getText();
		System.out.println(sr);
	}
	driver.quit();
}
}
