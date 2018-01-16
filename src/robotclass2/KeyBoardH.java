package robotclass2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class KeyBoardH {
	
	static
		
		{ String key="webdriver.chrome.driver";
		  String value="./driver/chromedriver.exe";
		  System.setProperty(key,value);
		  
		}			
 
		
 
	
	public static void main(String[] args) throws InterruptedException, AWTException,IOException
	
	{  Runtime.getRuntime().exec("notepad");
	
	 Thread.sleep(1000);
	 
	 Robot r=new Robot();
	 
	 r.keyPress(KeyEvent.VK_A);
	 
	 r.keyPress(KeyEvent.VK_B);
	 
	 
	}
	

}
