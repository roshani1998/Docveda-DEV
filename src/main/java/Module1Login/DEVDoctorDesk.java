package Module1Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DEVDoctorDesk 
{

	@FindBy(xpath = "(//input[@placeholder='Search By Name, Mobile #, Reg #'])[1]") private WebElement search;
	@FindBy(xpath = "(//div[@id='patient-list-item'])[1]") private WebElement PatientName;
	@FindBy(xpath = "(//input[contains(@name,'generalVitals.Systolic (mmHg)')])[1]") private WebElement Systolic;
	@FindBy(xpath = "(//input[@name='generalVitals.Diastolic (mmHg)'])[1]") private WebElement Diastolic;
	@FindBy(xpath = "(//input[@name='generalVitals.Pulse (bpm)'])[1]") private WebElement Puls;
	@FindBy(xpath = "(//input[@name='generalVitals.Temperature (°F)'])[1]") private WebElement Temprature;
	@FindBy(xpath = "(//input[@name='generalVitals.Weight (kgs)'])[1]") private WebElement Weight;
	@FindBy(xpath = "(//input[@name='generalVitals.Height (cms)'])[1]") private WebElement Height;
	@FindBy(xpath = "(//input[@name='generalVitals.Respiration (P/Min)'])[1]") private WebElement Respiration;
    @FindBy(xpath = "(//input[contains(@name,'specialVitals')])[1]") private WebElement SpecialVitals;
	@FindBy(xpath = "(//select[@id='parameters'])[1]") private WebElement PhyPara;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Allergy_Mst_Cd'])[1]") private WebElement Allergy;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Disease_Mst_Cd'])[1]") private WebElement Disease;
	@FindBy(xpath = "(//textarea[contains(@name,'Complaint_Symptoms')])[1]") private WebElement Complaints;
	@FindBy(xpath = "(//input[@name='clinicalParam'])[1]") private WebElement ClinicPara;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Investigation_Cd'])[1]") private WebElement Investigation;
	@FindBy(xpath = "(//input[contains(@name,'drug')])[1]") private WebElement Prescription;
	@FindBy(xpath = "(//div[contains(@data-block,'true')])[2]") private WebElement Instructions;
	@FindBy(xpath = "(//div[contains(text(),'Save')])[1]") private WebElement Submit;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/button[1]/div[1]") private WebElement CompareHealthSummary;
	@FindBy(xpath = "(//div[@role='button'])[1]") private WebElement SelectVisitDate;
	@FindBy(xpath = "(//button[@aria-label='close'])[1]") private WebElement CloseBtn;
	
	public DEVDoctorDesk(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterInDEVDoctorDesksearchField() 
	{
		search.sendKeys("Kalpit");
	}
	
	public void ClickOnDEVDoctorDeskPatientName() 
	{
		PatientName.click();
	}
	
	public void EnterDEVDoctorDeskSystolic(String systolic) 
	{
		Systolic.sendKeys(systolic);
	}
	
	public void EnterDEVDoctorDeskDiastolic(String diastolic) 
	{
		Diastolic.sendKeys(diastolic);
	}
	
	public void EnterDEVDoctorDeskPuls(String puls) 
	{
		Puls.sendKeys(puls);
	}
	
	public void EnterDEVDoctorDeskTemp(String temp) 
	{
		Temprature.sendKeys(temp);
	}
	
	public void EnterDEVDoctorDeskWeight(String wgh) 
	{
		Weight.sendKeys(wgh);
	}
	
	public void EnterDEVDoctorDeskHeight(String ht) 
	{
		Height.sendKeys(ht);
	}
	
	public void EnterDEVDoctorDeskRespiration(String resp) 
	{
		Respiration.sendKeys(resp);
	}
	
	public void EnterDEVDoctorDeskSpeVital() 
	{
		SpecialVitals.sendKeys("134");
	}
	
	public void SelectDEVDoctorDeskPhyPara(WebDriver driver) throws InterruptedException 
	{
		PhyPara.click();
		Thread.sleep(2000);
		
		//WebElement hrt = driver.findElement(By.xpath("(//option[@value='heart test'])[1]"));
		
			Actions act= new Actions(driver);
	
		for(int i=1; i<=2; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'beats')])[1]")).click();
	}
	
	public void SelectDEVDoctorDeskAllergy(WebDriver driver) 
	{
		Allergy.click();
		
		WebElement Arg = driver.findElement(By.xpath("//div[normalize-space()='Dust']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(Arg).click().build().perform();
	}
	
	public void SelectDEVDoctorDeskDisease(WebDriver driver) 
	{
		Disease.click();
		
		WebElement Dise = driver.findElement(By.xpath("//div[contains(@class,'text-sm')][normalize-space()='Cancer']"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(Dise).click().build().perform();
	}
	
	public void EnterDEVDoctorDeskComplaints(String Comp) 
	{
		Complaints.sendKeys(Comp);
	}
	
	public void SelectDEVDoctorDeskClinicPara(WebDriver driver) throws InterruptedException 
	{
		ClinicPara.click();
		
		WebElement ClcPara = driver.findElement(By.xpath("//div[normalize-space()='24 HRS URINARY ALBUMIN']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ClcPara).click().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='monitorParameter.0.currentValue'])[1]")).sendKeys("11");
		driver.findElement(By.xpath("(//input[@name='monitorParameter.0.lastValue'])[1]")).sendKeys("22");
		driver.findElement(By.xpath("(//input[@name='monitorParameter.0.previousValue'])[1]")).sendKeys("33");
		
	}
	
	public void SelectDEVDoctorDeskInvestigation(WebDriver driver) 
	{
		Investigation.click();
		WebElement Inv = driver.findElement(By.xpath("//div[normalize-space()='24 HRS URINARY CALCIUM EXAMINAT']"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(Inv).click().build().perform();
		
		Investigation.click();
	}
	
	public void SelectDEVDoctorDeskPrescription(WebDriver driver) throws InterruptedException 
	{
		Prescription.click();
		WebElement presc = driver.findElement(By.xpath("//div[normalize-space()='Jaundice pres - Prescription Template']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(presc).click().build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@name='servicesAndPrescription.0.dose'])[1]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='OD-(1 Time a day)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='servicesAndPrescription.0.frequency'])[1]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='1-0-0- (1 Every Morning)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='servicesAndPrescription.0.duration'])[1]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='10 Days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='servicesAndPrescription.0.notes'])[1]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='After Breakfast']")).click();
		
	}
	
	public void EnterDEVDoctorDeskInstructions() 
	{
		Instructions.sendKeys("Take care");
	}
	
	public void ClickDEVDoctorDeskSubmitBtn() 
	{
	    Submit.click();	
	}
	
	public void ClickDEVDoctorDeskCompareHealthSummary(WebDriver driver) 
	{
	    //CompareHealthSummary.click();	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", CompareHealthSummary);
	}
	
	public void ClickDEVDoctorDeskVisitDate(WebDriver driver) 
	{
		SelectVisitDate.click();
		WebElement Date = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Date).click().build().perform();
	}
	
	public void ClickDEVDoctorDeskCloseBtn() 
	{
		CloseBtn.click();
	}
	
	
}
