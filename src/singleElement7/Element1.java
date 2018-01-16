package singleElement7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element1 {
	
static
	
	{ String key="webdriver.chrome.driver";
	  String value="./driver/chromedriver.exe";
	  System.setProperty(key,value);   // to open chrome browser
	  
	}			

	 public static void main(String[] args) 
	 
	 {   WebDriver driver=new ChromeDriver(); // open the browser
	 
	 driver.get("http://localhost/login.do");  // enter the url 
	 
	 WebElement un=driver.findElement(By.id("username"));
	 
	 int x1=un.getLocation().getX();
     System.out.println(x1);
     
     WebElement pw=driver.findElement(By.name("pwd"));
     
     int x2=pw.getLocation().getX();
     
     System.out.println(x2);
     
     if(x1==x2)
    	 
     {System.out.println("PASS:.......");
     
     }
     
     else
     { System.out.println("FAIL:........");
     
     }
     }
     
     
	 
}
