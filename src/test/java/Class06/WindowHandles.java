package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAlAmgQ&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S352572726%3A1705085926574577&theme=glif");
        //click on the button help and privacy
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
//        get the window handle of the main page and save it in a variable
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);

//        switch the focus of the driver to the window privacy
//        get all the handles
        Set<String> allHandles = driver.getWindowHandles();
//        iterate
        for (String handle : allHandles) {
//            switch to the handle
            driver.switchTo().window(handle);
//            check if this is the desired window
            if (driver.getTitle().equals("Privacy Policy – Privacy & Terms – Google")) {
                break;
            }
        }

//        confirming that we are on privacy
        System.out.println(driver.getCurrentUrl());

        //switch the focus to the main page
        driver.switchTo().window(mainPageHandle);
        //confirming that we are on the main page
        System.out.println(driver.getCurrentUrl());
    }
    }
