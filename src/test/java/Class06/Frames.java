package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/handle-iframe.php");
        //driver is focused on main page so
        //switch the focus to the frame
        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("frames");
        //switch to default content
        driver.switchTo().defaultContent();
        //switch to the frame having the dropdown
        driver.switchTo().frame("dropdownIframe");
        //dealing with dropdown
        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dd);
        select.selectByValue("big baby cat");
        //select the checkbox
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        //find the iframe element
        WebElement frameNested=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frameNested);
        //click the checkbox
        driver.findElement(By.xpath("//input[@value='Option-1']")).click();


    }
}
