package demoguru99.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
    static String browserName="Firefox";
    public void selectBrowser() {
        if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\shop\\sejal\\Sejal Testing\\software\\Firefox Driver\\geckodriver.exe");
                    driver = new FirefoxDriver();


        }else{
            System.setProperty("webdriver.chrome.driver","C:\\shop\\sejal\\Sejal Testing\\software\\BrowserDriver\\chromedriver.exe");
                    driver=new ChromeDriver();
        }
        }
}