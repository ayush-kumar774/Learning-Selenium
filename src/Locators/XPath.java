package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("try1234@protonmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("try1234");

        WebElement logIn = driver.findElement(By.xpath("//button[@id='u_0_d_Bg']"));
        logIn.click();

        driver.quit();

    }
}
