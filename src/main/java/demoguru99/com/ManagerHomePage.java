package demoguru99.com;

import org.openqa.selenium.By;

public class ManagerHomePage extends Utils{
By _assertTextGtplBank = By.xpath("//h2[@class='barone']");


public String verifyLoginSuccessful(){
return getText(_assertTextGtplBank);
}
}
