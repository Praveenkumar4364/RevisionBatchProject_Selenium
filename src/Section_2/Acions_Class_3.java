package Section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * launch chrome browser
 * navigate to flipkart
 * mouse over fashion then click on mens t-shirt
 * fetch all the product name 
 */
public class Acions_Class_3 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement ele= driver.findElement(By.xpath("//span[text()='Fashion']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.linkText("Men's T-Shirts")).click();
	List<WebElement> ele1= driver.findElements(By.xpath("//a[@class='IRpwTa']"));
	int count=1;
	for(WebElement n:ele1)
	{
		
		String s=n.getText();

	System.out.println(count+"-->"+s);
		count++;
	}
}
}
