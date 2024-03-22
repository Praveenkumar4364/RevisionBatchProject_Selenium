package Section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * launch the chrome browser
 * navigate to demo web shop
 * mouse over on computers and click on note books
 * add that item to the cart
 */
public class Actions_Class_1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele= driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("(//a[@href='/notebooks'])[1]")).click();
	driver.findElement(By.xpath("//input[contains(@class,'button-2')]")).click();
}
}
