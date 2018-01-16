package interviewque6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxF {
	
static
	
	{ String key="webdriver.chrome.driver";
	  String value="./driver/chromedriver.exe";
	  System.setProperty(key,value);
	  
	}			

	 public static void main(String[] args) 
	 
	 { WebDriver driver=new ChromeDriver();
	 
	 driver.get("http://localhost/login.do");
	 WebElement chkBox=driver.findElement(By.name("remember"));
	 
	 chkBox.click();
	 if(chkBox.isSelected())
		 
	 {
		 System.out.println("Pass:Check box is selected");
		 
	 }
	 else
		 
	 {   System.out.println("Fail:Check box is not selected");
	 
		 }
	 }
	 
	
}
