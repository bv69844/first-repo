package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrmdemo {

	WebDriver driver ;
	@Given("I load the url {string}")
	public void i_load_the_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	 
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
		
	}

	@Then("I enter {string} into element {string}")
	public void i_enter_into_element(String inputText, String locator) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name(locator)).sendKeys(inputText);
		
	}

	@Then("I click the element {string}")
	public void i_click_the_element(String locator) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath(locator)).click();
	}

}
