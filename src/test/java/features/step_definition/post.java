package features.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class post {
	@Given("^I write \"([^\"]*)\" at post area$")
	public void i_write_at_post_area(String text) throws Throwable {
		driver.browser.findElement(By.xpath("//textarea[contains(@title,\"your mind, Mabuzaid?\")]")).click();
		Thread.sleep(5000);
		WebElement el =driver.browser.findElement(By.xpath("//div[@role='textbox']"));
		el.clear();
		el.sendKeys(text);
	}
	
	@When("^I click on facebbok \"([^\"]*)\" button$")
	  public void i_press_on(String button) throws Throwable {
		  driver.browser.findElement(By.xpath("//button/..//span[text()='"+button+"']")).click();	  
	  }

}
