package webdriver1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeB
{
	
		public static void main(String[] args)
		
		{ String key="webdriver.chrome.driver";
		  String value="./driver/chromedriver.exe";
		  System.setProperty(key,value);
		  
		  ChromeDriver driver=new ChromeDriver();
		  
		  
		}
	}


