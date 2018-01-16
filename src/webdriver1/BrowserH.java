package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserH {
	static
	{// set driver executable path
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser	
	}
	
  public static void main(String[] args) 
  
  { //open chrome browser
	    WebDriver driver=new ChromeDriver();
	  
	  // enter the url in address bar and wait till page is loaded
	  
	  driver.get("file:///C:/Users/Prathibha%20Heggodu/Desktop/Qspiders.html");
	  
	  // get the title and print it
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  
	  // get the url present in the address bar and print it
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	  
	  // get the html code of page and print it 
	   String src=driver.getPageSource();
	  System.out.println(src);
	  // close the browser
	  driver.close();
	 
  }// end of main
  
}// end of class

