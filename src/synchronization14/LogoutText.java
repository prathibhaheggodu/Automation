// Getting text of Logout link after login


package synchronization14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutText

{
	static
	{ System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)
	
	{ WebDriver driver=new ChromeDriver();
	
	// implicitly wait
	  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	// TimeUnit enum and SECONDS constant
	  driver.get("http://localhost/login.do"); 
	  // enters the url and waits till login page is completely loaded
	  driver.findElement(By.id("username")).sendKeys("admin");
	  // enters admin value in username textbox
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  //enters manager in password textbox
	  driver.findElement(By.xpath("//div[.='Login ']")).click(); // clicks on login
	  
	  //------------------
	
	  WebElement logout=driver.findElement(By.id("logoutLink"));  //gets address  of logout
	  String text=logout.getText(); // gets text of logout
	  System.out.println(text);  //prints text
	
	
	}

}
