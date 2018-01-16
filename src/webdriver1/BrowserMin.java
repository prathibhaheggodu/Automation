package webdriver1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMin {
	
	static
	
	{ String key="webdriver.chrome.driver";
	  String value="./driver/chromedriver.exe";
	  System.setProperty(key,value);
	  
	}			

	 public static void main(String[] args) throws InterruptedException, AWTException,IOException
	 
	 { ChromeDriver driver=new ChromeDriver();
	 
	 Thread.sleep(1000);
	 Robot r=new Robot();
	 
	 r.keyPress(KeyEvent.VK_ALT);
	 r.keyPress(KeyEvent.VK_SPACE);
	 r.keyPress(KeyEvent.VK_ALT);
	 
	 Thread.sleep(1000);
	 
	 r.keyPress(KeyEvent.VK_N);
	
	 
	 }

}
