package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendars {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo.php#");
        WebElement calendar= driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calendar.click();
        //select from calendar
        boolean notFound=true;
        while (notFound){
            //get the current month
            String currentMonth = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if(currentMonth.equals("August 2024")){
                notFound=false;
//            u can have the logic to click on date here also....
            }
            if(notFound){
//            click on next button
                WebElement next = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
                next.click();
            }
        }

        //select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));

//        iterate
        for(WebElement date:allDates){
            if(date.getText().equals("24")){
                date.click();
                break;
            }
        }
    }
}
