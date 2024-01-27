package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW2 {
    //click on button "click to display button"
    //and click on the displayed button
    //click on "click me to enable button"
    //click on the button below
    //click on click to check the check box
    //get the state of selected check box after its checked and print on console
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Enabled']")));
        driver.findElement(By.xpath("//button[normalize-space()='Enabled']")).click();

        driver.findElement(By.xpath("//button[@id='enable_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Button']")));
        driver.findElement(By.xpath("//button[normalize-space()='Button']")).click();

        driver.findElement(By.xpath("//button[@id='checkbox_button']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='checkbox']"));
        checkBox.click();
        System.out.println(checkBox.isSelected());
    }
}
