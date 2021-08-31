package Headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver {
    public static void main(String[] args) {
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get("https://google.com");
        System.out.println("The title of the page is " + driver.getTitle());
        System.out.println("The current url of the page is " + driver.getCurrentUrl());
        driver.quit();
    }
}
