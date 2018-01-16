package pom16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		// create object of constructor to call methods
		LoginPage l = new LoginPage(driver);
		l.setUsername("admin");
		l.setPassword("manager");
		l.clickLogin();
		

	}
}
