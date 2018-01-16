package webdriver1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFB
{
	
		static
		
		{ String key="webdriver.gecko.driver";
		  String value="./driver/geckodriver.exe";
		  System.setProperty(key,value);
		  
		}
		  
		  
		  
		  public static void main(String[] args) throws Exception
		  {
		  // open the browser  
	
 
			  FirefoxDriver driver=new FirefoxDriver();			 
			Thread.sleep(2000);
			Dimension d=new Dimension(200,300);
			driver.manage().window().setSize(d);
			Thread.sleep(2000);
			
			// move the browser
			Point p=new Point(300,100);
			driver.manage().window().setPosition(p);
			Thread.sleep(2000);

			// maximise the browser
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// close the browser
			driver.quit();
		 
		  
		}
	}
