package TestNGSeleniumTest1package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class pomlistcontact {
	 protected WebDriver driver;
	
	 By titleText =By.xpath("/html/head/title");
	  //first name
	  private By firstname= By.id("firstname-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");

	  //last name
	  private By lastname = By.id("lastname-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");

	  //company name
	  private By companyname= By.id("company-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");

	  //Email
	  private By email= By.id("email-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");
	  
	  //mobile
	  private By mobile= By.id("mobilephone-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");
	  
	  //enquiry
	  private By enquiry= By.id("enquiry_details-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");

	//country
	  private By country= By.id("country-2aed303f-75a8-4d3d-8446-5a3860ce79cd_8565");

	  //chkbox
	  private By chkbox= By.name("i_agree_to_intelligencebank_s_terms_and_conditions");

	  
	  public pomlistcontact(WebDriver driver)
	  {
	    this.driver = driver;
	  }
	  
	//Set first name

	    public void setfirstName(String firstName)
	    {

	        driver.findElement(firstname).sendKeys(firstName);

	    }
	    
	  //Set last name

	    public void setlastName(String lastName)
	    {

	        driver.findElement(lastname).sendKeys(lastName);

	    }

	    //Set company name 

	    public void setCompanyName(String companyName)
	    {

	        driver.findElement(companyname).sendKeys(companyName);
	    }
	    
	    //Set Email
	    
	    public void setEmail(String eMail)
	    {

	        driver.findElement(email).sendKeys(eMail);
	    }
	    
	    
   //Set Mobile
	    
	    public void setMobile(String mobileNumber)
	    {

	        driver.findElement(mobile).sendKeys(mobileNumber);
	    }
	    
	    //set enquiry
	    public void setEnquiry(String enquiryText)
	    {

	        driver.findElement(enquiry).sendKeys(enquiryText);
	    }
	    
	  //set country
	    public void selectCountry(String countryName)
	    {
	    	Select countryname= new Select (driver.findElement(country));
	    			countryname.selectByVisibleText(countryName);
	    }
	    
	    
	    //set the checkbox
	    public void setCheckbox(String checked)
	    {
	    	driver.findElement(chkbox).click();
	    }
	    
	  //Get the title of Contact Page

	    public String getContactTitle()
	    {

	     return    driver.findElement(titleText).getText();

	    }

	   

	    public void contactPageInfo(String firstName,String lastName, String companyName, String eMail, String mobileNumber, String Enquiry, String countryName, String isChecked )
	    {

	        this.setfirstName(firstName);
	        this.setlastName(lastName);
	        this.setCompanyName(companyName);
	        this.setEmail(eMail);
	        this.setMobile(mobileNumber);
	        this.setEnquiry(Enquiry);
	        this.selectCountry(countryName);
	        this.setCheckbox(isChecked);

	              
	    }


}

