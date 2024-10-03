import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tausif\\Desktop\\Coding\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //autocomplete.click();
        autocomplete.sendKeys("Shyamoli, dhaka, bangladesh");

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        Thread.sleep(1000);
        autocompleteResult.click();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        Thread.sleep(10000);
        driver.quit();
    }
}
