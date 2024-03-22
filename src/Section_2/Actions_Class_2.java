package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * launch chrome browser
 * navigate to flipkart
 * mouse over on electronics and click gaming
 * and identify the offer percentage of first product
 */
public class Actions_Class_2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele= driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='Gaming']")).click();
	String s= driver.findElement(By.xpath("(//a[contains(@title,'Bestor')])[1]/../a[3]/div/div[3]")).getText();
	System.out.println(s);
	driver.quit();
}
}
