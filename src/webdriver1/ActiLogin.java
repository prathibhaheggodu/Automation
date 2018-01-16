package webdriver1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin

{
	static 
	
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		// to open chrome browser
	
	}
	
	
	public static void verifyTitle(WebDriver driver, String eTitle)
	{ System.out.println(" Expected:"+eTitle);
	 String aTitle=driver.getTitle();
	 
	 System.out.println("Äctual:"+aTitle);
	 
	 if(aTitle.equals("eTitle"))
	 { System.out.println("Pass:Required page is displayed");
	 
	 }
	 
	 else
	 { System.out.println("Fail:Required page is not displayed");
	 
	 }
	 
	}
	
	
	public static void main(String[] args) throws Exception
	
	{  WebDriver driver=new ChromeDriver();
	
	driver.get("http://localhost/login.do");
	verifyTitle(driver,"actiTIME - Login");
	
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
	Thread.sleep(9000);
	
    verifyTitle(driver,"actiTIME EnterTime-Track");
	}
		
	
}

