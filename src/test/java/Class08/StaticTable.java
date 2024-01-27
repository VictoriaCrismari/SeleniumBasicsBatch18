package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for (WebElement row:rows){
            System.out.println(row.getText());
        }
        List<WebElement> column=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count=1;
        for (WebElement col:column){
            if (col.getText().equals("in progress")){
                //print the row number
                System.out.println(count);
                //find the particular row
                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());
            }count=count+1;
        }
    }
}
