package Module1Login;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.BaseClass;

public class DEVLogin 
{
	 
	@FindBy(xpath = "(//button[normalize-space()='Login for Doctors'])[1]") private WebElement LoginBtn;
	@FindBy(xpath = "//input[@name='entityOrgId']") private WebElement ClinicId;
	@FindBy(xpath = "//input[@name='userName']") private WebElement UN;
	@FindBy(xpath = "//input[@name='password']") private WebElement PWD;
	@FindBy(xpath = "//Div[text()='Sign in']") private WebElement SignInBtn;
	
	public DEVLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDEVLoginPageLoginButton()  
	{
		LoginBtn.click();
	}
	
	public void EnterDEVLoginPageClinicID(String ClnID) 
	{
		ClinicId.sendKeys(ClnID);
	}
	
	public void EnterDEVLoginPageUN(String Username) 
	{
	    UN.sendKeys(Username);	
	}
	
	public void EnterDEVLoginPagePWD(String Password) 
	{
		PWD.sendKeys(Password);
	}
	
	public void ClickDEVLoginPageSignInButton() 
	{
		SignInBtn.click();
	}
	
}
