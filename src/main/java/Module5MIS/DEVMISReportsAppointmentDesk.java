package Module5MIS;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVMISReportsAppointmentDesk 
{

	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement Menu;
	@FindBy(xpath = "(//div[@aria-label='MIS'])[1]") private WebElement MIS;
	@FindBy(xpath = "(//span[normalize-space()='Appointment Desk'])[1]") private WebElement APPDesk;
	@FindBy(xpath = "(//input[@name='Start_Date'])[1]") private WebElement StartDate;
	@FindBy(xpath = "(//div[@role='button'])[1]") private WebElement DoctorName1;
	@FindBy(xpath = "(//select[@class='focus:outline-none border'])[1]") private WebElement NOOfRecords1;
	@FindBy(xpath = "(//button[contains(@type,'button')])[2]") private WebElement ConsShiftTime;
	@FindBy(xpath = "(//input[contains(@name,'Start_Date')])[1]") private WebElement FromDate;
	@FindBy(xpath = "(//div[@role='button'])[1]") private WebElement DoctorName2;
	@FindBy(xpath = "(//select[@class='focus:outline-none border'])[1]") private WebElement NOOfRecords2;
	@FindBy(xpath = "(//span[normalize-space()='Front Desk'])[1]") private WebElement FrontDesk;
	@FindBy(xpath = "(//input[@name='From_Date'])[1]") private WebElement StartDate2;
	@FindBy(xpath = "(//div[contains(text(),'View')])[1]") private WebElement View1;
	@FindBy(xpath = "(//select[@class='focus:outline-none border'])[1]") private WebElement NOOfRecords3;
	@FindBy(xpath = "(//input[contains(@name,'Registration_No')])[1]") private WebElement PRN;
	@FindBy(xpath = "(//input[@name='Patient_Name'])[1]") private WebElement PatientName;
	@FindBy(xpath = "(//input[@name='Mobile_No1'])[1]") private WebElement MobNo;
	
	
	
	public DEVMISReportsAppointmentDesk (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClikOnDEVMISReportsAppointmentDeskMenuBtn() 
	{
		Menu.click();
	}
	
	public void ClickOnDEVMISReportsAppointmentDeskMISIcon() 
	{
		MIS.click();
	}
	
	public void ClickOnDEVMISReportsAppointmentDeskAppDeskIcon() 
	{
		APPDesk.click();
	}
	
	public void SelectDEVMISReportsAppointmentDeskFromDateOfAppList(WebDriver driver) throws InterruptedException 
	{
		//StartDate.clear();
		 // input text
		StartDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      StartDate.sendKeys(s);
	      // sending DELETE key
	      StartDate.sendKeys(org.openqa.selenium.Keys.DELETE);
	      
	      Thread.sleep(2000);
	      
	      StartDate.sendKeys("01042023");
	     
	}
	
	public void SelectDEVMISReportsAppointmentDeskDoctor(WebDriver driver) throws InterruptedException 
	{
		DoctorName1.click();
		 Thread.sleep(2000);
		
		WebElement App = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(App).click().build().perform();
	}
	
	public void SelectDEVMISReportsAppointmentDeskNoOfRecords(WebDriver driver) throws InterruptedException 
	{
		NOOfRecords1.click();
		 Thread.sleep(2000);
		
		//WebElement Val = driver.findElement(By.xpath("(//option[@value='100'])[1]"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(Val).click().build().perform();
		for(int i=0; i<=3; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		
	}
	
	public void ClickDEVMISReportsAppointmentDeskConsShiftTime() 
	{
		ConsShiftTime.click();
	}
	
	public void EnterDEVMISReportsAppointmentDeskFromDate(WebDriver driver) throws InterruptedException 
	{
		 // input text
		FromDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		FromDate.sendKeys(s);
	      // sending DELETE key
	      FromDate.sendKeys(org.openqa.selenium.Keys.DELETE);
	      
//		FromDate.click();
//			
//			Actions act=new Actions(driver);
//			
//	        act.moveToElement(FromDate).sendKeys(Keys.CONTROL, "a").build().perform();
//	        
//	        act.moveToElement(FromDate).sendKeys(Keys.DELETE).build().perform();
//			
//	      
	      Thread.sleep(2000);
		
		FromDate.sendKeys("01042023");
		
	}
	
	public void SelectDEVMISReportsAppointmentDeskDoctor2(WebDriver driver) throws InterruptedException 
	{
		DoctorName2.click();
		 Thread.sleep(2000);
			
			WebElement App = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
			
			Actions act=new Actions(driver);
			
			act.moveToElement(App).click().build().perform();
		
	}
	
	public void SelectDEVMISReportsAppointmentDeskNOOfRecords(WebDriver driver) throws InterruptedException 
	{
		NOOfRecords2.click();
		 Thread.sleep(2000);
			
		//WebElement Val = driver.findElement(By.xpath("(//option[@value='100'])[1]"));
			
		Actions act=new Actions(driver);
			
		//act.moveToElement(Val).click().build().perform();
		for(int i=0; i<=3; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
			
	}
	
	public void ClickDEVMISReportsFrontDesk() 
	{
		FrontDesk.click();
	}
	
	public void SelectDEVMISReportsFrontDeskFromDate() throws InterruptedException 
	{
		StartDate2.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      StartDate2.sendKeys(s);
	      // sending DELETE key
	      StartDate2.sendKeys(org.openqa.selenium.Keys.DELETE);
	      
	      Thread.sleep(2000);
		
	      StartDate2.sendKeys("01042023");
	}
	
	public void ClickDEVMISReportsFrontDeskViewBtn() 
	{
		View1.click();
	}
	
	public void SelectDEVMISReportsFrontDeskNOOfRecords(WebDriver driver) throws InterruptedException 
	{
		NOOfRecords3.click();
		 Thread.sleep(2000);
			
			//WebElement Val = driver.findElement(By.xpath("(//option[@value='100'])[1]"));
				
			Actions act=new Actions(driver);
				
			//act.moveToElement(Val).click().build().perform();
			for(int i=0; i<=3; i++)
			{
				act.sendKeys(Keys.ARROW_DOWN).perform();
			}
			Thread.sleep(2000);
			
			act.sendKeys(Keys.ENTER).perform();
	}
	
	public void EnterDEVMISReportsFrontDeskPRNNO() 
	{
	     PRN.sendKeys("PRN-184");	
	}
	
	public void ClearDEVMISReportsFrontDeskPRNNo() 
	{

		PRN.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		PRN.sendKeys(s);
	      // sending DELETE key
		PRN.sendKeys(org.openqa.selenium.Keys.DELETE);
	}
	
	public void EnterDEVMISReportsFrontDeskPatientName() 
	{
		PatientName.sendKeys("Aarohi");
	}
	
	public void ClearDEVMISReportsFrontDeskPatientName() 
	{
		PatientName.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		PatientName.sendKeys(s);
	      // sending DELETE key
		PatientName.sendKeys(org.openqa.selenium.Keys.DELETE);
	}
	
	public void EnterDEVMISReportsFrontDeskMOBNo() 
	{
		MobNo.sendKeys("9082352935");
	}
	
	public void ClearDEVMISReportsFrontDeskMobNo() 
	{
		MobNo.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		MobNo.sendKeys(s);
	      // sending DELETE key
		MobNo.sendKeys(org.openqa.selenium.Keys.DELETE);
	}
	
	
	
}

