package features.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.driver;

public class web_steps {
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String text) throws Throwable {
		WebElement element = driver.browser.findElement(By.xpath("//*[text()='"+text+"']"));
		Actions actions = new Actions(driver.browser);
		actions.moveToElement(element);
		element.isDisplayed();
	}
	
	@Given("^I have enter \"([^\"]*)\" into \"([^\"]*)\"$")
	public void i_have_to_enter_into(String text, String field) throws Throwable {
		WebElement el =driver.browser.findElement(By.xpath("(//LABEL[text()='"+field+"']/..//input)[2]"));
		el.clear();
		el.sendKeys(text);
	}
	
	  @When("^I click on \"([^\"]*)\" button$")
	  public void i_press_on(String button) throws Throwable {
		  driver.browser.findElement(By.xpath("//input[@value='"+button+"']")).click();	  
	  }
	
	@When("^I click on \"([^\"]*)\" link$")
	  public void i_click_on_link(String link) throws Throwable {
		  driver.browser.findElement(By.xpath("(//a[text()='"+link+"'])[1]")).click();
	  }
	
	@When("^I click on \"([^\"]*)\" dropdown menu$")
	  public void i_click_on_dropdown_menu(String dropdown) throws Throwable {
		  WebElement element = driver.browser.findElement(By.xpath("//*[text()='"+dropdown+"']"));
		  Actions actions = new Actions(driver.browser);
		  actions.moveToElement(element).click().perform();
	  }
	
	@When("^I select \"([^\"]*)\" from list$")
	  public void i_select_from_list(String item) throws Throwable {
		WebElement element  = driver.browser.findElement(By.xpath("//text()[contains(.,'"+item+"')]/ancestor::div[1]"));
		Actions actions = new Actions(driver.browser);
		actions.moveToElement(element).click().perform();
	  }
	
	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" dropdown menu$")
	public void i_select_from_dropdown_menu(String option, String dropdown) throws Throwable {
		 WebElement element = driver.browser.findElement(By.xpath("//label[text()='"+dropdown+"']/..//select/option[text()='"+option+"']]"));
		  Actions actions = new Actions(driver.browser);
		  actions.moveToElement(element).click().perform();

	}


}
