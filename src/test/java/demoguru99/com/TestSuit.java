package demoguru99.com;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    AccessDetailsPage accessDetailsPage = new AccessDetailsPage();
    V1Page v1Page = new V1Page();
    ManagerHomePage managerHomePage = new ManagerHomePage();


@Test
//To verify login successful
public void loginSuccessfulWithAssertTextGtplBank(){
//enter email id
    homePage.emailId();
//click on bank project button
    accessDetailsPage.clickOnBankProjectButton();
//Enter filling mandatory field in gtpl bank
    v1Page.fillingMandatoryFieldInGtplBank();
//verify login successful assert text gtpl bank
    managerHomePage.verifyLoginSuccessful();






}
}