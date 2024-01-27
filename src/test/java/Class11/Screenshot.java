package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/upload-image.php#");
        TakesScreenshot ss=(TakesScreenshot) driver;
        File screenshot=ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("screenshot/image.png"));
    }
}
