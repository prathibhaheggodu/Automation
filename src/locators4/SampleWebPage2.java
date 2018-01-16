package locators4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebPage2 {
	
	static
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser
		
		
	}

	
	public static void main(String[] args) throws InterruptedException
	
	{ WebDriver driver=new ChromeDriver();  // open the browser
	
	driver.get("file:///C:/Users/Prathibha%20Heggodu/Desktop/Selenium/html/SampleWebPage2.html");  // geth the url
	
	driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Q");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("S");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/input")).sendKeys("P");
	

	}  // END OF MAIN
} // END OF CLASS
