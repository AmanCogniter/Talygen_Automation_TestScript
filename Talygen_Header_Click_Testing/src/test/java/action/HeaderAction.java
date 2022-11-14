package action;

import org.openqa.selenium.WebDriver;

import pageObjects.HeaderPage;

public class HeaderAction {
	WebDriver driver ; 
	HeaderPage headerPage;
	
	public HeaderAction(WebDriver driver)
	{
		this.driver= driver;
		headerPage= new HeaderPage(driver);
	}
	
	
	/*Method  for  Click testing of Header  */
	public void GoToHeaderPage()
	{
		
		
		  headerPage.clickOnTourGuide(); 
		  headerPage.clickOnMore();
		  headerPage.clickOnCloseTourGuide(); 
		  headerPage.clickOnDeleteSampleData();
		  headerPage.clickOnCancel(); 
		  headerPage.clickOnWizard();
		  headerPage.clickOnCloseWizard();
		  headerPage.clickOnTimer();
		  headerPage.clickOnCloseTimeTrack(); 
		  headerPage.clickOnFullScreen();
		  headerPage.clickOnCommunication(); 
		  headerPage.clickOnNotification();
		  headerPage.clickOnBookmark(); 
		  headerPage.clickOnCancelBookmark();
		  headerPage.clickOnDashBoard();
		  headerPage.clickOnFullMenu();
		  headerPage.clickOnMyProfile();
		  headerPage.clickOnLanguage();
		  headerPage.clickOnMenu();
		  headerPage.clickOnMenuForDefaultSetting();
		  headerPage.clickOnTheme();
		  headerPage.clickOnSetDefaultTheme();
		  headerPage.clickOnMyProfileNotification();
		  headerPage.clickOnMyProfileHelp();
		
	}
}
