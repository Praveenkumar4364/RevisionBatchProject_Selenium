package shoppers_stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_06_Electronics {
	@Test(groups = "regression")
public void electronics() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.findElement(By.name("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys("praveensakinala4364@gmail.com",Keys.TAB,"Praveen@4364");
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	driver.findElement(By.xpath("(//a[@href='/electronics'])[1]")).click();
	driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
}
}
