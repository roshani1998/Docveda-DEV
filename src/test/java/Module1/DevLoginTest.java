package Module1;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.print.Doc;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.auto.common.Visibility;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1Login.DEVBillDeskBillGeneration;
import Module1Login.DEVBillDeskCancellation;
import Module1Login.DEVBillDeskReceipt;
import Module1Login.DEVBillDeskRefund;
import Module1Login.DEVCreateAppFrmFrontDesk;
import Module1Login.DEVCreateVisitFrmFrontDesk;
import Module1Login.DEVDoctorDesk;
import Module1Login.DEVFrontDesk;
import Module1Login.DEVLogin;
import Module1Login.DevQuickSetupUserSetup;

public class DevLoginTest extends BaseClass
{
	
	DEVLogin login;
	DEVFrontDesk create;
	DEVCreateAppFrmFrontDesk Appt;
	DEVCreateVisitFrmFrontDesk visit;
	DEVDoctorDesk Doctor;
	DEVBillDeskBillGeneration Bill;
	DEVBillDeskReceipt Recp;
	DEVBillDeskRefund Ref;
	DEVBillDeskCancellation Canc;
	//DevQuickSetupUserSetup user;
	
	int TCID;
	
	@BeforeClass
	public void EnterURL() 
	{
		Initializebrowser();
		
		login= new DEVLogin(driver);
		create =new DEVFrontDesk(driver);
		Appt = new DEVCreateAppFrmFrontDesk(driver);
		visit = new DEVCreateVisitFrmFrontDesk(driver);
		Doctor = new DEVDoctorDesk(driver);
		Bill = new DEVBillDeskBillGeneration(driver);
		Recp= new DEVBillDeskReceipt(driver);
		Ref= new DEVBillDeskRefund(driver);
		Canc= new DEVBillDeskCancellation(driver);
		
		//user= new DevQuickSetupUserSetup(driver);
		
		
	}
	
	@Test(priority = 1)
	public void LoginToApp() throws IOException, InterruptedException
	{
	
		//Thread.sleep(2000);
		login.ClickDEVLoginPageLoginButton();
		login.EnterDEVLoginPageClinicID(UtilityClass.GetPFD("ClinicId"));
		login.EnterDEVLoginPageUN(UtilityClass.GetPFD("UN"));
		login.EnterDEVLoginPagePWD(UtilityClass.GetPFD("PWD"));
		login.ClickDEVLoginPageSignInButton();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 2)
	public void CreatePatient() throws InterruptedException, IOException  
	{
		TCID= 101;
		Thread.sleep(7000);

		create.ClickMenuIcon();
		create.ClickOnFrontDeskIcon();
		create.SelectDEVFrontDeskPrefix(driver);
		create.EnterDEVFrontDeskFirstName(UtilityClass.GetTD(0, 0));
		create.EnterDEVFrontDeskLastName(UtilityClass.GetTD(0, 1));
		create.SelectDEVFrontDeskDateOfBirth(UtilityClass.GetTD(0, 2));
		create.SelectDEVFrontDeskMaritalStatus(driver);
		create.SelectDEVFrontDeskBloodGroup(driver);
		create.EnterDEVFrontDeskMobileNo(UtilityClass.GetTD(0, 3));
		//create.ClickDEVFrontDeskAddInfo();
		create.ClickMenuIcon();
		create.ClickDEVFrontDeskAddInfo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		create.EnterDEVFrontDeskLocality(UtilityClass.GetTD(0, 4), driver);
		Thread.sleep(2000);
        create.EnterDEVFrontDeskAddressandInformation(UtilityClass.GetTD(0, 5));
        create.EnterDEVFrontDeskEmailOfficial(UtilityClass.GetTD(0, 6));
        Thread.sleep(2000);
		create.ClickDEVFrontDeskSubmitBtn(driver);
	}
	
