package Module5MIS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVMISReportBillDeskCreation 
{
       
	   @FindBy(xpath = "(//span[normalize-space()='Bill Desk'])[1]") private WebElement BillDeskLabel;
	   @FindBy(xpath = "(//input[contains(@placeholder,'dd/mm/yyyy')])[1]") private WebElement OBillDate;
	   @FindBy(xpath = "(//div[contains(text(),'View')])[1]") private WebElement OView;
	   @FindBy(xpath = "(//select[contains(@class,'focus:outline-none border')])[1]") private WebElement ONoOfRec;
	   @FindBy(xpath = "(//input[contains(@name,'Registration_No')])[1]") private WebElement OPRN;
	   @FindBy(xpath = "(//input[@name='Patient_Name'])[1]") private WebElement OPatientName;
	   @FindBy(xpath = "(//input[@name='Mobile_No1'])[1]") private WebElement OMobNo;
	   @FindBy(xpath = "(//input[@name='Bill_No'])[1]") private WebElement OBillNO;
	   @FindBy(xpath = "(//img[contains(@aria-label,'Opd Bill')])[1]") private WebElement OBillImgIcon;
	   @FindBy(xpath = "(//button[normalize-space()='OPD Receipt'])[1]") private WebElement OReceiptLabel;
	   @FindBy(xpath = "(//input[@placeholder='dd/mm/yyyy'])[1]") private WebElement OReceiptDate;
	   @FindBy(xpath = "(//div[contains(text(),'View')])[1]") private WebElement OReceiptView;
	   @FindBy(xpath = "(//select[@class='focus:outline-none border'])[1]") private WebElement OReceiptNoOfRec;
	   @FindBy(xpath = "(//input[contains(@name,'Registration_No')])[1]") private WebElement OReceiptPRN;
	   @FindBy(xpath = "(//input[@name='Patient_Name'])[1]") private WebElement OReceiptPatName;
	   @FindBy(xpath = "(//input[@name='Mobile_No1'])[1]") private WebElement OReceiptMobNo;
	   @FindBy(xpath = "(//input[@name='Receipt_No'])[1]") private WebElement OReceiptNo;
	   @FindBy(xpath = "(//img[@aria-label='Opd Receipt'])[1]") private WebElement OReceiptImgIcon;
	   @FindBy(xpath = "(//button[normalize-space()='OPD Refund'])[1]") private WebElement ORefundLabel;
	   @FindBy(xpath = "(//input[contains(@placeholder,'dd/mm/yyyy')])[1]") private WebElement ORefundDate;
	   @FindBy(xpath = "(//div[contains(text(),'View')])[1]") private WebElement ORefundView;
	   @FindBy(xpath = "(//select[contains(@class,'focus:outline-none border')])[1]") private WebElement ORefundNoOfRecords;
	   @FindBy(xpath = "(//input[contains(@name,'Registration_No')])[1]") private WebElement ORefundPRN;
	   @FindBy(xpath = "(//input[@name='Patient_Name'])[1]") private WebElement ORefundPatName;
	   @FindBy(xpath = "(//input[@name='Mobile_No'])[1]") private WebElement ORefundMobNo;
	   @FindBy(xpath = "(//input[@name='App_Ric_Refund_Hdr_Cd'])[1]") private WebElement ORefundNo;
	   @FindBy(xpath = "(//img[@aria-label='Opd Refund'])[1]") private WebElement ORefundImgIcon;
	
	public DEVMISReportBillDeskCreation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDEVMISReportBillDeskCreationBillDesk() 
	{
	    BillDeskLabel.click();
	}
	
	public void SelectDEVMISReportBillDeskCreationOpdBillDate() throws InterruptedException 
	{
		 // input text
		OBillDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		OBillDate.sendKeys(s);
	      // sending DELETE key
		OBillDate.sendKeys(org.openqa.selenium.Keys.DELETE);
	      
	      Thread.sleep(2000);
	      
	      OBillDate.sendKeys("15062023");
	}
	
	public void ClickDEVMISReportBillDeskCreationOView() 
	{
		OView.click();
	}
	
	public void ClickDEVMISReportBillDeskCreationONoOfRecords(WebDriver driver) throws InterruptedException 
	{
		ONoOfRec.click();
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
	
	public void EnterDEVMISReportBillDeskCreationOPRN() 
	{
		OPRN.sendKeys("PRN-105");
	}
	
	public void ClearDEVMISReportBillDeskCreationOPRN() 
	{
		OPRN.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		OPRN.sendKeys(s);
	      // sending DELETE key
		OPRN.sendKeys(org.openqa.selenium.Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationOPtientName() 
	{
		OPatientName.sendKeys("Suvarna");
	}
	
	public void ClearDEVMISReportBillDeskCreationOPtientName() 
	{
		OPatientName.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		OPatientName.sendKeys(s);
	      // sending DELETE key
		OPatientName.sendKeys(org.openqa.selenium.Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationOMobNo() 
	{
		OMobNo.sendKeys("9527797255");
	}
	
	public void ClearDEVMISReportBillDeskCreationOMobNo() 
	{
		OMobNo.sendKeys("Selenium");
		 // sending Ctrl+a by Keys.Chord()
		String s = Keys.chord(Keys.CONTROL, "a");
		 //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		OMobNo.sendKeys(s);
		// sending DELETE key
		OMobNo.sendKeys(Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationOBillNo() 
	{
		OBillNO.sendKeys("BILL-135");
	}
	
	public void ClearDEVMISReportBillDeskCreationOBillNo() 
	{
		OBillNO.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		OBillNO.sendKeys(s);
		
		OBillNO.sendKeys(Keys.DELETE);
	}
	
	public void GetDEVMISReportBillDeskCreationOBillReports(WebDriver driver) throws InterruptedException 
	{
		OBillImgIcon.click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(2000);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(2000);
		
		WebElement CloseBtn = driver.findElement(By.xpath("(//button[@aria-label='close'])[1]"));
		
		CloseBtn.click();
		
	}
	
	public void ClickDEVMISReportBillDeskCreationOReceiptLabel() 
	{
		OReceiptLabel.click();
	}
	
	public void EnterDEVMISReportBillDeskCreationOReceiptDate() throws InterruptedException 
	{
		 // input text
		OReceiptDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		OReceiptDate.sendKeys(s);
	      // sending DELETE key
		OReceiptDate.sendKeys(org.openqa.selenium.Keys.DELETE);
	      
	      Thread.sleep(2000);
		
		OReceiptDate.sendKeys("12052023");
	}
	
	public void ClickDEVMISReportBillDeskCreationOReceiptView() 
	{
		OReceiptView.click();
	}
	
	public void ClickDEVMISReportBillDeskCreationOReceiptNoOfRecords(WebDriver driver) throws InterruptedException 
	{
		OReceiptNoOfRec.click();
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
	
	public void EnterDEVMISReportBillDeskCreationOReceiptPRN() 
	{
		OReceiptPRN.sendKeys("PRN-73");
	}
	
	public void ClearDEVMISReportBillDeskCreationOReceiptPRN() 
	{
		OReceiptPRN.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		OReceiptPRN.sendKeys(s);
		
		OReceiptPRN.sendKeys(Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationOReceiptPatientName() 
	{
		OReceiptPatName.sendKeys("Jyoti");
	}
	
	public void ClearDEVMISReportBillDeskCreationOReceiptPatientName() 
	{
		OReceiptPatName.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		OReceiptPatName.sendKeys(s);
		
		OReceiptPatName.sendKeys(Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationOReceiptPatientMobNo() 
	{
		OReceiptMobNo.sendKeys("9527797255");
	}
	
	public void ClearDEVMISReportBillDeskCreationOReceiptPatientMobNo() 
	{
		OReceiptMobNo.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		OReceiptMobNo.sendKeys(s);
		
		OReceiptMobNo.sendKeys(Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationOReceiptNo() 
	{
		OReceiptNo.sendKeys("RCPT-NO-26");
	}
	
	public void ClearDEVMISReportBillDeskCreationOReceiptNo() 
	{
		OReceiptNo.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		OReceiptNo.sendKeys(s);
		
		OReceiptNo.sendKeys(Keys.DELETE);
	}
	
	public void GetDEVMISReportBillDeskCreationOReceiptReports(WebDriver driver) throws InterruptedException 
	{
		OReceiptImgIcon.click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(2000);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(2000);
		
		WebElement CloseBtn = driver.findElement(By.xpath("(//button[@aria-label='close'])[1]"));
		
		CloseBtn.click();
		
	}
	
	public void ClickDEVMISReportBillDeskCreationOrefundLabel() 
	{
		ORefundLabel.click();
	}
	
	public void EnterDEVMISReportBillDeskCreationORefundDate() throws InterruptedException 
	{
		 // input text
		ORefundDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		ORefundDate.sendKeys(s);
	      // sending DELETE key
		ORefundDate.sendKeys(org.openqa.selenium.Keys.DELETE);
	      
	      Thread.sleep(2000);
		ORefundDate.sendKeys("03052023");
	}
	
	public void ClickDEVMISReportBillDeskCreationORefundView() 
	{
		ORefundView.click();
	}
	
	public void ClickDEVMISReportBillDeskCreationORefundNoOfrecords(WebDriver driver) throws InterruptedException 
	{
		ORefundNoOfRecords.click();
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
	
	public void EnterDEVMISReportBillDeskCreationORefundPRN() 
	{
		ORefundPRN.sendKeys("PRN-48");
	}
	
	public void ClearDEVMISReportBillDeskCreationORefundPRN() 
	{
		ORefundPRN.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		ORefundPRN.sendKeys(s);
		
		ORefundPRN.sendKeys(Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationORefundPatname() 
	{
		ORefundPatName.sendKeys("Rekha");
	}
	
	public void ClearDEVMISReportBillDeskCreationORefundPatname() 
	{
		ORefundPatName.sendKeys("Selenium");
		
		String s = Keys.chord(Keys.CONTROL, "a");
		
		ORefundPatName.sendKeys(s);
		
		ORefundPatName.sendKeys(Keys.DELETE);
	}
	
	public void EnterDEVMISReportBillDeskCreationORefundMobNo() 
	{
		ORefundMobNo.sendKeys("9082352935");
	}
	
	public void ClearDEVMISReportBillDeskCreationORefundMobNo(WebDriver driver) 
	{
//		ORefundMobNo.sendKeys("Selenium");
//		
//		String s = Keys.chord(Keys.CONTROL, "a");
//		
//		ORefundMobNo.sendKeys(s);
//		
//		ORefundMobNo.sendKeys(Keys.DELETE);
		
		ORefundMobNo.click();
		
		Actions act=new Actions(driver);
		
        act.moveToElement(ORefundMobNo).sendKeys(Keys.CONTROL, "a").build().perform();
        
        act.moveToElement(ORefundMobNo).sendKeys(Keys.DELETE).build().perform();
	}
	
	public void EnterDEVMISReportBillDeskCreationORefundNo() 
	{
		ORefundNo.sendKeys("REF-NO-10");
	}
	
    public void ClearDEVMISReportBillDeskCreationORefundNo(WebDriver driver) 
	{
		ORefundNo.click();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ORefundNo).sendKeys(Keys.CONTROL, "a").build().perform();
		
		act.moveToElement(ORefundNo).sendKeys(Keys.DELETE).build().perform();
	}
	
    public void GetDEVMISReportBillDeskCreationORefundReports(WebDriver driver) throws InterruptedException 
	{
		ORefundImgIcon.click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(2000);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(2000);
		
		WebElement CloseBtn = driver.findElement(By.xpath("(//button[@aria-label='close'])[1]"));
		
		CloseBtn.click();
		
	}
	
	
	
}
