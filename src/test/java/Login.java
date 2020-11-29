import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.id("email_create")).sendKeys("test456@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();

        driver.findElement(By.id("id_gender")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Test1");

        driver.findElement(By.id("customer_lastname")).sendKeys("Test1");

        driver.findElement(By.id("email")).sendKeys("test436@gmail.com");

        driver.findElement(By.id("passwd")).sendKeys("Hello");





    }

}
