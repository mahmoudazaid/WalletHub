package features.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.driver;

public class web_steps {
	
	@Given("^I am on \"([^\"]*)\" url$")
	  public void given(String url) throws Throwable {
		  driver.visit(url);
	  }
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String text) throws Throwable {
		WebElement element = driver.browser.findElement(By.xpath("//*[contains(text(),'"+text+"')]"));
		Actions actions = new Actions(driver.browser);
		actions.moveToElement(element);
		element.isDisplayed();
	}
	
	  @When("^I click on \"([^\"]*)\" button$")
	  public void i_press_on(String button) throws Throwable {
		  driver.browser.findElement(By.xpath("//input[@value='"+button+"']")).click();	  
	  }
	
	@When("^I click on \"([^\"]*)\" link$")
	  public void i_click_on_link(String link) throws Throwable {
		  driver.browser.findElement(By.xpath("(//a[contains(text(),'"+link+"')])[1]")).click();
	  }
}
