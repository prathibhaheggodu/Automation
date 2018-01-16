
/* How do you login to the application without using any locators :YES, BY USING switchTo and sendkeys, 
 * but condition : element should be focussed */
 
package popUPFrames11;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBWindowH5 {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
  public static void main(String[] args) throws Exception
  {
	  WebDriver driver=new ChromeDriver();
   driver.get("http://localhost/login.do");
   WebElement e=driver.switchTo().activeElement();  // to get adddress of username
   e.sendKeys("admin");
   Thread.sleep(1000);
   e.sendKeys(Keys.TAB);  // GOES TO NEXT TAB-PASSWORD
   WebElement e2=driver.switchTo().activeElement();
   e2.sendKeys("manager");
   Thread.sleep(1000);
   e2.sendKeys(Keys.ENTER);
  
  }
}
