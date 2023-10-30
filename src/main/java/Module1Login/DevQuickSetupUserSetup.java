package Module1Login;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DevQuickSetupUserSetup 
{
     
	@FindBy(xpath = "//button[@aria-label='close']") private WebElement UserSetup;    // have to change xpath
	@FindBy(xpath = "//div[text()='Mrs. rohit rajesh update sharma']") private WebElement EntityType;   // have to change xpath
	@FindBy(xpath = "//input[@id='mui-2']") private WebElement EntityRole;
	@FindBy(xpath = "//div[@id='mui-2']") private WebElement Prefix;
	@FindBy(xpath = "//input[@name='First_Name']") private WebElement FirstName;
	@FindBy(xpath = "//input[@name='Last_Name']") private WebElement LastName;
	@FindBy(xpath = "//div[@id='mui-3']") private WebElement Gender;
	
	public DevQuickSetupUserSetup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDevQuickSetupUserSetup() 
	{
	
		UserSetup.click();
		
	}
	
	public void SelectDevQuickSetupUserSetupEntityType(WebDriver driver) 
	{
		
		WebElement doctor = driver.findElement(By.xpath("//div[text()='Profile']"));
//		WebElement doctor = driver.findElement(By.xpath("//li[contains(@data-value,'CLNENTTYPM-STP-d7fc847c')]"));
		Actions act=new Actions(driver);
		act.moveToElement(EntityType).click().build().perform();
		act.moveToElement(doctor).click().build().perform();
		
	}
	
	
	
}
