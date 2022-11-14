package action;

import org.openqa.selenium.WebDriver;

import pageobjects.AddGroupPage;

public class AddGroupAction {

	WebDriver driver;

	AddGroupPage addGroupPage;

	public AddGroupAction(WebDriver driver) {
		
		this.driver = driver;
		this.addGroupPage = new AddGroupPage(driver);

	}

	public void addGroup() {
		addGroupPage.enterGroupName();
		addGroupPage.selectSkill();
	}
	
	
	

}
