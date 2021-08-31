package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    /*
    Example Google to Facebook
    1 -> Open google.com
    2 -> navigate().to("https://facebook.com");
    3 -> navigate().back() -> because the first url which is google.com is already saved in buffer.
    4 -> navigate().forward() -> the facebook url is already in buffer

     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("The title of the current page is " + driver.getTitle());
        driver.navigate().to("https://facebook.com");
        System.out.println("The title of the current page is " + driver.getTitle());
        driver.navigate().back();
        System.out.println("The title of the current page is " + driver.getTitle());
        driver.navigate().forward();
        System.out.println("The title of the current page is " + driver.getTitle());
        driver.navigate().refresh(); //it is just used for refreshing the page
        driver.quit();
    }
}
