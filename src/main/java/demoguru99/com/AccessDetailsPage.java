package demoguru99.com;

import org.openqa.selenium.By;

public class AccessDetailsPage extends Utils {
    String UserID = "mngr288030";
    String Password = "adUveva";
    By _bankProjectButton = By.xpath("//a[contains(text(),'Bank Project')]");


    public void clickOnBankProjectButton(){
        clickOnElement(_bankProjectButton);
    }
}
