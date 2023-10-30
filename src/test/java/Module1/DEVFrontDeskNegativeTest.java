package Module1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1Login.DEVCreateAppFrmFrontDesk;
import Module1Login.DEVCreateVisitFrmFrontDesk;
import Module1Login.DEVDoctorDesk;
import Module1Login.DEVFrontDesk;
import Module1Login.DEVLogin;
import Module4FrontDeskNegativeTestCaseValidations.DEVFrontDeskFirstNameValidation;
import Module4FrontDeskNegativeTestCaseValidations.DEVFrontDeskPefixValidation;

public class DEVFrontDeskNegativeTest extends BaseClass
{
   
	DEVLogin login;
	DEVFrontDeskPefixValidation valid;
	DEVFrontDeskFirstNameValidation validF;
	
    int TCID;
	
	@BeforeClass
	public void EnterURL() 
	{
		Initializebrowser();
		
		login= new DEVLogin(driver);
		valid= new DEVFrontDeskPefixValidation(driver);
		validF= new DEVFrontDeskFirstNameValidation(driver);
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
	public void ValidatePrefix() throws InterruptedException, IOException  
	{
		TCID= 101;
		Thread.sleep(7000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//div[contains(@class,'space-x-4 flex')]//div)[1]")));
		valid.ClickMenuIcon();
		valid.ClickOnFrontDeskIcon();
		valid.ClickDEVFrontDeskPefixValidationPrefix(driver);
		Thread.sleep(2000);
		
		valid.SelectDEVFrontDeskPefixValidationPrefix(driver);
		org.openqa.selenium.WebElement s1 = driver.findElement(By.xpath("//div[@data-foo=\"bar\"]"));
		String actText = s1.getText();
		String ExpText = "This Field Is Required";
		Assert.assertEquals(actText,ExpText);
		
		valid.EnterDEVFrontDeskPefixValidationFirstName(UtilityClass.GetTD(0, 0));
		valid.EnterDEVFrontDeskPefixValidationLastName(UtilityClass.GetTD(0, 1));
		valid.SelectDEVFrontDeskPefixValidationDateOfBirth(UtilityClass.GetTD(0, 2));
		valid.SelectDEVFrontDeskPefixValidationMaritalStatus(driver);
		valid.SelectDEVFrontDeskPefixValidationBloodGroup(driver);
		valid.EnterDEVFrontDeskPefixValidationMobileNo(UtilityClass.GetTD(0, 3));
		//create.ClickDEVFrontDeskAddInfo();
		valid.ClickMenuIcon();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,650)", "");
		valid.ClickDEVFrontDeskPefixValidationAddInfo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		valid.EnterDEVFrontDeskPefixValidationLocality(UtilityClass.GetTD(0, 4), driver);
		Thread.sleep(2000);
		valid.EnterDEVFrontDeskPefixValidationAddressandInformation(UtilityClass.GetTD(0, 5));
		valid.EnterDEVFrontDeskPefixValidationEmailOfficial(UtilityClass.GetTD(0, 6));
//        Thread.sleep(2000);
//        valid.ClickDEVFrontDeskPefixValidationSubmitBtn();
	}
	
	@Test(priority = 3)
	public void ValidateFirstName() throws InterruptedException, IOException 
	{
		TCID= 102;
		Thread.sleep(5000);
		validF.ClickMenuIcon();
		validF.ClickAppDeskIcon();
		Thread.sleep(2000);
		validF.ClickOnFrontDeskIcon();
		validF.SelectDEVFrontDeskFirstNameValidationPrefix(driver);
		validF.EnterDEVFrontDeskFirstNameValidationFirstName(driver);
		validF.ValidationDEVFrontDeskFristNameValidationFirstName(driver);
		validF.EnterDEVFrontDeskFirstNameValidationLastName(UtilityClass.GetTD(0, 1));
		validF.SelectDEVFrontDeskFirstNameValidationDateOfBirth(UtilityClass.GetTD(0, 2));
		validF.SelectDEVFrontDeskFirstNameValidationMaritalStatus(driver);
		validF.SelectDEVFrontDeskFirstNameValidationBloodGroup(driver);
		validF.EnterDEVFrontDeskFirstNameValidationMobileNo(UtilityClass.GetTD(0, 3));
		validF.ClickMenuIcon();
		validF.ClickDEVFrontDeskFirstNameValidationAddInfo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		validF.EnterDEVFrontDeskFirstNameValidationLocality(UtilityClass.GetTD(0, 4), driver);
		Thread.sleep(2000);
		validF.EnterDEVFrontDeskFirstNameValidationAddressandInformation(UtilityClass.GetTD(0, 5));
		validF.EnterDEVFrontDeskFirstNameValidationEmailOfficial(UtilityClass.GetTD(0, 6));
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
