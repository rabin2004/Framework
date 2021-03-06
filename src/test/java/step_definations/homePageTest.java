package step_definations;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.homePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homePageTest extends ReadPropertyFile {
	WebDriver driver;
	public String url = "https://www.capitalone.com/";
	public homePage hm;
	public Properties prop;

	public homePageTest() {
		driver=Hooks.driver;
	}
	
	@Given ("^user is already in the homepage$")
	public void userIsAlreadyInThehomepage() {
		driver.get(url);
	}
	
	 @When ("^user enters invalid \"(.*)\" and \"(.*)\"$")
	 public void userEntersInvalidUsernameAndPassword(String username, String password) {
		 hm.typeUserName(prop.getProperty(username));
		 hm.typePassword(prop.getProperty(password));
	 }
	 
	 @And ("^clicks on sign-in button$")
	 public void clicksOnSignInButton() {
		 hm.clickSignInBtn();
	 }
	 
	  @Then ("^user should not be allowed to sign-in$")
	  public void userShouldNotBeAllowedToSignIn() {
		  String Error = driver.findElement(By.xpath("/html/body/app-root/div/div/app-error/ci-message-page/div/h1")).getText();
		  Assert.assertEquals(Error, "Did you forget something?");
	  }
}
