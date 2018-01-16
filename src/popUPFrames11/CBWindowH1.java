/* HANDLING CHILD Browser popup  */

package popUPFrames11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBWindowH1 {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
	}
	public static void main(String[] args) throws Exception
	
	{
		WebDriver driver=new ChromeDriver();
		
		System.out.println(driver);
		
		String str=driver.getWindowHandle();
		System.out.println(str);
		
	}
	
	

}
