package locators4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {
	static
	{System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");  // to open chrome browser
		
	}

	public static void main(String[] args) throws InterruptedException
	{ WebDriver driver=new ChromeDriver();  // open the browser
	driver.get("file:///C:/Users/Prathibha%20Heggodu/Desktop/SimpleW.html");   // enter the URL
	  
	  driver.findElement(By.cssSelector("a[id='d1]'"));
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	   Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector("a[id=\'d1']")).click();
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector("a[name='n1']"));
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.cssSelector("a[class='ç1']")).click();
	  Thread.sleep(1000);
	  driver.navigate().back();
	   Thread.sleep(1000);
	 
	 driver.findElement(By.cssSelector("a[href='http://www.google.com]"));
	 
	}  // end of main
	
}  // end of class


