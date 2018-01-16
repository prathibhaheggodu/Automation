package loginpage5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTitle {
		static 
		
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser
		}
		
		public static void main(String[] args) throws Exception
		
{	 WebDriver driver=new ChromeDriver();
    
    driver.get("http://localhost/login.do");
    String eTitle="actiTTME-login";
    
    System.out.println("Expected:"+eTitle);
    
    String aTitle=driver.getTitle();
    
    System.out.println("Actual:"+aTitle);
    		
    
	if(aTitle.equals("eTitle"))	
    	
    {System.out.println("PASS:login page is Displayed");
    
    }
    else		
    {
    	System.out.println("FAIL:login page is not Displayed");
    	
    }
	}

}
