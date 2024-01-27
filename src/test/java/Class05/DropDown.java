package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        //find drop down
        WebElement dd= driver.findElement(By.xpath("//select[@class='form-control']"));
        //use select class
        Select sel=new Select(dd);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("Sunday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Saturday");

        //multiselect Drop Down
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        //select class
        Select Sel1=new Select(dropDown);
        //Wether the drop down is multi select or not
        System.out.println("the drop down is multiselect "+Sel1.isMultiple());
        Sel1.selectByValue("New York");
        Sel1.selectByVisibleText("Florida");
        Thread.sleep(2000);
        Sel1.deselectByValue("New York");
    }
}
