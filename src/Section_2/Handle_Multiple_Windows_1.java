package Section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multiple_Windows_1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	driver.findElement(By.id("newWindowsBtn")).click();
	String p = driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	for (String cid : c) {
		String curl = driver.switchTo().window(cid).getCurrentUrl();
		System.out.println(curl);
		if(curl.contains("add-padding-to-containers.html"))
		{
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		}
	}
	
}
}
