package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("abracadabra@gmail.com");
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("helooo123");
        WebElement login= driver.findElement(By.name("login"));
        //login.click();
        WebElement createAccount =driver.findElement(By.linkText("Create new account"));
        createAccount.click();
    }
}
