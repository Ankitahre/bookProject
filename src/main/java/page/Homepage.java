package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;

public class Homepage extends WebTestBase {
	@FindBy(id = "ctl00_lblUser")
    WebElement usersearch;

    public Homepage(){
        PageFactory.initElements(driver,this);
    }

    public void userSearchClick(){
        usersearch.click();
    }

}