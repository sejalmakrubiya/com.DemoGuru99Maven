package demoguru99.com;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils{
    @BeforeMethod
    public void openBrowser() {
        BrowserSelector browserSelector = new BrowserSelector();
        browserSelector.selectBrowser();
        driver.get("http://www.demo.guru99.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }



    }

