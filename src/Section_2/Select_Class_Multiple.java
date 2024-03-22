package Section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *launch the chrome browser
 *navigate to skillrary(https://demoapp.skillrary.com)
 *and check select courses by price dropdown is single select or multi select
 *if multi select choose options like 100 to 199 and 200 to 299 and deselct 100 to 199 
 */
public class Select_Class_Multiple {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapp.skillrary.com");
	driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.name("cars"));
	Select sel=new Select(ele);
	if(sel.isMultiple()==true)
	{
		sel.selectByValue("199");
		sel.selectByValue("299");
		Thread.sleep(2000);
		sel.deselectByValue("199");
	}
	else
	{
		System.out.println("not possible");
	}
}
}
