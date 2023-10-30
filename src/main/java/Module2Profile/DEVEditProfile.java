package Module2Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Module1Login.DEVLogin;

public class DEVEditProfile 
{

	@FindBy(xpath = "//div//div[@aria-label='Account settings']") private WebElement Account;
	@FindBy(xpath = "//div[text()='Profile']") private WebElement Profile;
	@FindBy(xpath = "//input[@name='Locality']") private WebElement Locality;
	@FindBy(xpath = "//input[@name='EmailId_Official']") private WebElement EmailOff;
	@FindBy(xpath = "//input[@name='MobileNo_Messaging']") private WebElement MobNo;
	
	
	public DEVEditProfile(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);  
	}
	
	public void ClickDEVEditProfileAccSettingBtn() 
	{
		Account.click();
	}
	
	public void ClickDEVEditProfileProfileTab() 
	{
		Profile.click();
	}
	
	public void EditDEVEditPofileLocality(WebDriver driver) throws InterruptedException 
	{
		Locality.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
//		Locality.sendKeys("Thane");
//		driver.findElement(By.xpath("(//div[@class='p-2 hover:bg-gray-100 cursor-pointer border-dashed border-b'])[3]")).click();
	}
	
	public void EditDEVEditProfileEmailOff(String EmailIdOff) throws InterruptedException 
	{
		EmailOff.clear();
//		Thread.sleep(2000);
//		EmailOff.sendKeys(EmailIdOff);
	}
	
	public void EditDEVEditProfileMobNumber(String MobNo1) throws InterruptedException 
	{
		MobNo.clear();
//		Thread.sleep(2000);
//		MobNo.sendKeys(MobNo1);
	}
}
