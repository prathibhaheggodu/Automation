/* works only for Firefox, not for chrome...as no popup in chrome  */



package popUPFrames11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileDownload1 {
	
static
	
	{ String key="webdriver.gecko.driver";
	  String value="./driver/geckodriver.exe";
	  System.setProperty(key,value);   // to open firfox  browser
	  
	}			

	 public static void main(String[] args) throws InterruptedException, AWTException 
	 
	 {   WebDriver driver=new FirefoxDriver(); // open the browser
	 
	 driver.get("http://www.seleniumhq.org/download/");
	 
	  
	 Thread.sleep(3000);
	  driver.findElement(By.id("close")).click();
	  Thread.sleep(3000);
	  String xp="//td[.='Java']/../td[4]/a";
	  // independent dependent path 
	  WebElement download=driver.findElement(By.xpath(xp));
	  int y=download.getLocation().getY();
	  System.out.println(y);
	  
	  //-----to scroll down----------
	  
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	   j.executeScript("window.scrollBy(0,"+y+")");
	  
	  Thread.sleep(3000);
	  download.click();
	  Thread.sleep(3000);
	  
	  // to select save file and click ok
	  
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ALT);
	  r.keyPress(KeyEvent.VK_S);
	  r.keyPress(KeyEvent.VK_ALT);
	  Thread.sleep(1000);
	  r.keyPress(KeyEvent.VK_ENTER);
	 }
	 
}
