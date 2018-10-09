package features.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.driver;
import cucumber.api.java.en.Given;

public class post {
	@Given("^I write \"([^\"]*)\" at post area$")
	public void i_write_at_post_area(String text) throws Throwable {
		WebElement el =driver.browser.findElement(By.xpath("//SPAN[text()='Compose Post']/../../../../..//DIV[@data-offset-key='4n02q-0-0']"));
		el.clear();
		el.sendKeys(text);
	}

}
