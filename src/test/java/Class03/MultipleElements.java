package Class03;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        //get all the links from ebay.com and print on screen

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        for (WebElement link:allLinks) {
            String text=link.getText();
            System.out.println(text);
            String linkAdress= link.getAttribute("href");
            System.out.println(linkAdress);
        }
    }
}
