package Module1Login;



import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setup {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver using WebDriverManager (uncomment this if you use WebDriverManager)
        // WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.docveda.in/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("(//button[normalize-space()='Login for Doctors'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("entityOrgId")).sendKeys("Sis1");
        driver.findElement(By.name("userName")).sendKeys("Sis1-root");
        driver.findElement(By.name("password")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//div[text()='Sign in']")).click();
       Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@aria-label='Setup'])[1]")).click();
        driver.findElement(By.xpath("(//div[@aria-label='Vital Master'])[1]")).click();
        Thread.sleep(2000);

        //WebDriverWait wait = new WebDriverWait(driver, 10);

        // Locate the select element (dropdown)
        WebElement selectElement = driver.findElement(By.name("Sys_Ric_Glb_Specialization_Mst_Cd"));
        
        selectElement.click();
        
        Thread.sleep(4000);
        
        String desiredOptionValue = "Cardiologist"; // Replace with the actual value of the option you want to select
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1];", selectElement, desiredOptionValue);


        // Wait for the dropdown to be clickable
        //wait.until(ExpectedConditions.elementToBeClickable(selectElement));

        // Use the Select class to work with the dropdown
       // Select select = new Select(selectElement);

        // Get all the options from the dropdown
        //List<WebElement> options = select.getOptions();

        // Print the options
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//        }

        // Select an option by index (e.g., the first option)
        // select.selectByIndex(0);

        // Close the WebDriver when done
        //driver.quit();
    }
}
