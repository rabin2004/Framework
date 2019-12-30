package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	WebDriver driver;
	
	@FindBy(id="no-acct-uid")
	WebElement userName;
	
	@FindBy(id="no-acct-pw")
	WebElement password;
	
	@FindBy(id="no-acct-submit")
	WebElement signInBtn;
	
	public homePage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeUserName(String Username) {
		userName.sendKeys(Username);
	}
	
	public void typePassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}

}
