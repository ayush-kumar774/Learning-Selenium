package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

    //        isDisplayed() -> check for a particular web element is displayed or not
    //        isEnabled() -> basically it is used for text box to check whether we can write in it or not
    //        isSelected() -> it is used to check whether check boxes or radio buttons are selected or not

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://en-gb.facebook.com/");

        WebElement emailID = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = driver.findElement(By.xpath("//div[@id='passContainer']"));

        if (emailID.isDisplayed() && emailID.isEnabled()) {
            System.out.println("You can enter emailID now");
        }
        else {
            System.out.println("Something wrong with email input box");
        }

        if (password.isDisplayed() && password.isEnabled()) {
            System.out.println("You can enter password now");
        }
        else {
            System.out.println("Something wrong with password input box");
        }

//        WebElement createAccountButton = driver.findElement(By.cssSelector("#u_0_2_FB"));
//        createAccountButton.click();
//
//        WebElement male = driver.findElement(By.xpath("//input[@id='u_d_5_E1']"));
//        System.out.println("Is male selected? ->" + male.isSelected());
//
//        WebElement female = driver.findElement(By.xpath("//input[@id='u_d_4_k9']"));
//        System.out.println("Is female selected? -> " + female.isSelected());

        driver.quit();
    }
}
