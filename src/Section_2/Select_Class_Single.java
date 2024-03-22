package Section_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *launch the chrome browser 
 *navigate to facebook sign up page
 *identify month drop down 
 *and choose month of december if that drop down is single select
 *
 *
 *launch chrome browser 
 *navigate to facebook signup page and 
 *validate year dropdown to check 
 *user can choose all the option or not
 */
public class Select_Class_Single {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	WebElement ele= driver.findElement(By.name("birthday_month"));
	Select sel=new Select(ele);
	
	if(sel.isMultiple()==false)
	{
		sel.selectByValue("12");
	}
	else
	{
		System.out.println("Not Possible");
	}
	
	WebElement ele1= driver.findElement(By.id("year"));
	Select sel1=new Select(ele1);
	List<WebElement> all=sel1.getOptions();
	int i=all.size();
	System.out.println(i);
	for(WebElement n:all)
	{
		String s=n.getText();
		sel1.selectByVisibleText(s);
		System.out.println(s);
	}
	
	
	
}
}
