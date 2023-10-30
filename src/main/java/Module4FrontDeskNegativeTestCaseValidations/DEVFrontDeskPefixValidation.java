package Module4FrontDeskNegativeTestCaseValidations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVFrontDeskPefixValidation 
{

	private static final boolean WebElement = false;
	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement Menu;
	@FindBy(xpath = "//div[@aria-label='Front Desk']") private WebElement FrontDesk;
	@FindBy(xpath = "//div[@id='mui-4']") private WebElement Prefix;
	@FindBy(xpath = "//div[@id=\"app\"]//div//div//div//div//div//div//div//div//div//form[@action=\"#\"]//div//div[4]//div[1]//div[1]//div[1]//div[1]//div[2]//*[name()=\"svg\"]") private WebElement ErrPrefix;
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
	//@FindBy(xpath = "//body/div[@id=\"app\"]/div/div/div/div/div/div/div/div/div/form[contains(@action,\"#\")]/div/div/button[contains(@type,\"submit\")]/div[1]") private WebElement SubmitBtn;
	 
	public DEVFrontDeskPefixValidation(WebDriver driver)
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
	
	public void ClickDEVFrontDeskPefixValidationPrefix(WebDriver driver) throws InterruptedException 
	{
		Prefix.click();
		Actions act=new Actions(driver);
		act.moveToElement(Prefix).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		
	}
	
	public String SelectDEVFrontDeskPefixValidationPrefix(WebDriver driver) throws InterruptedException 
	{
		Actions act=new Actions(driver);
		act.moveToElement(ErrPrefix).perform();
//		act.sendKeys(Keys.TAB);
//		act.sendKeys(Keys.TAB);
		//Prefix.click();
		Thread.sleep(2000);
		org.openqa.selenium.WebElement s1 = driver.findElement(By.xpath("//div[@data-foo=\"bar\"]"));
		String actText = s1.getText();
		System.out.println(actText);
		return actText;
		
	}
	
	public void EnterDEVFrontDeskPefixValidationFirstName(String FName) 
	{
		FirstName.sendKeys(FName);
	} 
	
	public void EnterDEVFrontDeskPefixValidationLastName(String LName) 
	{
		LastName.sendKeys(LName);
	}
	
	public void SelectDEVFrontDeskPefixValidationDateOfBirth(String DateOB) 
	{
		DOB.sendKeys(DateOB);
	}
	
	public void SelectDEVFrontDeskPefixValidationMaritalStatus(WebDriver driver) 
	{
		MaritalStatus.click();
		WebElement M1 = driver.findElement(By.xpath("//li[@data-value='MARM-SYS-SYS-1cc219cb-4eeb-11ed-824b-0ad5ae9814dc']"));
		Actions act=new Actions(driver);
		act.moveToElement(M1).click().build().perform();
	}
	
	public void SelectDEVFrontDeskPefixValidationBloodGroup(WebDriver driver) 
	{
		BloodGroup.click();
		WebElement B1 = driver.findElement(By.xpath("//li[@data-value='AB+']"));
		Actions act=new Actions(driver);
		act.moveToElement(B1).click().build().perform();
	}
	
	public void EnterDEVFrontDeskPefixValidationMobileNo(String MobNo) 
	{
		MobileNO.sendKeys(MobNo);
	}
	
	public void ClickDEVFrontDeskPefixValidationAddInfo() 
	{
		Add.click();
//		Actions act=new Actions(driver);
//		act.moveToElement(Add).click().build().perform();
	}
	
	public void EnterDEVFrontDeskPefixValidationLocality(String Locality, WebDriver driver) 
	{
		SearchLocality.sendKeys(Locality);
		driver.findElement(By.xpath("(//div[contains(@class,'p-2 hover:bg-gray-100')])[2]")).click();
			
	}
	
	public void EnterDEVFrontDeskPefixValidationAddressandInformation(String AddInfo) 
	{
		Address.sendKeys(AddInfo);
	}
	
	public void EnterDEVFrontDeskPefixValidationEmailOfficial(String EmailId2) 
	{
		EmailOff.sendKeys(EmailId2);
	}
	
//	public void ClickDEVFrontDeskPefixValidationSubmitBtn() 
//	{
//		SubmitBtn.click();
//	}
	
}
