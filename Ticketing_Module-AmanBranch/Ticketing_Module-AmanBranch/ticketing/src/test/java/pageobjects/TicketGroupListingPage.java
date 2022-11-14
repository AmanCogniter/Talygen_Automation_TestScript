package pageobjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class TicketGroupListingPage extends WebBasePage {
	
	
	WebDriver driver;

	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();

	public TicketGroupListingPage(WebDriver driver) {
		super(driver, "Ticket Group Listing Page");
		this.driver = driver;
	}

	// click on full menu
	public void clickFullMenu() {
		click(By.cssSelector("a#navbarDropdownPortfolio"), "Full Menu", 20);
	}

	// click on ticketing
	public void clickTicketingOption() {
		click(By.cssSelector("#menuitem22"), "Ticketing", 20);
	}

	// click on Ticketing group
	public void clickTicketingGroup() {
		click(By.xpath("//a[@data-original-title='Ticket Group' and @id='cadmin_messageboard_link']"), "Ticket Group",
				20);
	}

	// click on Add Group
	public void clickAddGroup() {
		click(By.xpath("//a[@data-original-title='Add Group']"), "Add Group", 20);
	}
	
	
	

}
