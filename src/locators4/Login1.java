
package locators4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	
	static
	
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");  // to open chrome browser
		
	}
	
	
	public static void main(String[] args) throws Exception
	
	
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Prathibha%20Heggodu/Desktop/Selenium/html/Login1.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		
		
	}


}