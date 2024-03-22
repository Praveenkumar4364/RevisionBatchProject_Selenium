package demo_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * launch chrome browser 
 * fetch all the links which are present in the flipkart
 */
public class FindElements_Class {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	List<WebElement> ele= driver.findElements(By.xpath("//a"));
	int count=0;
	for(WebElement ele1:ele)
	{
		String s=ele1.getText();
		System.out.println(s);
		count++;
	}
	System.out.println("Count is : "+count);
	driver.quit();
}
}
