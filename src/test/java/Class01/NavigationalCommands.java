package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) {
        //initiate the instance of wed driver
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //go to google.com
        driver.get("https://www.google.com");
        //facebook.com
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
