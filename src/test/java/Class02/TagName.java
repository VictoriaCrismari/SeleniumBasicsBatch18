package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // go to syntaxprojects.com
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement btn=driver.findElement(By.tagName("button"));
        btn.click();
    }
}
