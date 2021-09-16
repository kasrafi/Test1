package TestNGSeleniumTest1package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;




public class TestNGSeleniumTest1 {
  
	    WebDriver driver;

	    pomlistcontact objContactPage;

	    @BeforeTest

	    public void setup(){
	    	
	    	//Setting system properties of ChromeDriver
	    	System.setProperty("webdriver.chrome.driver", "/Users/mdsaeedhasan/eclipse/chromedriver"); 

	    	driver= new ChromeDriver ();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.navigate().to("https://www.intelligencebank.com/contact/");

	    }

	    

	    @Test()

	    public void fillinContactPage(){
	    	
             //Create object
	        objContactPage = new pomlistcontact(driver);

	          //set the fields

	        objContactPage.contactPageInfo("mahmuda", "asrafi", "Home","K.asrafi@yahoo.com", "0404040", "Please Email", "Australia", "checked" );
		    

	    

	    Assert.assertTrue(objContactPage.getContactTitle().toLowerCase().contains("Contact Us - IntelligenceBank"));

	   
	    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    try {
	  	  System.out.println("Saving the screenshot");
	        Files.copy(src, new File("/Users/mdsaeedhasan/eclipse-workspace/TestNGSeleniumTest1/src/screenshot.png"));
	    } 
	    catch (IOException e) {
	  	  
	        e.printStackTrace();
	    }

	    driver.quit();	}

	


}
