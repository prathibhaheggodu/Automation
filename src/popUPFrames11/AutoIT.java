package popUPFrames11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {
static
	
	{ String key="webdriver.gecko.driver";
	  String value="./driver/geckodriver.exe";
	  System.setProperty(key,value);   // to open firfox  browser  
	  
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	// to open chrome browser
	}			

	 public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	 
	 { //WebDriver driver=new FirefoxDriver(); // open the browser
		 WebDriver driver=new ChromeDriver();
	 
	 driver.get("http://localhost/login.do");
	 Thread.sleep(1000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_P);
	 r.keyRelease(KeyEvent.VK_CONTROL);
//     driver.switchTo().activeElement().sendKeys(Keys.CONTROL+"p");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='radio']")).click();;
     //Runtime.getRuntime().exec("F://print2.exe");
     Thread.sleep(3000); 
   // driver.close();
}
}