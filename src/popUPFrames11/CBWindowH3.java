
/* hOW DO YOU HANDLE NEW TAB IN SELENIUM */
package popUPFrames11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBWindowH3
{
	static 
	{ System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main( String[] args) throws Exception
	
	{ WebDriver driver=new ChromeDriver();
	 driver.get("http://localhost/login.do");
	 driver.findElement(By.linkText("Actimind Inc.")).click();
	 Thread.sleep(1000);
	 
	 Set<String>allWHS=driver.getWindowHandles();
	 System.out.println(allWHS.size());
	 /*______________*/
	 for(String wh:allWHS)
	 {
		 driver.switchTo().window(wh);
		 System.out.println(driver.getTitle());
		 
	 }
	 
	 String xp="//a[.='Features']";
	 driver.findElement(By.xpath(xp)).click();
	 	
	}
	
}
