package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Victoria");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Crismari");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("CV1234@gmail.com");
        WebElement password= driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("V123456");

    }
}
