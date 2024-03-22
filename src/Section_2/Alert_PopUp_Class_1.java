package Section_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 */
public class Alert_PopUp_Class_1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	//simple alert
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Thread.sleep(2000);
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	//alt.accept();
	alt.dismiss();
	Thread.sleep(2000);
	//conformation alert
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Thread.sleep(2000);
	System.out.println(alt.getText());
	alt.accept();
	Thread.sleep(2000);
	//promt alert
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Thread.sleep(2000);
	System.out.println(alt.getText());
	alt.sendKeys("Hello");
	Thread.sleep(2000);
	alt.accept();
	driver.quit();
}
}
