package shoppers_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
 * 1) Registration
 * 2)Login
 * 
 */
public class TC_01_Rigistration {
	WebDriver driver;
	@Test(groups = "smoke")
	@Parameters("browser")
public void rigistration(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
	       driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
	driver.get("https://www.shoppersstack.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.findElement(By.name("loginBtn")).click();
	driver.findElement(By.xpath("//span[text()='Create Account']")).click();
	driver.findElement(By.id("First Name")).sendKeys("Praveen",Keys.TAB,"Kumar");
	driver.findElement(By.xpath("//span[text()='Male']")).click();
	driver.findElement(By.id("Phone Number")).sendKeys("9381112093",Keys.TAB,"praveensakinala4364@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Praveen@4364",Keys.TAB,Keys.TAB,"Praveen@4364");
	driver.findElement(By.name("Terms and Conditions")).click();
	driver.findElement(By.xpath("//button[text()='Register']")).click();
}
}