	@Test(priority = 3)
	public void CreateAnAppointment() throws InterruptedException 
	{
		TCID=102;
		Thread.sleep(4000);
		Appt.EnterDEVCreateAppFrmFrontDeskSearchField();
		Appt.ClickDEVCreateAppFrmFrontDeskAppointmentIcon(driver);
		//create.ClickMenuIcon();
		Thread.sleep(2000);
		Appt.ClickDEVCreateAppFrmFrontDeskSlots(driver);
		Appt.ClearSelectedDate(driver);
		Thread.sleep(2000);
		Appt.ClickDEVCreateAppFrmFrontDeskEndDate(driver);
		Appt.SelectDEVCreateAppFrmFrontDeskPurposeOfVisit(driver);
		Appt.SelectDEVCreateAppFrmFrontDeskVisitType(driver);
		Appt.ClickDEVCreateAppFrmFrontDeskScheduleBtn();
		Appt.ClickDEVMenuBtn();
		Thread.sleep(2000);
		Appt.ClickDEVFrontDeskIcon();
	}
	
	@Test(priority = 4)
	public void CreateVisit() throws InterruptedException 
	{
		TCID= 103;
		Thread.sleep(4000);
		visit.ClickMenuBtn();
		visit.ClickDEVCreateVisitFrmFrontDeskSearchBtn();
		Thread.sleep(2000);
		visit.ClickDEVCreateVisitFrmFrontDeskVisitIcon(driver);
		visit.SelectDEVCreateVisitFrmFrontDeskVisitType(driver);
		visit.SelectDEVCreateVisitFrmFrontDeskDoctor(driver);
		visit.ClickDEVCreateVisitFrmFrontDeskSubmitBtn();
		//visit.ClickDEVCreateVisitFrmFrontDeskCloseBtn();
		visit.ClickMenuBtn();
		visit.ClickDEVDoctorDeskIcon();
		visit.ClickMenuBtn();
		
	}
	
	@Test(priority = 5)
	public void CreateDoctorDesk() throws IOException, InterruptedException 
	{
		TCID= 104;
		Doctor.EnterInDEVDoctorDesksearchField();
		Doctor.ClickOnDEVDoctorDeskPatientName();
		Thread.sleep(2000);
		Doctor.EnterDEVDoctorDeskSystolic(UtilityClass.GetTD(1, 0));
		Doctor.EnterDEVDoctorDeskDiastolic(UtilityClass.GetTD(1, 1));
		Doctor.EnterDEVDoctorDeskPuls(UtilityClass.GetTD(1, 2));
		Doctor.EnterDEVDoctorDeskTemp(UtilityClass.GetTD(1, 3));
		Doctor.EnterDEVDoctorDeskWeight(UtilityClass.GetTD(1, 4));
		Doctor.EnterDEVDoctorDeskHeight(UtilityClass.GetTD(1, 5));
		Doctor.EnterDEVDoctorDeskRespiration(UtilityClass.GetTD(1, 6));
		Doctor.EnterDEVDoctorDeskSpeVital();
		Thread.sleep(2000);
		Doctor.SelectDEVDoctorDeskPhyPara(driver);
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("window.scrollBy(0,400)", "");
		Doctor.SelectDEVDoctorDeskAllergy(driver);
		Doctor.SelectDEVDoctorDeskDisease(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		Doctor.EnterDEVDoctorDeskComplaints(UtilityClass.GetTD(1, 7));
		Doctor.SelectDEVDoctorDeskClinicPara(driver);
		Doctor.SelectDEVDoctorDeskInvestigation(driver);
		Doctor.SelectDEVDoctorDeskPrescription(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(2000);
		Doctor.EnterDEVDoctorDeskInstructions();
		Doctor.ClickDEVDoctorDeskSubmitBtn();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,2500)", "");
		Thread.sleep(2000);
		Doctor.ClickDEVDoctorDeskCompareHealthSummary(driver);
		Thread.sleep(2000);
		Doctor.ClickDEVDoctorDeskVisitDate(driver);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(2000);
		Doctor.ClickDEVDoctorDeskCloseBtn();
		
	}
	
	@Test(priority = 6)
	public void GenerateBill() throws InterruptedException 
	{
		TCID= 105;
		Bill.ClickDEVBillDeskMenuBtn();
		Bill.ClickDEVBillDeskIcon();
		Bill.ClickDEVBillDeskBillGenerationIcon();
		Bill.ClickDEVBillDeskOpdBillIcon();
		Bill.SelectDEVBillDeskTariffScheme(driver);
		Bill.EnterDEVBillDeskServices(driver);
		Thread.sleep(2000);
		Bill.ForwardDEVBillDeskService();
		Bill.EnterDEVBillDeskDiscoutAmount();
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,1300)", "");
		Thread.sleep(2000);
		Bill.EnterDEVBillDeskReasonOfDiscount(driver);
		Bill.SelectDEVBillDeskPaymentMode(driver);
		Bill.SelectDEVBillDeskPaymentBy(driver);
		Bill.EnterDEVBillDeskAmount(driver);
		Bill.ClickDEVBillDeskSubmitBtn();
		
	}
	
