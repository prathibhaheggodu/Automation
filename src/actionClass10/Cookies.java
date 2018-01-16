package actionClass10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();  // to delete the cookies
		 
	}

}
