package robotclass2;

import java.awt.AWTException;
import java.awt.Robot;

public class MouseM

{
    	 static
 		
 		{ String key="webdriver.chrome.driver";
 		  String value="./driver/chromedriver.exe";
 		  System.setProperty(key,value);
 		  
 		}			
     	
		public static void main(String[] args) throws InterruptedException, AWTException
		
		
		{ Robot r=new Robot();
		
		     for(int i=0;i<100;i++)
			
		     { r.mouseMove(300+i, 100);
		
		      Thread.sleep(500);
		     }
		
		
		}
		
}




