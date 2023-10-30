package Module1;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1Login.DEVLogin;
import Module5MIS.DEVMISReportBillDeskCreation;
import Module5MIS.DEVMISReportsAppointmentDesk;

public class DEVMISReportTest extends BaseClass
{

	DEVLogin login;
	DEVMISReportsAppointmentDesk Report;
	DEVMISReportBillDeskCreation Opd;
	
	int TCID;
	
	@BeforeClass
	public void EnterURL() 
	{
		Initializebrowser();
		
		login= new DEVLogin(driver);
		Report= new DEVMISReportsAppointmentDesk(driver);
		Opd = new DEVMISReportBillDeskCreation(driver);
		
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
	public void GetAppDeskReports() throws InterruptedException 
	{
		TCID=201;
		Thread.sleep(5000);
		Report.ClikOnDEVMISReportsAppointmentDeskMenuBtn();
		Report.ClickOnDEVMISReportsAppointmentDeskMISIcon();
		Thread.sleep(3000);
		Report.ClickOnDEVMISReportsAppointmentDeskAppDeskIcon();
		Report.SelectDEVMISReportsAppointmentDeskFromDateOfAppList(driver);
		Thread.sleep(2000);
		Report.SelectDEVMISReportsAppointmentDeskDoctor(driver);
		Report.SelectDEVMISReportsAppointmentDeskNoOfRecords(driver);
		Thread.sleep(7000);
		Report.ClickDEVMISReportsAppointmentDeskConsShiftTime();
		Thread.sleep(2000);
		Report.EnterDEVMISReportsAppointmentDeskFromDate(driver);
		Report.SelectDEVMISReportsAppointmentDeskDoctor2(driver);
		Report.SelectDEVMISReportsAppointmentDeskNOOfRecords(driver);
		Thread.sleep(7000);
		Report.ClickDEVMISReportsFrontDesk();
		Report.SelectDEVMISReportsFrontDeskFromDate();
		Report.SelectDEVMISReportsFrontDeskNOOfRecords(driver);
		Thread.sleep(5000);
		Report.EnterDEVMISReportsFrontDeskPRNNO();
		Report.ClickDEVMISReportsFrontDeskViewBtn();
		Thread.sleep(5000);
		Report.ClearDEVMISReportsFrontDeskPRNNo();
		Report.EnterDEVMISReportsFrontDeskPatientName();
		Report.ClickDEVMISReportsFrontDeskViewBtn();
		Thread.sleep(5000);
		Report.ClearDEVMISReportsFrontDeskPatientName();
		Report.EnterDEVMISReportsFrontDeskMOBNo();
		Report.ClickDEVMISReportsFrontDeskViewBtn();
	}
	
	@Test(priority = 3)
	public void GetBillDeskCreationReport() throws InterruptedException 
	{
		Thread.sleep(4000);
		Opd.ClickDEVMISReportBillDeskCreationBillDesk();
		Thread.sleep(2000);
		Opd.SelectDEVMISReportBillDeskCreationOpdBillDate();
		Opd.ClickDEVMISReportBillDeskCreationOView();
		Thread.sleep(4000);
		Opd.ClickDEVMISReportBillDeskCreationONoOfRecords(driver);
		Opd.EnterDEVMISReportBillDeskCreationOPRN();
		Opd.ClickDEVMISReportBillDeskCreationOView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationOPRN();
		Opd.EnterDEVMISReportBillDeskCreationOPtientName();
		Opd.ClickDEVMISReportBillDeskCreationOView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationOPtientName();
		Opd.EnterDEVMISReportBillDeskCreationOMobNo();
		Opd.ClickDEVMISReportBillDeskCreationOView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationOMobNo();
		Opd.EnterDEVMISReportBillDeskCreationOBillNo();
		Opd.ClickDEVMISReportBillDeskCreationOView();
		Thread.sleep(4000);
		Opd.GetDEVMISReportBillDeskCreationOBillReports(driver);
		Thread.sleep(2000);
		Opd.ClickDEVMISReportBillDeskCreationOReceiptLabel();
		Thread.sleep(4000);
		Opd.EnterDEVMISReportBillDeskCreationOReceiptDate();
		Opd.ClickDEVMISReportBillDeskCreationOReceiptView();
		Thread.sleep(4000);
		Opd.ClickDEVMISReportBillDeskCreationOReceiptNoOfRecords(driver);
		Opd.EnterDEVMISReportBillDeskCreationOReceiptPRN();
		Opd.ClickDEVMISReportBillDeskCreationOReceiptView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationOReceiptPRN();
		Opd.EnterDEVMISReportBillDeskCreationOReceiptPatientName();
		Opd.ClickDEVMISReportBillDeskCreationOReceiptView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationOReceiptPatientName();
		Opd.EnterDEVMISReportBillDeskCreationOReceiptPatientMobNo();
		Opd.ClickDEVMISReportBillDeskCreationOReceiptView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationOReceiptPatientMobNo();
		Opd.EnterDEVMISReportBillDeskCreationOReceiptNo();
		Opd.ClickDEVMISReportBillDeskCreationOReceiptView();
		Thread.sleep(4000);
		Opd.GetDEVMISReportBillDeskCreationOReceiptReports(driver);
		Thread.sleep(4000);
		Opd.ClickDEVMISReportBillDeskCreationOrefundLabel();
		Opd.EnterDEVMISReportBillDeskCreationORefundDate();
		Opd.ClickDEVMISReportBillDeskCreationORefundView();
		Thread.sleep(4000);
		Opd.ClickDEVMISReportBillDeskCreationORefundNoOfrecords(driver);
		Opd.EnterDEVMISReportBillDeskCreationORefundPRN();
		Opd.ClickDEVMISReportBillDeskCreationORefundView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationORefundPRN();
		Opd.EnterDEVMISReportBillDeskCreationORefundPatname();
		Opd.ClickDEVMISReportBillDeskCreationORefundView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationORefundPatname();
		Opd.EnterDEVMISReportBillDeskCreationORefundMobNo();
		Opd.ClickDEVMISReportBillDeskCreationORefundView();
		Thread.sleep(4000);
		Opd.ClearDEVMISReportBillDeskCreationORefundMobNo(driver);
		Opd.EnterDEVMISReportBillDeskCreationORefundNo();
		Opd.ClickDEVMISReportBillDeskCreationORefundView();
		Thread.sleep(4000);
		Opd.GetDEVMISReportBillDeskCreationORefundReports(driver);
		
	}
	
	@AfterMethod
	public void TakeSS(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
	}
	
//	@AfterClass
//	public void CloseBrowser() 
//	{
//		driver.close();
//	}
	
	
	
	
}