	@Test(priority = 7)
	public void GenerateReceipt() throws InterruptedException 
	{
		TCID= 106;
		Recp.ClickDEVBillDeskReceiptIcon();
		Recp.ClickDEVBillDeskReceiptBillReceiptIcon();
		Thread.sleep(2000);
		Recp.SelectDEVBillDeskReceiptPaymentMode(driver);
		Recp.SelectDEVBillDeskReceiptPaymentBy(driver);
		Recp.EnterDEVBillDeskReceiptAmount(driver);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(2000);
		Recp.ClickDEVBillDeskReceiptSubmitBtn();
	}
	
	@Test(priority = 8)
	public void GenerateRefund() throws InterruptedException 
	{
		TCID= 107;
		Ref.ClickDEVBillDeskRefundIcon();
		Ref.ClickDEVBillDeskBillRefundIcon();
		Ref.SelectDEVBillDeskRefundPaymentMode(driver);
		Ref.SelectDEVBillDeskRefundPaymentBy(driver);
		Ref.SelectDEVBillDeskRefundReason(driver);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		Ref.ClickDEVBillDeskRefundSubmitBtn();
	}
	
	@Test(priority = 9)
	public void CancellationOFBillReceiptAndRefund() throws InterruptedException 
	{
		TCID= 108;
		Canc.ClickDEVBillDeskCancellationBtn();
		Canc.ClickDEVBillDeskCancellationBillCancellationIcon();
		Canc.SelectDEVBillDeskCancellationBillCancellationReason(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		Canc.ClickDEVBillDeskCancellationBillCancellationSubmit();
		Thread.sleep(2000);
		Canc.ClickDEVBillDeskCancellationBtn();
		Canc.ClickDEVBillDeskCancellationReceiptRadioBtn();
		Canc.ClickDEVBillDeskCancellationReceiptcancellationIcon();
		Canc.SelectDEVBillDeskCancellationReceiptCancellationReason(driver);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		Canc.ClickDEVBillDeskCancellationReceiptcancellationSubMitBtn();
		Thread.sleep(2000);
		Canc.ClickDEVBillDeskCancellationBtn();
		Canc.ClickDEVBillDeskCancellationRefundRadioBtn();
		Canc.ClickDEVBillDeskCancellationRefundCancellationIcon();
		Canc.SelectDEVBillDeskCancellationRefundCancellationReason(driver);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		Canc.ClickDEVBillDeskCancellationRefundCancellationSubmitBtn();
	}
	
	@AfterMethod
	public void TakeSS(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
	}
	
	
	@AfterClass
	public void CloseBrowser() 
	{
		driver.close();
	}

}
