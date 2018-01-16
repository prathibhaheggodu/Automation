// get the title and print ,Home page--Logout get the title and print -Login page

package synchronization14;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageTitle {
	
	static
	
	{ System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

    }
 public static void main(String[] args) throws Exception
 {  WebDriver driver=new ChromeDriver();  // open the browser
   driver.get("http://localhost/login.do");
   
// enters the url and waits till login page is completely loaded
	  driver.findElement(By.id("username")).sendKeys("admin");
	  // enters admin value in username textbox
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  //enters manager in password textbox
	  driver.findElement(By.xpath("//div[.='Login ']")).click(); // clicks on login
	  
	  //----------Explicitly Wait-----------------
	  
	  WebDriverWait wait=new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.titleContains("Enter"));
	  
	  // searches for title containing Enter
	  
	  String title=driver.getTitle(); // get the address of the title
	  System.out.println(title); // prints the title
	  
	  driver.findElement(By.id("logoutLink")).click();
	  
	  wait.until(ExpectedConditions.titleContains("Login"));
	  
	  String title2=driver.getTitle(); //gets the login title
	  
	  System.out.println(title2);  // prints login title
	  
	  
 }}
	  		
	  
	  