package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AddGroupPage;
import pageobjects.TicketGroupListingPage;

public class TicketGroupListingAction {

	WebDriver driver;

	TicketGroupListingPage ticketGroupListingPage;

	public TicketGroupListingAction(WebDriver driver) {
		this.driver = driver;
		this.ticketGroupListingPage = new TicketGroupListingPage(driver);

	}

	public void navigateGroupListing() {
		ticketGroupListingPage.clickFullMenu();
		ticketGroupListingPage.clickTicketingOption();
		ticketGroupListingPage.clickTicketingGroup();
	}

	public void addGroup() {
		ticketGroupListingPage.clickAddGroup();
	}

}
