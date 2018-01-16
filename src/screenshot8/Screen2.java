package screenshot8;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screen2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws IOException {
		
		Date d=new Date();
		String s=d.toString();
		System.out.println(s);
		String s2=s.replaceAll(":", "_");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost");
		TakesScreenshot t =( TakesScreenshot)driver;
		File srcfile = t.getScreenshotAs(OutputType.FILE);
		//File destfile = new File("G:/"+s2+"LOgin.png");
		File destfile = new File("./photo/"+s2+".png");
		FileUtils.copyFile(srcfile, destfile);
	}
}
