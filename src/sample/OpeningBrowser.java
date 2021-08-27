package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBrowser {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
        WebDriver web_driver  = new ChromeDriver();
        web_driver.get("https://gmail.com");
        web_driver.wait(2);
        web_driver.quit();

//        System.setProperty("webdriver.gecko.driver" , "geckodriver.exe");
//        WebDriver webDriver = new FirefoxDriver();
//        webDriver.get("https://gmail.com");
//        webDriver.quit();

//        System.setProperty("webdriver.edge.driver" , "msedgedriver.exe");
//        WebDriver webDriver2 = new EdgeDriver();
//        webDriver2.get("https://gmail.com");
//        webDriver2.quit();

    }
}
