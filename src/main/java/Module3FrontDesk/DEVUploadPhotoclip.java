package Module3FrontDesk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DEVUploadPhotoclip 
{
     WebDriver driver;
	private static final boolean WebElement = false;
	@FindBy(xpath = "(//div[@class='space-x-4 flex items-center MuiBox-root css-14gey9d'])[1]") private WebElement Menu;
	@FindBy(xpath = "//div[@aria-label='Front Desk']") private WebElement FrontDesk;
	@FindBy(xpath = "(//div[@id='mui-39'])[1]") private WebElement Prefix;
	@FindBy(xpath = "//input[@name='First_Name']") private WebElement FirstName;
	@FindBy(xpath = "//input[@name='Last_Name']") private WebElement LastName;
	//@FindBy(xpath = "//input[@id='mui-5']") private WebElement DOB;
	//@FindBy(xpath = "//div[@id='mui-6']") private WebElement MaritalStatus;
	//@FindBy(xpath = "//div[@id='mui-8']") private WebElement BloodGroup;
	@FindBy(xpath = "//input[@name='Mobile_No1']") private WebElement MobileNO;
	@FindBy(xpath = "(//div[@role=\"button\"])[1]") private WebElement UploadPhoto;
	//@FindBy(xpath = "((//html[@lang='en']/body/div[1]//div)[164]//div)[129]//input") private WebElement UploadPhoto;
	@FindBy(css = ".flex.w-full.justify-between") private WebElement Add;
	@FindBy(xpath = "//input[@name='Locality']") private WebElement SearchLocality;
	@FindBy(xpath = "//input[@name='Address_Line']") private WebElement Address;
	@FindBy(xpath = "//input[@name='EmailID2']") private WebElement EmailOff;
	@FindBy(xpath = "//body/div[@id=\"app\"]/div/div/div/div/div/div/div/div/div/form[contains(@action,\"#\")]/div/div/button[contains(@type,\"submit\")]/div[1]") private WebElement SubmitBtn;
	
	public DEVUploadPhotoclip(WebDriver driver)
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
	
	public void SelectDEVUploadPhotoclipPrefix(WebDriver driver) 
	{
		Prefix.click();
		WebElement P1 = driver.findElement(By.xpath("(//li[normalize-space()='Mr.'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(P1).click().build().perform();
	}
	
	public void EnterDEVUploadPhotoclipFirstName(String FName) 
	{
		FirstName.sendKeys(FName);
	} 
	
	public void EnterDEVUploadPhotoclipLastName(String LName) 
	{
		LastName.sendKeys(LName);
	}
	
//	public void SelectDEVUploadPhotoclipDateOfBirth(String DateOB) 
//	{
//		DOB.sendKeys(DateOB);
//	}
//	
//	public void SelectDEVUploadPhotoclipMaritalStatus(WebDriver driver) 
//	{
//		MaritalStatus.click();
//		WebElement M1 = driver.findElement(By.xpath("//li[@data-value='MARM-SYS-SYS-1cc219cb-4eeb-11ed-824b-0ad5ae9814dc']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(M1).click().build().perform();
//	}
	
//	public void SelectDEVUploadPhotoclipBloodGroup(WebDriver driver) 
//	{
//		BloodGroup.click();
//		WebElement B1 = driver.findElement(By.xpath("//li[@data-value='AB+']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(B1).click().build().perform();
//	}
	
	public void EnterDEVUploadPhotoclipMobileNo(String MobNo) 
	{
		MobileNO.sendKeys(MobNo);
		//driver.findElement("//div[contains(@class,\\\"text-center\\\")]//div[contains(@role,\\\"button\\\")]");
	}
	
	public void UploadDEVUploadPhotoclip() throws InterruptedException, AWTException 
	{
		
		//UploadPhoto.sendKeys("C:\\Users\\h\\Desktop\\sis image.jpg");
		String filePath = "Pictures\\\\HD-wallpaper-lord-ganesh-dagdusheth-ganpati-bappa new.jpg";
		UploadPhoto.click();
		Robot robot = new Robot();
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Use keyboard shortcuts to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		
	}
	
	public void ClickDEVUploadPhotoclipAddInfo() 
	{
		Add.click();
//		Actions act=new Actions(driver);
//		act.moveToElement(Add).click().build().perform();
	}
	
	public void EnterDEVUploadPhotoclipLocality(String Locality, WebDriver driver) 
	{
		SearchLocality.sendKeys(Locality);
		driver.findElement(By.xpath("(//div[contains(@class,'p-2 hover:bg-gray-100')])[2]")).click();
			
	}
	
	public void EnterDEVUploadPhotoclipAddressandInformation(String AddInfo) 
	{
		Address.sendKeys(AddInfo);
	} 
	
	public void EnterDEVUploadPhotoclipEmailOfficial(String EmailId2) 
	{
		EmailOff.sendKeys(EmailId2);
	}

	public void ClickDEVUploadPhotoclipSubmitBtn() 
	{
		SubmitBtn.click();
	}	
	
	
	
	
}
