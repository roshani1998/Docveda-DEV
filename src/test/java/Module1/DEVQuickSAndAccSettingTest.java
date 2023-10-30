package Module1;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1Login.DEVLogin;
import Module2Profile.DEVEditProfile;


public class DEVQuickSAndAccSettingTest extends BaseClass
{

	DEVLogin login;
	DEVEditProfile profile;
	
	@BeforeClass
	public void OpenBrowser() 
	{
		Initializebrowser();
		
		login= new DEVLogin(driver);
		profile= new DEVEditProfile(driver);
	}
	
	@Test(priority = 1)
	public void LoginToApp() throws IOException, InterruptedException 
	{
		login.ClickDEVLoginPageLoginButton();
		login.EnterDEVLoginPageClinicID(UtilityClass.GetPFD("ClinicId"));
		login.EnterDEVLoginPageUN(UtilityClass.GetPFD("UN"));
		login.EnterDEVLoginPagePWD(UtilityClass.GetPFD("PWD"));
		login.ClickDEVLoginPageSignInButton();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void EditProfile() throws IOException, InterruptedException 
	{
		Thread.sleep(2000);
		profile.ClickDEVEditProfileAccSettingBtn();
		profile.ClickDEVEditProfileProfileTab();
		profile.EditDEVEditPofileLocality(driver);
		profile.EditDEVEditProfileEmailOff(UtilityClass.GetTD(0, 7));
		profile.EditDEVEditProfileMobNumber(UtilityClass.GetTD(0, 8));
	}
}
