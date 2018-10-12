package features.step_definition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import utilities.driver;

public class login {
  @Given("^I Enter \"([^\"]*)\" into facebook (email|password) field$")
  public void i_Enter_into(String arg1, String field) throws Throwable {
	  driver.browser.findElement(By.xpath("//INPUT[@type='"+field+"']")).sendKeys(arg1);
  }
  
}
