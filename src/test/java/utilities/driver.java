package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
	public static WebDriver browser;

    public static void chrome() {
    	System.setProperty("webdriver.chrome.driver", "D:\\Work Space\\WalletHub_Maven\\drivers\\chromedriver.exe");
    	browser = new ChromeDriver();
    	browser.manage().window().maximize();
    }
    
    public static void firefox() {
        System.setProperty("webdriver.gecko.driver","D:\\Work Space\\WalletHub_Maven\\drivers\\geckodriver.exe");
        browser = new FirefoxDriver();
    }
    
    
	public static void visit(String url) {
		browser.get(url);
	}
	
	public static void close() {
		browser.quit();
		
	}

}
