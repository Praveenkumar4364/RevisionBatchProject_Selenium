package Section_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * 
 */
public class Notification_Popup_Class {
public static void main(String[] args) throws AWTException, InterruptedException {
	//with chromeoptions class preffered or efficient way
	ChromeOptions option=new ChromeOptions();//st:1
	option.addArguments("--disable-notifications");//st:2
	
	WebDriver driver=new ChromeDriver(option);//st:3
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(7000);
	/*
	//With Robot Class
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	*/
	driver.quit();
}
}
