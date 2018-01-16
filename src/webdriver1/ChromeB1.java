package webdriver1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeB1
{
	
		static
		
		{ String key="webdriver.chrome.driver";
		  String value="./driver/chromedriver.exe";
		  System.setProperty(key,value);
		  
		}
		  
		  public static void main(String[] args)
		  {
		  
		  ChromeDriver driver=new ChromeDriver();
		  
		  
		}
	}


