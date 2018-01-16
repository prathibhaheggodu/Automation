package locators4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebPage {
	
static
	
	{ String key="webdriver.chrome.driver";
	  String value="./driver/chromedriver.exe";
	  System.setProperty(key,value);   // to open chrome browser
	  
	}			

	 public static void main(String[] args) 
	 
	 {   WebDriver driver=new ChromeDriver(); // open the browser
	 
	     driver.get("file:///C:/Users/Prathibha%20Heggodu/Desktop/SimpleW.html");  // enter the URL
	     
	    /* WebElement element=driver.findElement(By.tagName("a"));  // to find the element using tagname
	     
	        element.click();   // click on that element   */
	     
	     driver.findElement(By.tagName("a")).click();  // optimised code
	     
	     
	 }

}
