package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement DD=driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select=new Select(DD);
        List<WebElement> values=select.getOptions();
        System.out.println(values.size());
        for (WebElement s: values){
            if (s.getText().equals("Antiques")){
                s.click();
            }
        }
        select.selectByVisibleText("Art");
    }

}
