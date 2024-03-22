package Section_2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

/*
 * launch chrome browser 
 * navigate to demowebshop 
 * click on login perform login operation
 * come back to home page
 * click on jewelry
 * click on add to cart the first product
 * choose material as silver
 * enter length as 15
 * choose star radio button 
 * click on add cart
 * click on shopping cart
 * capture the screenshot product precent in shopping cart
 */
public class Scenario_1 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("praveensakinala4364@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Praveen@4364");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("(//a[@href='/jewelry'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.xpath("//select[@name='product_attribute_71_9_15']"));
	Select sel=new Select(ele);
	sel.selectByValue("47");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='product_attribute_71_10_16']")).sendKeys("15");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Star ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-button-71")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	Thread.sleep(2000);
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/cart.png");
	FileHandler.copy(src, dest);
	Thread.sleep(2000);
	driver.quit();
}
}
