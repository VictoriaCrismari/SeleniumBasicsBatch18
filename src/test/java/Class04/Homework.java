package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        WebElement FSfirstTextBox=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        FSfirstTextBox.sendKeys("Know What Matters");
        WebElement FSsecondtextBox=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        FSsecondtextBox.sendKeys("Read people like a book");
        WebElement FSthirdTextBox=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        FSthirdTextBox.sendKeys("Mindset");
        WebElement PSfirstTextBox= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        PSfirstTextBox.sendKeys("The things we cannot say");
        WebElement PSsecondTextBox=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        PSsecondTextBox.sendKeys("Anna");
        WebElement PSthirdTextBox=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        PSthirdTextBox.sendKeys("Think faster, talk smarter");
        WebElement PCfirstTextBox=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        PCfirstTextBox.sendKeys("grandparent");
        WebElement PCsecondTextBox=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        PCsecondTextBox.sendKeys("parent");
        WebElement PCthirdTextBox= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        PCthirdTextBox.sendKeys("child");

    }
}
