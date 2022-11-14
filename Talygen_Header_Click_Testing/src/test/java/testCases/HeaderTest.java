package testCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.HeaderAction;
import action.LoginAction;
import utils.WebTestBase;

public class HeaderTest extends WebTestBase
   {
	static String Screenname = "<b>Header</b>"; 
	/*
	 * Check click testing of Header 
	 */
	@Test(priority=0)
	public void ValidateClickTestingOfHeaderPage()
	{
		test=getTest(Screenname + ": Validation Check of click testing of Header ");
		HeaderAction headerAction = new HeaderAction(driver);
		new LoginAction(driver).logoutLogin();
		headerAction.GoToHeaderPage();
		
	}
}
