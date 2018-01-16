package runtimepolymorphism3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigateDiff {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser
	

	}
	
	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		driver.navigate().to("http://localhost/license.jsp");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
	


}
