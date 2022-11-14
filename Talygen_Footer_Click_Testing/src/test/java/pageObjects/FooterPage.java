package pageObjects;

import static reporting.ComplexReportFactory.getTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import utils.WebBasePage;

public class FooterPage extends WebBasePage{
	WebDriver driver ;
	public FooterPage(WebDriver driver) {
		super(driver, "FooterPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Code for click testing of Footer
	 */
	
     public void clickOnContributeABetterTranslation()
     {		//staticWait(5000);
     WebDriverWait wait = new WebDriverWait(driver,50);
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/span[@id='ContributeToLang']")));
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 */
			 
			
			  WebElement contribute =
			  driver.findElement(By.xpath("//div/span[@id='ContributeToLang']")); Actions
			  action = new Actions(driver);
			  action.moveToElement(contribute).doubleClick().perform();
			  logger.info("Contribute a better translation Clicked succesfully");
    	// click(By.xpath("//div/span[@id='ContributeToLang']"),"Contribute a better translation", 30);
    	
    	 try {
    		 staticWait(3000);
    		 WebElement contributeToLang = driver.findElement(By.xpath("//div/h5[text()='Contribute a better translation']"));
    		 if (contributeToLang.isDisplayed()) {
				logger.info("Contribute a better translation Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Contribute a better translation Page not opened succesfully");
		}
     }
     public void clickOnsaveButton() {
 		staticWait(3000);
         clickByJavascript(By.xpath("//div/span/a[@data-original-title='Save']"), "Save Button", 30);
         
     }
     public void VerifyMandatoryFieldValidation() {
 		int i = 0;
 		String actualText;
 		String expectedText;

 		List<WebElement> errorMessageLocator = findMultipleElement(By.xpath("//span[contains(@class,'field-validation-valid text-danger')]"), 45);
 		String[] expectedValue = {"Current Text","Suggestion"};
 		for (Object expected : expectedValue) {
 			WebElement AsteriskField = findElementVisibility(By.xpath("//label[text()='"+ expected +"']/ancestor::div[@class='form-group']/descendant::span[@class='mandatory']"), 45);
 			if (AsteriskField != null) {
 				getTest().log(LogStatus.PASS, "The Asterisk symbol is displayed for " + expected + " field");
 				logger.info("The Asterisk symbol is displayed for " + expected + " field");
 			} else {
 				getTest().log(LogStatus.FAIL, "The Asterisk symbol is not displayed for " + expected + " field");
 				logger.info("The Asterisk symbol is not displayed for " + expected + " field");
 				takeScreenshot(expected.toString());
 			}

 			List<WebElement> expectedElements = errorMessageLocator;
 			for (WebElement element : expectedElements) {
 				i++;
 				actualText = element.getText();
 				expectedText = expected.toString();

 				if (actualText.indexOf(expectedText) != -1) {
 					getTest().log(LogStatus.PASS,
 							"Error message for \"" + expected + "\" field is displayed as expected");
 					logger.info("Error message for \"" + expected + "\" field is displayed as expected");
 					i = 0;
 					break;
 				} else if (i == expectedValue.length && !element.getText().contains(expectedText)) {
 					getTest().log(LogStatus.FAIL, "Error message for \"" + expected + "\" field is not displayed");
 					logger.info("Error message for \"" + expected + "\" field is displayed as expected");
 					takeScreenshot(expectedText);
 				}
 			}

 		}
 	}
     public void clickOnCloseButton() {
  		staticWait(3000);
          click(By.xpath("//div/h5[text()='Contribute a better translation']/ancestor::div[@class='modal-content']/descendant::button[@data-original-title='Close']"), "Close Button", 30);
          
      }
     public void clickOnFeedback()
     {		staticWait(2000);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Feedback']"),"FeedBack", 30);
    	
    	 try {
    		 WebElement feedBack = driver.findElement(By.xpath("//div/span[text()='Feedback']"));
    		 if (feedBack.isDisplayed()) {
				logger.info("Feedback Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Feedback Page not opened succesfully");
		}
     }
    
     public void clickOnCancelButton() {
   		staticWait(3000);
           click(By.xpath("//div/a[text()='Cancel']"), "Cancel Button", 30);
           
       }
     public void clickOnTermsofServicek()
     {		staticWait(2000);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Terms of Service']"),"Terms of Service", 30);
    	
    	 try {
    		 WebElement termsofService = driver.findElement(By.xpath("//div/span[text()='Terms & Conditions']"));
    		 if (termsofService.isDisplayed()) {
				logger.info("Terms & Conditions Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Terms & Conditions Page not opened succesfully");
		}
     }
     public void clickOnAboutTalygen()
     {		staticWait(2000);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='About Talygen']"),"About Talygen", 30);
    	
    	 try {
    		 WebElement aboutUs = driver.findElement(By.xpath("//div/span[text()='About Us']"));
    		 if (aboutUs.isDisplayed()) {
				logger.info("About Us Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("About Us Page not opened succesfully");
		}
     }
     public void clickOnAboutUS()
     {		staticWait(2000);
			 
     
    	 click(By.xpath("//div/ul/li/a[text()='About Us']"),"About Us", 30);
    	// Store the current window handle
		 String winHandleBefore = driver.getWindowHandle();

		 // Perform the click operation that opens new window

		 // Switch to new window opened
		 for(String winHandle : driver.getWindowHandles()){
		     driver.switchTo().window(winHandle);
		 }

    	 try {
    		 staticWait(3000);
    		 WebElement aboutUs = driver.findElement(By.xpath("//div/h1/font/font[text()='About Us']"));
    		 if (aboutUs.isDisplayed()) {
				logger.info("About Us Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("About Us Page not opened succesfully");
		}
    	 staticWait(2000);
	    	// Switch back to original browser (first window)
			 driver.switchTo().window(winHandleBefore); 

		 // Continue with original browser (first window)

     }
     public void clickOnOurMission()
     {		staticWait(2000);
			 
     
    	 click(By.xpath("//div/ul/li/a[text()='Our Mission']"),"Our Mission", 30);
    	// Store the current window handle
		 String winHandleBefore = driver.getWindowHandle();

		 // Perform the click operation that opens new window

		 // Switch to new window opened
		 for(String winHandle : driver.getWindowHandles()){
		     driver.switchTo().window(winHandle);
		 }

    	 try {
    		 staticWait(3000);
    		 WebElement aboutUs = driver.findElement(By.xpath("//div/h1[text()='Our Mission']"));
    		 if (aboutUs.isDisplayed()) {
				logger.info("Our Mission Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Our Mission Page not opened succesfully");
		}
    	 staticWait(2000);
	    	// Switch back to original browser (first window)
			 driver.switchTo().window(winHandleBefore); 

		 // Continue with original browser (first window)

     }
     public void clickOnContactus()
     {		staticWait(2000);
			 
     
    	 click(By.xpath("//div/ul/li/a[text()='Contact us']"),"Contact us", 30);
    	// Store the current window handle
		 String winHandleBefore = driver.getWindowHandle();

		 // Perform the click operation that opens new window

		 // Switch to new window opened
		 for(String winHandle : driver.getWindowHandles()){
		     driver.switchTo().window(winHandle);
		 }

    	 try {
    		 staticWait(3000);
    		 WebElement contactUs = driver.findElement(By.xpath("//div/h1[text()='Contact Us']"));
    		 if (contactUs.isDisplayed()) {
				logger.info("Contact us Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Contact us Page not opened succesfully");
		}
    	 staticWait(2000);
	    	// Switch back to original browser (first window)
			 driver.switchTo().window(winHandleBefore); 

		 // Continue with original browser (first window)

     }
     public void clickOnHelp()
     {		staticWait(2000);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Help']"),"Help", 30);
    	
    	 try {
    		 WebElement help = driver.findElement(By.xpath("//div/span[text()='Help']"));
    		 if (help.isDisplayed()) {
				logger.info("Help Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Help Page not opened succesfully");
		}
     }
    
     public void clickOnTALYGENSupport()
     {		staticWait(2000);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='TALYGEN Support']"),"TALYGEN Support", 30);
    	
    	 try {
    		 WebElement tALYGENSupport = driver.findElement(By.xpath("//div/span[text()='Ticketing']"));
    		 if (tALYGENSupport.isDisplayed()) {
				logger.info("Ticketing Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Ticketing Page not opened succesfully");
		}
     }
     public void clickOnFooterLogo()
     {		staticWait(2000);
			
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
     
    	 click(By.xpath("(//div/a/img[@alt='footer-logo'])[last()]"),"Footer Logo", 30);
    	
    	 try {
    		 WebElement footerLogo = driver.findElement(By.xpath("//div[@class='logo']"));
    		 if (footerLogo.isDisplayed()) {
				logger.info("Home page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Home Page not opened succesfully");
		}
     }
    
}
