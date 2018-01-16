
/* hOW DO YOU FIND THE currentelement/sctiveelement or focussed element  */

package popUPFrames11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CBWindowH4 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws Exception

{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	WebElement e=driver.switchTo().activeElement();
	e.sendKeys("admin");
}
}
