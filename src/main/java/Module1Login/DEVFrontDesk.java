package Module1Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DEVFrontDesk 
{
    
	private static final boolean WebElement = false;
	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement Menu;
	@FindBy(xpath = "//div[@aria-label='Front Desk']") private WebElement FrontDesk;
	@FindBy(xpath = "//div[@id='mui-4']") private WebElement Prefix;
	@FindBy(xpath = "//input[@name='First_Name']") private WebElement FirstName;
	@FindBy(xpath = "//input[@name='Last_Name']") private WebElement LastName;
	@FindBy(xpath = "//input[@id='mui-5']") private WebElement DOB;
	@FindBy(xpath = "//div[@id='mui-6']") private WebElement MaritalStatus;
	@FindBy(xpath = "//div[@id='mui-8']") private WebElement BloodGroup;
	@FindBy(xpath = "//input[@name='Mobile_No1']") private WebElement MobileNO;
	@FindBy(css = ".flex.w-full.justify-between") private WebElement Add;
	@FindBy(xpath = "//input[@name='Locality']") private WebElement SearchLocality;
	@FindBy(xpath = "//input[@name='Address_Line']") private WebElement Address;
	@FindBy(xpath = "//input[@name='EmailID2']") private WebElement EmailOff;
	//@FindBy(xpath = "(//button[@type='submit'])[3]") private WebElement SubmitBtn;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement SubmitBtn;
	 
	public DEVFrontDesk(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		 
	public void ClickMenuIcon() 
	{
		Menu.click();
	}
	
	public void ClickOnFrontDeskIcon() 
	{
		FrontDesk.click();
	}
	
	public void SelectDEVFrontDeskPrefix(WebDriver driver) 
	{
		Prefix.click();
		WebElement P1 = driver.findElement(By.xpath("//li[@data-value='SALM-SYS-8be990ee-ddab-11ec-b885-0a08a2604c6a']"));
		Actions act=new Actions(driver);
		act.moveToElement(P1).click().build().perform();
	}
	
	public void EnterDEVFrontDeskFirstName(String FName) 
	{
		FirstName.sendKeys(FName);
	} 
	
	public void EnterDEVFrontDeskLastName(String LName) 
	{
		LastName.sendKeys(LName);
	}
	
	public void SelectDEVFrontDeskDateOfBirth(String DateOB) 
	{
		DOB.sendKeys(DateOB);
	}
	
	public void SelectDEVFrontDeskMaritalStatus(WebDriver driver) 
	{
		MaritalStatus.click();
		WebElement M1 = driver.findElement(By.xpath("//li[@data-value='MARM-SYS-SYS-1cc219cb-4eeb-11ed-824b-0ad5ae9814dc']"));
		Actions act=new Actions(driver);
		act.moveToElement(M1).click().build().perform();
	}
	
	public void SelectDEVFrontDeskBloodGroup(WebDriver driver) 
	{
		BloodGroup.click();
		WebElement B1 = driver.findElement(By.xpath("//li[@data-value='AB+']"));
		Actions act=new Actions(driver);
		act.moveToElement(B1).click().build().perform();
	}
	
	public void EnterDEVFrontDeskMobileNo(String MobNo) 
	{
		MobileNO.sendKeys(MobNo);
	}
	
	public void ClickDEVFrontDeskAddInfo() 
	{
		Add.click();
//		Actions act=new Actions(driver);
//		act.moveToElement(Add).click().build().perform();
	}
	
	public void EnterDEVFrontDeskLocality(String Locality, WebDriver driver) 
	{
		SearchLocality.sendKeys(Locality);
		driver.findElement(By.xpath("(//div[contains(@class,'p-2 hover:bg-gray-100')])[2]")).click();
			
	}
	
	public void EnterDEVFrontDeskAddressandInformation(String AddInfo) 
	{
		Address.sendKeys(AddInfo);
	}
	
	public void EnterDEVFrontDeskEmailOfficial(String EmailId2) 
	{
		EmailOff.sendKeys(EmailId2);
	}
	
	public void ClickDEVFrontDeskSubmitBtn(WebDriver driver) 
	{
		WebElement m = driver.findElement(By.xpath("(//div[contains(text(),'Submit')])[1]"));
	      //JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].click();", m);
		//SubmitBtn.click();
	}
	
}
