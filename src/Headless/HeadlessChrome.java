package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        ChromeOptions options = new ChromeOptions();
//        FirefoxOptions options = new FirefoxOptions();

        options.setHeadless(true) ;

        //options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();

    }
}
