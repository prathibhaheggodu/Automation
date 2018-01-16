
/* WAS TO PRINT TITLE OF ALL THE BROWSERS AND TO CLOSE ALL THE browsers without using quit */

package popUPFrames11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class CBWindowH2 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("licenseLink")).click();
		/*_______________________*/
		
		 java.util.Set<String> allWHS = driver.getWindowHandles();
		
		int count=allWHS.size();
		 System.out.println(count);
		 /*__________________*/
		 
		 for(String wh:allWHS)
		 { driver.switchTo().window(wh);  // first parent then to child browser
		 
		 String title=driver.getTitle(); // TO GET TITLE
		 System.out.println(title);  // TO PRINT TITLE
		 driver.close();// TO CLOSE THE BROWSER ONE BY ONE, AT LAST ALL

		 }	
		
	}
}
