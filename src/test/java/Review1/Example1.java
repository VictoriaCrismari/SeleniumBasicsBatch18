package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        //initiate the instance of web driver
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //go to facebook
        driver.get("https://www.fb.com");
        //get the "create a new account"
        WebElement createNewAccount=driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        //send the name
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");

    }
}
