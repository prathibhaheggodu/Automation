package popUPFrames11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
static
	
	{ String key="webdriver.chrome.driver";
	  String value="./driver/chromedriver.exe";
	  System.setProperty(key,value);   // to open chrome browser
	  
	}			

	 public static void main(String[] args) 
	 
	 {   WebDriver driver=new ChromeDriver(); // open the browser
	 
	 driver.get("http://localhost/login.do/");  // enter the url 
	 


}
