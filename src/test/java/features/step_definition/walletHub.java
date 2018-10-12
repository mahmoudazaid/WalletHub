package features.step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.driver;
import cucumber.api.java.en.Given;

public class walletHub {
	@Given("^Rate the site by \"([^\"]*)\" stars$")
	public void rate_the_site_by_stars(String star) throws Throwable {
		WebElement el = driver.browser.findElement(By
				.xpath("//span[contains(text(),'Rating')]"));
		Actions builder = new Actions(driver.browser);
		builder.moveToElement(el).build().perform();
		Thread.sleep(5000);
		driver.browser.findElement(
				By.xpath("//a[contains(text(),'" + star + "')]")).click();
	}

	@Given("^I Enter \"([^\"]*)\" into \"([^\"]*)\" field$")
	public void i_Enter_into_field(String text, String field) throws Throwable {
		driver.browser.findElement(
				By.xpath("//INPUT[contains(@placeholder,'" + field + "')]"))
				.sendKeys(text);
	}

	@Given("^I click on \"([^\"]*)\" WalletHub button$")
	public void i_click_on_WalletHub_button(String button) throws Throwable {
		driver.browser.findElement(
				By.xpath("//button/..//span[text()='" + button + "']")).click();
	}

	@Given("^I select \"([^\"]*)\" from \"([^\"]*)\" dropdownlist$")
	public void i_select_from_dropdownlist(String option, String list)
			throws Throwable {
		driver.browser
				.findElement(
						By.xpath("//div[@class='dropdown-title']/..//span[contains(text(),'"
								+ list + "')]")).click();
		driver.browser.findElement(
				By.xpath("//a[contains(text(),'" + option + "')]")).click();
	}

	@Given("^I write \"([^\"]*)\" into \"([^\"]*)\" textarea$")
	public void i_write_into_textarea(String text, String textarea)
			throws Throwable {
		driver.browser
		.findElement(
				By.xpath("//Label[contains(text(),'"+textarea+"')]/..//TEXTAREA")).sendKeys(text);
	}
	
	@Given("^I hover on \"([^\"]*)\"$")
	public void i_hover_on(String el) throws Throwable {
		WebElement element = driver.browser.findElement(By
				.xpath("//span[contains(text(),'" + el + "')]"));
		Actions builder = new Actions(driver.browser);
		builder.moveToElement(element).build().perform();
	}
	
	@Given("^I rate \"([^\"]*)\" as overall rate$")
	public void i_rate_as_overall_rate(String rate) throws Throwable {
		WebElement el=driver.browser
		.findElement(By.xpath("(//span[@id='overallRating']/a)["+rate+"]"));
		Actions actions = new Actions(driver.browser);
		actions.moveToElement(el).click().perform();

	}
}
