package runtimepolymorphism3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RuntimePolymorphism {
	
static
	
	{
			// set driver executable path
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser
	
		
	}
	
	
public static void main(String[] args) 

{ WebDriver driver=new ChromeDriver();

 RuntimePolymorphism.testBrowser(driver);
 
 
}
	

  public static void testBrowser(WebDriver driver)
  
  { driver.get("http://localhost/login.do");
  
    driver.close();
  }
  
  
}
