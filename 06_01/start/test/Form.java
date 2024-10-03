import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tausif\\Desktop\\Coding\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.click();
        firstName.sendKeys("Tausif");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.click();
        lastName.sendKeys("Zaman");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.click();
        jobTitle.sendKeys("Software Engineer");

        WebElement radioButton3 = driver.findElement(By.id("radio-button-3"));
        radioButton3.click();

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        WebElement yearsMenu = driver.findElement(By.id("select-menu"));
        yearsMenu.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement option2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='2']")));
        option2.click();

        driver.findElement(By.id("datepicker")).sendKeys("10/04/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);


        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


        //driver.quit();
    }
}
