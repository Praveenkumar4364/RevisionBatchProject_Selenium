package Section_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup_Class {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}
