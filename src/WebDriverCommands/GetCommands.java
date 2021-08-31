package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com"); // opens the urls

        System.out.println(driver.getTitle()); // returns the title of the page

        System.out.println(driver.getCurrentUrl());

//        System.out.println(driver.getPageSource()); // return the source code of the page

        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'India')]")).getText()); //used to extract text ˳

        //driver.close(); // closes the current window
        driver.quit(); // closes the entire browser
    }
}
