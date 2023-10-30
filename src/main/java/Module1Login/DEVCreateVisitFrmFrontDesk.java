package Module1Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DEVCreateVisitFrmFrontDesk 
{

	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement MenuBtn;
	@FindBy(xpath = "(//input[@placeholder='Search By Name, Mobile #, Reg #'])[1]") private WebElement Search;
	@FindBy(xpath = "(//div[@class='flex items-center justify-between py-1']//div//div)[2]") private WebElement VisitIcon;
	@FindBy(xpath = "(//div[contains(@role,'button')])[15]") private WebElement VisitType;
	@FindBy(xpath = "(//div[contains(@role,'button')])[16]") private WebElement Doctor;
	//@FindBy(xpath = "//div[contains(@class,'col-span-6 py-2 items-center')]") private WebElement VerifyDate;
	@FindBy(xpath = "(//button[@type='submit'])[4]") private WebElement SubmitBtn;
	@FindBy(xpath = "//div[@aria-label='Doctor Desk']") private WebElement DoctordeskIcon;
	@FindBy(xpath = "//button[@aria-label='close']") private WebElement Close;
	
	public DEVCreateVisitFrmFrontDesk(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickMenuBtn() 
	{
		MenuBtn.click();
	}
	
	public void ClickDEVCreateVisitFrmFrontDeskSearchBtn() 
	{
		Search.sendKeys("Kalpit");
	}
	
	public void ClickDEVCreateVisitFrmFrontDeskVisitIcon(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement PatientN = driver.findElement(By.xpath("(//div[@id='patient-list-item'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PatientN).perform();
		Thread.sleep(3000);
		
		VisitIcon.click();
	}
	
	public void SelectDEVCreateVisitFrmFrontDeskVisitType(WebDriver driver) 
	{
	     VisitType.click();
	     WebElement vt1 = driver.findElement(By.xpath("(//li[normalize-space()='OPD'])[1]"));
	     
	     Actions act=new Actions(driver);
	     
	     act.moveToElement(vt1).click().build().perform();
	}
	
	public void SelectDEVCreateVisitFrmFrontDeskDoctor(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000);
		Doctor.click();
		WebElement d1 = driver.findElement(By.xpath("(//li[normalize-space()='swapnil phanse'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(d1).click().build().perform();
		
	}
	
	public void ClickDEVCreateVisitFrmFrontDeskSubmitBtn() 
	{
		SubmitBtn.click();
	}
	
	public void ClickDEVDoctorDeskIcon() 
	{
		DoctordeskIcon.click();
	}
	
	public void ClickDEVCreateVisitFrmFrontDeskCloseBtn() 
	{
		Close.click();
	}
}
