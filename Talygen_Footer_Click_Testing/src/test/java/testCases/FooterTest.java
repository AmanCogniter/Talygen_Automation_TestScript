package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.FooterAction;
import action.LoginAction;
import utils.WebTestBase;

public class FooterTest extends WebTestBase{
	static String Screenname = "<b>Footer</b>"; 
	/*
	 * Check click testing of Footer 
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfFooterPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Footer ");
		FooterAction footerAction = new FooterAction(driver);
		new LoginAction(driver).logoutLogin();
		footerAction.GoToFooterPage();
		
	}
}
