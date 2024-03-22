package shoppers_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_02_Login {
	WebDriver driver;
	@Test(groups = {"smoke","regression"})
	@Parameters("browser")
public void login(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
	         driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.findElement(By.name("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys("praveensakinala4364@gmail.com",Keys.TAB,"Praveen@4364");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	driver.quit();
}
}
