package demo_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * launch chrome broser 
   navigate to demo webshop and validate community pole radio buttons
*/
public class Demo_Web_Shop_Rdio_Buttons {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
  List<WebElement> e= driver.findElements(By.xpath("//input[@type='radio']"));
  for(WebElement e1:e)
  {
	  Thread.sleep(3000);
	  e1.click();
	  
  }
  driver.quit();
}
}
