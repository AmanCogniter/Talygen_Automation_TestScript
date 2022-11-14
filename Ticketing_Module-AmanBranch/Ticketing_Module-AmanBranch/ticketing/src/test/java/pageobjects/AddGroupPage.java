package pageobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.PropertiesLoader;
import utils.WebBasePage;

public class AddGroupPage extends WebBasePage {

	WebDriver driver;

	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";

	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	static String pattern = "yyMMddHHmmss";
	static Date date = new Date();
	static SimpleDateFormat dateformat = new SimpleDateFormat(pattern);

	static String datevalue = dateformat.format(date);

	public AddGroupPage(WebDriver driver) {
		super(driver, "Add Group Page");
		this.driver = driver;
	}

	// Group Name with time
	public static String groupNameWithTime() {
		String groupName = prop.getProperty("enterGroupName") + datevalue;
		return groupName;
	}

	// enter Group Name
	public void enterGroupName() {
		String groupNameWithTime = groupNameWithTime();
		enter(By.cssSelector("#TicketGroupName"), groupNameWithTime, "Enter Group Name", 45);
	}

	public void selectSkill() {
	selectValueWithText(By.cssSelector("#SkillId"), "Testing", "Testing selected from dropdown", 50);
	}
	
	
	
}
