package demoguru99.com;

import org.openqa.selenium.By;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    //Reusable method for to click on web element
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //Reusable method for send keys
    public static void typeText(By by,String textValue){
        driver.findElement(by).sendKeys(textValue);


    }
    //Reusable method for get text

    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    public static String timeStamp(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        //get current date time with Date()
        Date date = new Date();
        // now format the date
        return dateFormat.format(date);
    }

}
