package locators4;
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SimpleWebPage1 {
		
	static
		
		{ String key="webdriver.chrome.driver";
		  String value="./driver/chromedriver.exe";
		  System.setProperty(key,value);   // to open chrome browser
		  
		}			

		 public static void main(String[] args) throws Exception
		 
		 {   WebDriver driver=new ChromeDriver(); // open the browser
		 
		     driver.get("file:///C:/Users/Prathibha%20Heggodu/Desktop/SimpleW.html");  // enter the URL
		     
		    /* WebElement element=driver.findElement(By.tagName("a"));  // to find the element using tagname
		     
		        element.click();   // click on that element   */
		     
		     driver.findElement(By.tagName("a")).click();  // optimised code
		     
		     Thread.sleep(1000);
		     
		     driver.findElement(By.className("c1")).click();
		     
		     Thread.sleep(1000);
		     
		     driver.findElement(By.name("n1")).click();
		     Thread.sleep(1000);
		     
		     
		     driver.findElement(By.linkText("Goole")).click();
		     Thread.sleep(1000);
		     
		     driver.findElement(By.partialLinkText("Goo")).click();
		     
		     Thread.sleep(1000);
		    		 
		     
		 }

	}



