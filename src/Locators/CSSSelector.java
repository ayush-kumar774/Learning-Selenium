package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
        /*
            cssSelector ->
                1 -> Tag and ID combinations  -> (tag#ID) -> input#email
                2 -> Tag and Class combination -> (tag.classname) -> input.inputtext
                3 -> Tag and attribute combinations -> (tag[attribute]) -> input[name = lastname]
                4 -> Tag, class and attribute -> (tag.class[attribute]) -> input.inputtext[“tabindex=2]
                5 -> cssSelector innerText -> (font:contains(“Password”))
        */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://facebook.com");
        driver.quit();
    }

}
