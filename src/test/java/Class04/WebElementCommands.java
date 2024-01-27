package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
        //Send keys after clearing the text box
        WebElement textBox=driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("Welcome");
        //check if the option 1 is selected
        //if not then select it
        WebElement option1=driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
        boolean stateOfOp1=option1.isSelected();
        if (!stateOfOp1){
            option1.click();
        }
        //to print out the state of option1
        System.out.println("The state of radiobutton is "+option1.isSelected());
        //to check if option 2 is enabled or not
        WebElement option2= driver.findElement(By.xpath("//input[@value='option2']"));
        boolean enableStateOfOp2=option2.isEnabled();
        if (enableStateOfOp2){
            System.out.println("Option 2 is enabled and can be selected");
        }else {
            System.out.println("Option 2 is not enabled and can't be clickable");
        }
        //check if the option3 is displayed or not
        //and print the status on the console
       WebElement option3= driver.findElement(By.xpath("//input[@value='option3']"));
        boolean isDisplayedOp3=option3.isDisplayed();
        if (isDisplayedOp3){
            System.out.println("The radio button option 3 is displayed");
        }else {System.out.println("The radio button option 3 is not displayed");}

        //get the text
        WebElement textMsg=driver.findElement(By.xpath("//div[@id='textElement']"));
        String text=textMsg.getText();
        System.out.println(text);
        //get the attribute value and print on the screen
        WebElement attribute=driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));
        String value=attribute.getAttribute("id");
        System.out.println(value);

    }
}
