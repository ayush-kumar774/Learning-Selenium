package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class TestingInputFields {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver() ;
//        System.setProperty("web.gecko.driver", "geckodriver");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("It's A K Here!!");

        WebElement buttonShowMessages = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
        buttonShowMessages.click();

        WebElement enterA = driver.findElement(By.xpath("//input[@id='sum1']"));
        enterA.sendKeys("7");

        WebElement enterB = driver.findElement(By.xpath("//input[@id='sum2']"));
        enterB.sendKeys("8");

        WebElement getTotal = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        getTotal.click();

//        driver.wait(1);

        driver.quit();

    }
}
