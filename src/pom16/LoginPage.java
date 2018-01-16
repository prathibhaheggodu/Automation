package pom16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username") 
	private WebElement unTB; // DECLARATION
	
	@FindBy(name="pwd") 
	private WebElement pwTB; //decalaration
	
	@FindBy(xpath="//div[.='Login ']") 
	private WebElement loginBTN; // declaration
	
	// creating constructor to create object and using refernce variable call methods
	
	public LoginPage(WebDriver driver)  // constructor
	{ PageFactory.initElements(driver, this);  
	}
	
	

	public void setUsername(String un)
	{ unTB.sendKeys(un);  // utilization
	}
	
	public void setPassword(String pw)
	{ pwTB.sendKeys(pw);  //utilization
	}
	
	public void clickLogin()
	{ loginBTN.click();  //utilization
	}

	


	}
	
	
	
    

