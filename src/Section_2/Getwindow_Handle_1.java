package Section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow_Handle_1 {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	String p=driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	System.out.println(p);
	System.out.println(c);
	
	for (String cid : c) {
		if(!p.equals(cid))
		{
			Thread.sleep(3000);
			System.out.println(cid);
			
			driver.switchTo().window(cid).close();
		}
		
	}
}
}
