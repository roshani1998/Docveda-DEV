package Module1Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVBillDeskReceipt 
{

	@FindBy(xpath = "(//div[contains(@aria-label,'Receipt')])[1]") private WebElement Receipt;
	@FindBy(xpath = "(//img[contains(@aria-label,'Bill Receipt')])[1]") private WebElement BillReceiptIcon;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_Glb_Payment_Mode_Mst_Cd')])[1]") private WebElement PaymentMode;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Glb_Instrument_Source_Mst_Cd'])[1]") private WebElement PaymentBy;
	@FindBy(xpath = "(//input[@name='amount'])[1]") private WebElement Amount;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement Submit;
	
	public DEVBillDeskReceipt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDEVBillDeskReceiptIcon() 
	{
		Receipt.click();
	}
	
	public void ClickDEVBillDeskReceiptBillReceiptIcon() 
	{
		BillReceiptIcon.click();
	}
	
	public void SelectDEVBillDeskReceiptPaymentMode(WebDriver driver) throws InterruptedException 
	{
		PaymentMode.click();
		Thread.sleep(2000);
		
        WebElement PayM = driver.findElement(By.xpath("//div[normalize-space()='Offline']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PayM).click().build().perform();
	}
	
	public void SelectDEVBillDeskReceiptPaymentBy(WebDriver driver) throws InterruptedException 
	{
		PaymentBy.click();
		Thread.sleep(2000);
		
       WebElement PayB = driver.findElement(By.xpath("//div[normalize-space()='Cash']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PayB).click().build().perform();
	}
	
	public void EnterDEVBillDeskReceiptAmount(WebDriver driver) throws InterruptedException 
	{
		Amount.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
        String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
         Amount.sendKeys(s);
	      // sending DELETE key
         Amount.sendKeys(org.openqa.selenium.Keys.DELETE);

         Thread.sleep(2000);
         Amount.sendKeys("800");

         Thread.sleep(2000);
         WebElement plus = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[7]/button[1]/div[1]"));
  	   
  	   Actions act=new Actions(driver);
  	   
  	   act.moveToElement(plus).click().build().perform();
	}
	
	public void ClickDEVBillDeskReceiptSubmitBtn() 
	{
		Submit.click();
	}
	
	
}
