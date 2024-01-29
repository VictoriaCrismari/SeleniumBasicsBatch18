package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
        WebElement month =driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select m=new Select(month);
        m.selectByVisibleText("Aug");
        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select y=new Select(year);
        y.selectByValue("1994");
        List <WebElement> calendar=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:calendar){
            if (day.getText().equals("15")){
                day.click();
            }
        }
    }
}
