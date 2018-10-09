package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	  
	
	@Before("@firefox")
    public void beforeFirefox(){
		driver.firefox();
        
    }
	@Before("@chrome")
	public void beforeChrome(){
		driver.chrome();    
		}
	
	  @After
	    public void tearDown() {
	       driver.close();
	    }
}
