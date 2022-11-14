package action;

import org.openqa.selenium.WebDriver;

import pageObjects.FooterPage;

public class FooterAction {
	WebDriver driver ; 
	FooterPage footerPage;
	
	public FooterAction(WebDriver driver)
	{
		this.driver= driver;
		footerPage= new FooterPage(driver);
	}
	
	
	/*Method  for  Click testing of Footer */
	public void GoToFooterPage()
	{
		
		footerPage.clickOnContributeABetterTranslation();
		//footerPage.clickOnsaveButton();
		//footerPage.VerifyMandatoryFieldValidation();
		footerPage.clickOnCloseButton();
		footerPage.clickOnFeedback();
		footerPage.clickOnCancelButton();
		footerPage.clickOnTermsofServicek();
		footerPage.clickOnAboutTalygen();
		footerPage.clickOnAboutUS();
		footerPage.clickOnOurMission();
		footerPage.clickOnContactus();
		footerPage.clickOnHelp();
		footerPage.clickOnTALYGENSupport();
		footerPage.clickOnFooterLogo();
		
		
	}
}

