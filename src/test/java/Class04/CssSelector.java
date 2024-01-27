package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.event.MouseAdapter;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement inputBox= driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("hello");
        //find the profile box
        WebElement profileBox= driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("Victoria");
        WebElement feedBackBox=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedBackBox.sendKeys("The website is slow");
        WebElement courseTopic= driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("Selenium");
        WebElement intro=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("well done");

    }
}
