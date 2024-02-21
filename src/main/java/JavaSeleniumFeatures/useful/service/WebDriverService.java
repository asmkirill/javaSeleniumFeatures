package JavaSeleniumFeatures.useful.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class WebDriverService {

    public void ChromeTest() {

            WebDriver driver;

            //Setting system properties of ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\BStackDemo\\chromedriver.exe");

            //Creating an object of ChromeDriver
            driver = new ChromeDriver();

            //launching the specified URL
            driver.get("https://somesite.com/");
    }
}
