package testcases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import action.AddGroupAction;
import action.LoginAction;
import action.TicketGroupListingAction;
import utils.WebTestBase;

public class TicketingGroupTest extends WebTestBase {

	@Test(priority = 0)
	public void verifyAddGroup() {

		test = getTest("TC_Ticketing_Ticketing_Group_157,163,166,188,177,179,187");
		new LoginAction(driver).logoutLogin();
		TicketGroupListingAction ticketingListingAction = new TicketGroupListingAction(driver);
		AddGroupAction addGroupAction = new AddGroupAction(driver);
		ticketingListingAction.navigateGroupListing();
		ticketingListingAction.addGroup();
		addGroupAction.addGroup();
		  
	}

}
