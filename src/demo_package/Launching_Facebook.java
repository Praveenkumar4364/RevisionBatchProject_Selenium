package demo_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Facebook {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String URL=driver.getCurrentUrl();
	//String URL=URL1+" ";
	String title=driver.getTitle();
	if(URL.equals(driver.getCurrentUrl()) && title.equals(driver.getTitle()))
	{
		System.out.println(URL+" URL-Pass");
		System.out.println(title+" Title-Pass");
	}
	else
	{
		System.out.println(URL+" URL-Fail");
		System.out.println(title+" Title-Fail");
	}
//	if(title.equals(driver.getTitle()))
//	{
//		System.out.println(title+" Title-Pass");
//	}
//	else
//	{
//		System.out.println(title+" Title-Fail");
//	}
}
}
