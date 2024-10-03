import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tausif\\Desktop\\Coding\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        // finds the element we are looking for, the name box in this case
        WebElement name = driver.findElement(By.id("name"));
        // clicks the box
        name.click();
        // types the name
        name.sendKeys("Tausif Zaman");
        // click button
        WebElement button = driver.findElement(By.id("button"));
        button.click();

        //driver.quit();
    }
}
