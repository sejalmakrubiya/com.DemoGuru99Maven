package demoguru99.com;

import org.openqa.selenium.By;

public class V1Page extends Utils {
    By _userIdButton = By.xpath("//input[@name='uid']");
    By _passwordButton = By.xpath("//input[@name='password']");
    By _loginButton = By.xpath("//input[@name='btnLogin']");


    public void fillingMandatoryFieldInGtplBank() {
        typeText(_userIdButton,"UserId");
        typeText(_passwordButton,"Password");
        clickOnElement(_loginButton);



    }
}