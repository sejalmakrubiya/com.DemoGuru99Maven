package demoguru99.com;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    static String email = "softwertesting" + timeStamp() + "@gmail.com";

    By _emailId = By.name("emailid");
    By _submitButton = By.name("btnLogin");

public void emailId(){
    typeText(_emailId, email);
    clickOnElement(_submitButton);
}
}
