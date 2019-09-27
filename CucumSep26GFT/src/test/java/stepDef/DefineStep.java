package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefineStep {
	WebDriver driver;
	@Given("John purchase microwave for {int} rs")
	public void john_purchase_microwave_for_doll(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("he has receipt")
	public void he_has_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("user credentials are {string} and {string}")
	public void user_credentials_are_and(String user, String pass) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("email")).sendKeys(user);
		driver.findElement(By .name("password")).sendKeys(pass);
		driver.findElement(By .name("confirmPassword")).sendKeys(pass);
		driver.findElement(By .name("register")).click();
	}

	@When("provided the valid credentials")
	public void provided_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("credentials are verified");
	}

	@Then("Signup is success")
	public void signup_is_success() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	@When("John returns the faulty microwave")
	public void john_returns_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
 
	@Given("App is up")
	public void app_is_up() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
	  	driver=new ChromeDriver();
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get("https://www.amazon.in/");
		//boolean val=driver.findElement(By .linkText("REGISTER")).isDisplayed();
	   
		List<WebElement> lnk_coll=driver.findElements(By .tagName("a"));
		int lnk_count=lnk_coll.size();
		System.out.println(lnk_count);
		for(int i=0;i<=lnk_coll.size()-1;i++) {
			String lnk_name=lnk_coll.get(i).getText();
			System.out.println(lnk_name);
			if(lnk_name.equals("Try Prime")) {
				lnk_coll.get(i).click();
				break;
			}
		}
	/*	if(val==true) {
		   System.out.println("app is opened");
		   driver.findElement(By .linkText("REGISTER")).click();
	   }
	   else
	   {
		   System.out.println("app is not opened");
	   }*/
	   
	}

	@Then("he got refund of {int} doll")
	public void he_got_refund_of_doll(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
}
