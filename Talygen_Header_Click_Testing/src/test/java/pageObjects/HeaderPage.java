package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import utils.WebBasePage;

public class HeaderPage extends WebBasePage{
	WebDriver driver ;
	public HeaderPage(WebDriver driver) {
		super(driver, "HeaderPage");
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Code for click testing of Header
	 */
	
     public void clickOnTourGuide()
     {		staticWait(3000);
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 */
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Tour Guide']"),"Tour Guide", 30);
    	
    	 try {
    		 WebElement tourGuide = driver.findElement(By.xpath("//div/h4[text()='Tour guides']"));
    		 if (tourGuide.isDisplayed()) {
				logger.info("Tour Guide Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Tour Guide Page not opened succesfully");
		}
     }
     public void clickOnMore() {
  		staticWait(2000);
  		click(By.xpath("//div/button[text()='More']"),"More Button", 30); 
          
      }
     public void clickOnCloseTourGuide() {
 		staticWait(1000);
 		click(By.xpath("//div/h4[text()='Tour guides']/ancestor::div[@id='DivTourPlayContent']/descendant::button[@class='close']")," Close Tour Guide", 30); 
         
     }
     public void clickOnDeleteSampleData()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Delete Sample Data']"),"Delete Sample Data", 30);
    	
    	 try {
    		 WebElement deleteSampleData = driver.findElement(By.xpath("//div[text()='Do you want to delete sample data ?']"));
    		 if (deleteSampleData.isDisplayed()) {
				logger.info("Delete Sample Data Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Delete Sample Data Page not opened succesfully");
		}
     }
     public void clickOnCancel() {
  		staticWait(1000);
  		click(By.xpath("//div/button[@title='Cancel']")," Cancel Button", 30); 
          
      }
     public void clickOnWizard()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Wizard']"),"Wizard", 30);
    	
    	 try {
    		 WebElement wizard = driver.findElement(By.xpath("//div/h4[text()='Wizards']"));
    		 if (wizard.isDisplayed()) {
				logger.info("Wizard Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Wizard Page not opened succesfully");
		}
     }
     public void clickOnCloseWizard() {
   		staticWait(1000);
   		click(By.xpath("//div/h4[text()='Wizards']/ancestor::div[@class='modal-content']/descendant::button[@class='close']")," Close Wizard", 30); 
           
       }
     public void clickOnTimer()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Timer']"),"Timer", 30);
    	
    	 try {
    		 WebElement timer = driver.findElement(By.xpath("//div/h4[text()='Time Track']"));
    		 if (timer.isDisplayed()) {
				logger.info("Time Track opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Time Track not opened succesfully");
		}
     }
     public void clickOnCloseTimeTrack() {
    		staticWait(1000);
    		click(By.xpath("//button[@id='closeTimer']"),"Close Time Track", 30); 
            
        }
     public void clickOnFullScreen() {
 		staticWait(2000);
 		click(By.xpath("//div/ul/li/a[@data-original-title='Full Screen']"),"Full Screen", 30);
 		staticWait(1000);
 		click(By.xpath("//div/ul/li/a[@data-original-title='Full Screen']"),"Exit From Full Screen", 30);
         
     }
     public void clickOnCommunication()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Communication']"),"Communication", 30);
    	// Store the current window handle
    			 String winHandleBefore = driver.getWindowHandle();

    			 // Perform the click operation that opens new window

    			 // Switch to new window opened
    			 for(String winHandle : driver.getWindowHandles()){
    			     driver.switchTo().window(winHandle);
    			 }
    	 try {
    		 WebElement communication = driver.findElement(By.xpath("//div/h2[text()='Chat']"));
    		 if (communication.isDisplayed()) {
				logger.info("Communication Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Communication Page not opened succesfully");
		}
    	 staticWait(2000);
	    	// Switch back to original browser (first window)
			 driver.switchTo().window(winHandleBefore); 

		 // Continue with original browser (first window)
     }
     public void clickOnNotification()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Notifications']"),"Notification", 30);
    	
    	 try {
    		 WebElement notificationPopUp = driver.findElement(By.xpath("//div[@id='divinbox_listdata']"));
    		 if (notificationPopUp.isDisplayed()) {
				logger.info("Notification PopUp opened succesfully");
				 click(By.xpath("//div/a[@id='anccrossicon']/i"),"Notification Popup Closed", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Notification Popup not opened succesfully");
		}
     }
     public void clickOnBookmark()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Bookmark']"),"Bookmark", 30);
    	
    	 try {
    		 WebElement bookmarkPopUp = driver.findElement(By.xpath("//div/h5[text()='Bookmark']"));
    		 if (bookmarkPopUp.isDisplayed()) {
				logger.info("Bookmark PopUp opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Bookmark Popup not opened succesfully");
		}
     }
     public void clickOnCancelBookmark() {
    		staticWait(2000);
    		click(By.xpath("//div/a[@data-original-title='Cancel']")," Cancel Button", 30); 
            
        }
     public void clickOnDashBoard()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Dashboard']"),"DashBoard", 30);
    	
    	 try {
    		 WebElement dashBoard = driver.findElement(By.xpath("//div/span[text()='My Shortcuts']"));
    		 if (dashBoard.isDisplayed()) {
				logger.info("My Shortcuts Page opened succesfully");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("My Shortcuts page not opened succesfully");
		}
     }
     public void clickOnFullMenu()
     {		staticWait(3000);
			
     
    	 click(By.xpath("//div/ul/li/a[@data-original-title='Full Menu']"),"Full Menu", 30);
    	
    	 try {
    		 WebElement fullMenu = driver.findElement(By.xpath("//div/input[@name='search']"));
    		 if (fullMenu.isDisplayed()) {
				logger.info("Full Menu Page opened succesfully");
				click(By.xpath("//div/ul/li/a[@data-original-title='Full Menu']")," Close Full Menu", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Full Menu page not opened succesfully");
		}
     }
     public void clickOnMyProfile()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("(//ul/li/a[@data-original-title='My Profile'])[last()]"),"My Profile", 30);
    	 try {
    		 WebElement userProfile = driver.findElement(By.xpath("//div/span[text()='User Profile']"));
    		 if (userProfile.isDisplayed()) {
				logger.info("User Profile Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("User Profile page not opened succesfully");
		}
     }
     public void clickOnLanguage()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//*[@id='navbarResponsive']/ul/li[16]/ul/li[2]/a"),"Language", 30);
    	 try {
    		 WebElement language = driver.findElement(By.xpath("//div/li/a[text()='English']"));
    		 if (language.isDisplayed()) {
				logger.info("Language Dropdown Popup opened succesfully");
				staticWait(1000);
				click(By.xpath("//div/li/a[text()='English']"),"English", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Language Dropdown Popup not opened succesfully");
		}
     }
     public void clickOnMenu()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//*[@id='navbarResponsive']/ul/li[16]/ul/li[3]/a"),"Menu", 30);
    	 try {
    		 WebElement menu = driver.findElement(By.xpath("//*[@id='menu-position']/li[2]/a"));
    		 if (menu.isDisplayed()) {
				logger.info("Menu Dropdown Popup opened succesfully");
				staticWait(1000);
				Actions action=new Actions(driver);
				action.moveToElement(menu).click().perform();
				//clickByJavascript(By.xpath("//*[@id='menu-position']/li[2]/a"),"Left", 30);
				logger.info("Left Clicked successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Menu Dropdown Popup not opened succesfully");
		}
     }
     public void clickOnMenuForDefaultSetting()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//*[@id='navbarResponsive']/ul/li[16]/ul/li[3]/a"),"Menu", 30);
    	 try {
    		 WebElement menu = driver.findElement(By.xpath("//*[@id='menu-position']/li[1]/a"));
    		 if (menu.isDisplayed()) {
				logger.info("Menu Dropdown Popup opened succesfully");
				staticWait(1000);
				Actions action=new Actions(driver);
				action.moveToElement(menu).click().perform();
				//clickByJavascript(By.xpath("//*[@id='menu-position']/li[2]/a"),"Left", 30);
				logger.info("Top Clicked successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Menu Dropdown Popup not opened succesfully");
		}
     }
     public void clickOnTheme()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//div[@id='navbarResponsive']/ul/li[16]/ul/li[4]/a"),"Theme", 30);
    	 try {
    		 WebElement theme = driver.findElement(By.xpath("//ul/li/a[text()='Dark']"));
    		 if (theme.isDisplayed()) {
				logger.info("Theme Dropdown Popup opened succesfully");
			
				click(By.xpath("//ul/li/a[text()='Dark']"),"Dark Theme", 30);
				staticWait(3000);
				 String buttonColor = driver.findElement(By.xpath("//div[@id='divAttForm']")).getCssValue("background-color");
			        //String buttonTextColor = driver.findElement(By.name("submit")).getCssValue("color");
			        System.out.println("Button color: " + buttonColor);
			       // System.out.println("Text color " + buttonTextColor);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Theme Dropdown Popup not opened succesfully");
		}
    	 
		 
     }
     public void clickOnSetDefaultTheme()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//div[@id='navbarResponsive']/ul/li[16]/ul/li[4]/a"),"Theme", 30);
    	 try {
    		 WebElement theme = driver.findElement(By.xpath("//ul/li/a[text()='Light']"));
    		 if (theme.isDisplayed()) {
				logger.info("Theme Dropdown Popup opened succesfully");
				staticWait(1000);
				click(By.xpath("//ul/li/a[text()='Light']"),"Light Theme", 30);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Theme Dropdown Popup not opened succesfully");
		}
     }
     public void clickOnMyProfileNotification()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//div[@id='navbarResponsive']/ul/li[16]/ul/li[5]/a"),"Notification", 30);
    	 try {
    		 WebElement notification = driver.findElement(By.xpath("//table/thead/tr/th[text()='Manage Notifications']"));
    		 if (notification.isDisplayed()) {
				logger.info("Manage Notifications Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Manage Notifications page not opened succesfully");
		}
     }
 	
     public void clickOnMyProfileHelp()
     {		staticWait(3000);
		click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"),"My Profile Logo", 30);
		click(By.xpath("//div[@id='navbarResponsive']/ul/li[16]/ul/li[6]/a"),"Help", 30);
    	 try {
    		 WebElement help = driver.findElement(By.xpath("//div/span[text()='Help']"));
    		 if (help.isDisplayed()) {
				logger.info("Help Page opened succesfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Help page not opened succesfully");
		}
     }
		/*
		 * public void clickOnMyProfilePolicy() { staticWait(3000);
		 * click(By.xpath("//div/ul/li/a[@data-original-title='My Profile']"
		 * ),"My Profile Logo", 30);
		 * click(By.xpath("//a[@id='DashboardPolicy']"),"Help", 30); try { WebElement
		 * help = driver.findElement(By.xpath("//div/span[text()='Help']")); if
		 * (help.isDisplayed()) { logger.info("Help Page opened succesfully"); } } catch
		 * (Exception e) { // TODO: handle exception
		 * logger.info("Help page not opened succesfully"); } }
		 */
 	
}
