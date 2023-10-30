package Module1;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1Login.DEVLogin;
import Module3FrontDesk.DEVUploadPhotoclip;

public class DEVFrontDeskTest extends BaseClass
{

	DEVLogin login;
	DEVUploadPhotoclip photo;
	
	@BeforeClass
	public void EnterUrl() 
	{
		Initializebrowser();
//		   ChromeOptions co=new ChromeOptions();
//			
//			co.addArguments("--remote-allow-origins=*");
//			WebDriver driver=new ChromeDriver(co);
//			driver.manage().window().maximize();
//			
//			driver.get("https://www.docveda.in/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//h5[normalize-space()='Log In'])[1]")).click();
			driver.findElement(By.xpath("(//div[normalize-space()='For Existing Doctors'])[1]")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("7248960414");
			driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("Admin@123");
			driver.findElement(By.xpath("(//button[normalize-space()='Log In'])[1]")).click();
		//login =new DEVLogin(driver);
	photo = new DEVUploadPhotoclip(driver);
	}
	
//	@Test(priority = 1)
//	public void LoginToApp() throws IOException, InterruptedException 
//	{
         
		
		
		
//		login.ClickDEVLoginPageLoginButton();
//		login.EnterDEVLoginPageClinicID(UtilityClass.GetPFD("ClinicId"));
//		login.EnterDEVLoginPageUN(UtilityClass.GetPFD("UN"));
//		login.EnterDEVLoginPagePWD(UtilityClass.GetPFD("PWD"));
//		login.ClickDEVLoginPageSignInButton();
//		Thread.sleep(2000);
//	}
	
	@Test(priority = 2)
	public void CreatePatientByUploadingPhotoClip() throws IOException, InterruptedException, AWTException 
	{
		
		Thread.sleep(2000);
		photo.ClickMenuIcon();
		photo.ClickOnFrontDeskIcon();
		Thread.sleep(2000);
		photo.SelectDEVUploadPhotoclipPrefix(driver);
		photo.EnterDEVUploadPhotoclipFirstName(UtilityClass.GetTD(0, 0));
		photo.EnterDEVUploadPhotoclipLastName(UtilityClass.GetTD(0, 1));
		//photo.SelectDEVUploadPhotoclipDateOfBirth(UtilityClass.GetTD(0, 2));
		//photo.SelectDEVUploadPhotoclipMaritalStatus(driver);
		//photo.SelectDEVUploadPhotoclipBloodGroup(driver);
		photo.EnterDEVUploadPhotoclipMobileNo(UtilityClass.GetTD(0, 3));
		//String filePath= "C:\\Users\\h\\Pictures\\HD-wallpaper-lord-ganesh-dagdusheth-ganpati-bappa new.jpg";
		photo.UploadDEVUploadPhotoclip();
		Thread.sleep(5000);
		//create.ClickDEVFrontDeskAddInfo();
		photo.ClickMenuIcon();
		photo.ClickDEVUploadPhotoclipAddInfo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		photo.EnterDEVUploadPhotoclipLocality(UtilityClass.GetTD(0, 4), driver);
		Thread.sleep(2000);
		photo.EnterDEVUploadPhotoclipAddressandInformation(UtilityClass.GetTD(0, 5));
		photo.EnterDEVUploadPhotoclipEmailOfficial(UtilityClass.GetTD(0, 6));
        Thread.sleep(2000);
        photo.ClickDEVUploadPhotoclipSubmitBtn();
		
		
	}
}
