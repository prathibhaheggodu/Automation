package loginpage5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver = new ChromeDriver(); // open th browser

		// enters the url and waits till login page is completely loaded
		driver.get("http://localhost/login.do");
		
		  driver.findElement(By.id("username")).sendKeys("admin"); 
		  
		  // enters admin value in username textbox		
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  //enters manager in password textbox
		  driver.findElement(By.xpath("//div[.='Login ']")).click(); // clicks on login goes to home page
		  
		  Thread.sleep(3000);
		  
		  driver.close();
		  
		
	}
}