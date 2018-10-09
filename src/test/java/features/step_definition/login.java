package features.step_definition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import utilities.driver;

public class login {
  @Given("^I am on Home page$")
  public void given() throws Throwable {
	  driver.visit("http://www.facebook.com");
  }
  
  @Given("^I Enter \"([^\"]*)\" into (email|password) field$")
  public void i_Enter_into(String arg1, String field) throws Throwable {
	  driver.browser.findElement(By.xpath("//INPUT[@type='"+field+"']")).sendKeys(arg1);
  }
}
