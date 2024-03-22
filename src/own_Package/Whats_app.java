package own_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whats_app {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(30000);
	driver.findElement(By.xpath("//div[@title='Search input textbox']")).sendKeys("saketh",Keys.ENTER);
	
	for(int i=1;i<=10;i++)
	{
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//p[contains(@class,\"select\")])[2]")).sendKeys("call to saketh...!!",Keys.ENTER);
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='_3ndVb fbgy3m38 ft2m32mm oq31bsqd nu34rnf1'])[5]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Log out']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Log out']")).click();
}
}
