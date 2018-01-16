package singleElement7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementF {
	
static
	{ String key="webdriver.chrome.driver";
	  String value="./driver/chromedriver.exe";
	  System.setProperty(key,value);   // to open chrome browser
	  
	}			

	 public static void main(String[] args) 
	 
	 {   WebDriver driver=new ChromeDriver(); // open the browser
	 
	 driver.get("http://localhost/login.do");  // enter the url 
	 WebElement un=driver.findElement(By.id("username"));
	 
	 int h1=un.getSize().getHeight();
	 
	 int w1=un.getSize().getWidth();
	 
	 System.out.println(h1);
	 
	 System.out.println(w1);
	 System.out.println(".............");
	  
WebElement pw=driver.findElement(By.name("pwd"));
	 
	 int h2=pw.getSize().getHeight();
	 
	 int w2=pw.getSize().getWidth();
	 
	 System.out.println(h2);
	 
	 System.out.println(w2);
	 System.out.println(".............");
	 
	 if(h1==h2 && w1==w2)
		 
	 { System.out.println("Pass:.....");
		 
     }
	 
	 else 
		 
	 { System.out.println("Fail:..........");
	 

}}}
