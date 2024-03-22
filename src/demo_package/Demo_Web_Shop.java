package demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *launch chrome browser
 *navigate to Demowebshop
 *click on register link
 *perform register operation
 *move back to home page
 *click on login link
 *and validate are we navigated to login page properly or not 
 */
public class Demo_Web_Shop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("gender-male")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("FirstName")).sendKeys("Praveen");
	Thread.sleep(2000);
	driver.findElement(By.id("LastName")).sendKeys("kumar");
	Thread.sleep(2000);
	driver.findElement(By.name("Email")).sendKeys("praveen123@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("Password")).sendKeys("Praveen123");
	Thread.sleep(2000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Praveen123");
	Thread.sleep(2000);
	driver.findElement(By.name("register-button")).click();
	Navigation n=driver.navigate();
	n.back();
	Thread.sleep(2000);
	n.back();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	if(url.contains(driver.getCurrentUrl()) && title.contains(driver.getTitle()))
	{
		System.out.println("Valid");
	}
	else
	{
		System.out.println("Not Valid");
	}
	
	driver.quit();
}
}
