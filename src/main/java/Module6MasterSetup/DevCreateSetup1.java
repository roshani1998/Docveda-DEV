package Module6MasterSetup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DevCreateSetup1 
{

	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement Menu;
	@FindBy(xpath = "(//div[contains(@aria-label,'Setup')])[1]") private WebElement SetupIcon;
	@FindBy(xpath = "(//div[@aria-label='Shift Master'])[1]") private WebElement ShiftMaster;
	@FindBy(xpath = "(//input[@name='Shift_Name'])[1]") private WebElement ShiftName;
	@FindBy(xpath = "(//input[@name='Shift_From_Time'])[1]") private WebElement FromTime;
	@FindBy(xpath = "(//input[contains(@name,'Shift_To_Time')])[1]") private WebElement Totime;
	@FindBy(xpath = "(//div[contains(text(),'Save')])[1]") private WebElement Save;
	@FindBy(xpath = "(//div[@aria-label='Roster Name'])[1]") private WebElement RoasterNameLabel;
	@FindBy(xpath = "(//input[@name='Roster_Name'])[1]") private WebElement RoasterName;
	@FindBy(xpath = "(//input[@name=\"Start_Date\"])[1]") private WebElement FromDate;
	@FindBy(xpath = "(//input[@name=\"End_Date\"])[1]") private WebElement ToDate;
	@FindBy(xpath = "(//div[@aria-label='Duty Roster'])[1]") private WebElement DutyRoasterlabel;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Roster_Mst_Cd'])[1]") private WebElement SelectRoaster;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Shift_Mst_Cd'])[1]") private WebElement SelectShift;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_STP_Availability_Mode_Mst_Cd')])[1]") private WebElement Type;
	@FindBy(xpath = "(//div[@aria-label='Unavailability Master'])[1]") private WebElement Unavailability;
	@FindBy(xpath = "(//div[@role='button'])[1]") private WebElement HolidayType;
	@FindBy(xpath = "(//button[@aria-label='Choose date'])[1]") private WebElement UnFromDate;
	@FindBy(xpath = "(//button[@aria-label='Choose date'])[2]") private WebElement UnToDate;
	@FindBy(xpath = "(//div[@aria-label='Vital Master'])[1]") private WebElement Vital;
	@FindBy(xpath = "(//input[@name='Clinical_Info_Header_Name'])[1]") private WebElement VitalName;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_Glb_Specialization_Mst_Cd')])[1]") private WebElement VSpecialization;
	@FindBy(xpath = "(//input[@type='text'])[4]") private WebElement VHelpValue;
	@FindBy(xpath = "(//div[@aria-label='Examinations'])[1]") private WebElement Examination;
	@FindBy(xpath = "(//input[@name='Specialization_Name'])[1]") private WebElement ESpecialization;
	@FindBy(xpath = "(//input[contains(@name,'Clinical_Exam_Header_Name')])[1]") private WebElement ExaminationName;
	@FindBy(xpath = "(//input[@type='text'])[6]") private WebElement PhysicalExamination;
	@FindBy(xpath = "(//div[@aria-label='Extended Information'])[1]") private WebElement ExtendedInfo;
	@FindBy(xpath = "(//input[contains(@name,'Extended_Display_Name')])[1]") private WebElement ExtendedInfoName;
	@FindBy(xpath = "(//span[contains(@class,'MuiCheckbox-root MuiCheckbox-colorPrimary')])[1]") private WebElement PatientSubTypeName;
	@FindBy(xpath = "(//input[@type='text'])[4]") private WebElement ExtHelpValue;
	@FindBy(xpath = "(//div[@aria-label='Allergy'])[1]") private WebElement Allergy;
	@FindBy(xpath = "(//input[@name='Allergy_Name'])[1]") private WebElement AllergyName;
	@FindBy(xpath = "(//input[@name='Allergy_Desc'])[1]") private WebElement AllergyDesc;
	@FindBy(xpath = "(//div[@aria-label='Disease'])[1]") private WebElement Disease;
	@FindBy(xpath = "(//input[@name='Disease_Name'])[1]") private WebElement DiseaseName;
	@FindBy(xpath = "(//input[@name='Disease_Desc'])[1]") private WebElement DiseaseDesc;
	 
	public DevCreateSetup1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDevCreateSetup1Menu() 
	{
		Menu.click();
	}
	
	public void ClickDevCreateSetup1Setupicon()
	{
		SetupIcon.click();
	}
	
	public void ClickDevCreateSetup1ShiftMaster() 
	{
		ShiftMaster.click();
	}
	
	public void EnterDevCreateSetup1ShiftName() 
	{
		ShiftName.sendKeys("Morning");
	}
	
	public void EmterDevCreateSetup1Fromtime() 
	{
		FromTime.sendKeys("0600");
	}
	
	public void EnterDevCreateSetup1ToTime() 
	{
		Totime.sendKeys("1500");
	}
	
	public void ClickDevCreateSetup1SaveBtn() 
	{
		Save.click();
	}
	
	public void ClickDevCreateSetup1RoasterNameLabel() 
	{
		RoasterNameLabel.click();
	}
	
	public void EnterDevCreateSetup1RoasterName() 
	{
		RoasterName.sendKeys("Roaster1");
	}
	
	public void EnterDevCreateSetup1FromDate() 
	{
		FromDate.sendKeys("01092023");
	}
	
	public void EnterDevCreateSetup1TODate() 
	{
	   ToDate.sendKeys("30092023");
	}
	
	public void EnterDevCreateSetup1() 
	{
		DutyRoasterlabel.click();
	}
	
	public void SelectDevCreateSetup1Roaster(WebDriver driver) 
	{
		SelectRoaster.click();
		
		Actions act=new Actions(driver);
				
	   for(int i=0; i<=1; i++)
	   {
		   act.sendKeys(Keys.ARROW_DOWN).perform();
	   }
		
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void SelectDevCreateSetup1ShiftName(WebDriver driver) 
	{
	    SelectShift.click();
	    
	    Actions act= new Actions(driver);
	    
	    for(int i=0; i<=1; i++)
	    {
	    	act.sendKeys(Keys.ARROW_DOWN).perform();
	    }
	    
	    act.sendKeys(Keys.ENTER).perform();
	}
	
	public void SelectDevCreateSetup1Type(WebDriver driver) throws InterruptedException 
	{
		Type.click();
		
		Actions act= new Actions(driver);
		
		for(int i=0; i<=1; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		
	   driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
	   
	   driver.findElement(By.xpath("(//button[@type='button'])[29]")).click();
	}
	
	public void ClickDevCreateSetup1Unavailabilitymaster() 
	{
		Unavailability.click();
	}
	
	public void SelectDevCreateSetup1HolidayType(WebDriver driver) 
	{
		HolidayType.click();
		
		Actions act= new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ENTER).perform();
	}
	
	public void SelectDevCreateSetup1UnFromDate(WebDriver driver) 
	{
		UnFromDate.click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
	}
	
	public void SelectDevCreateSetup1UnTODate(WebDriver driver) 
	{
		UnToDate.click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[16]")).click();
	}
	
	public void ClickDevCreateSetup1Vital() 
	{
		Vital.click();
	}
	
	public void EnterDevCreateSetup1VitalName() 
	{
		VitalName.sendKeys("Eye");
	}
	
	public void SleectDevCreateSetup1VitalSpecilization(WebDriver driver) 
	{
		VSpecialization.click();
		
		//Actions act= new Actions(driver);
		
		//Select s= new Select(VSpecialization)

		
		
	}
	
	
	
	
}
