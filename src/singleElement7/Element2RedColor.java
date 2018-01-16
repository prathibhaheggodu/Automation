package singleElement7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Element2RedColor {
	
	static
	
	{ System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser
	
	}			

	 public static void main(String[] args) throws Exception,InterruptedException 
	 
	 {   WebDriver driver=new ChromeDriver(); // open the browser
	 
	 driver.get("http://localhost/login.do");  // enter the url 
	   
	 driver.findElement(By.xpath("//div[.='Login ']")).click();
	 
	 Thread.sleep(2000);
	 
	 String xp="//span[contains(.,'invalid')]";
	 
	 WebElement errMsg=driver.findElement(By.xpath(xp));
	 
	 String rgbColor=errMsg.getCssValue("color");
	 
	 System.out.println(rgbColor);
	 
	 String hexColor=Color.fromString(rgbColor).asHex();//  to get hexadecimal value of color code
	 
	 System.out.println(hexColor);
	 
	 if(hexColor.equals("#ce0100"))
		 
	 { System.out.println(" Pass: Error message is in red color");}
	 
	 else
	 { System.out.println(" Fail: Error message is not in red COLOR" );
	 
	 }
		 
	 }
	 
}
