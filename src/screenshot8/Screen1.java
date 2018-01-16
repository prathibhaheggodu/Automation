package screenshot8;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screen1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost");
		TakesScreenshot t =( TakesScreenshot)driver;
		File srcfile = t.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./photo/Login.png");
		FileUtils.copyFile(srcfile, destfile);
		driver.close();
	}
}
