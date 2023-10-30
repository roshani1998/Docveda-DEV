package Module1Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVBillDeskRefund 
{

	@FindBy(xpath = "(//div[@aria-label='Refund'])[1]") private WebElement Refund;
	@FindBy(xpath = "(//img[contains(@aria-label,'Bill Refund')])[1]") private WebElement BillRefundIcon;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_Glb_Payment_Mode_Mst_Cd')])[1]") private WebElement PaymentMode;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Glb_Instrument_Source_Mst_Cd'])[1]") private WebElement PaymentBy;
	@FindBy(xpath = "(//input[@name='Sys_Dynamic_Value_Master_Cd'])[1]") private WebElement RefundReason;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement Submit;
    
    public DEVBillDeskRefund(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void ClickDEVBillDeskRefundIcon() 
    {
		Refund.click();
	}
    
    public void ClickDEVBillDeskBillRefundIcon() 
    {
		BillRefundIcon.click();
	}
    
    public void SelectDEVBillDeskRefundPaymentMode(WebDriver driver) throws InterruptedException 
    {
		PaymentMode.click();
		
		Thread.sleep(2000);
		
        WebElement PayM = driver.findElement(By.xpath("//div[normalize-space()='Offline']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PayM).click().build().perform();
	}
    
    public void SelectDEVBillDeskRefundPaymentBy(WebDriver driver) throws InterruptedException 
    {
		PaymentBy.click();
		Thread.sleep(2000);
		
	    WebElement PayB = driver.findElement(By.xpath("//div[normalize-space()='Cash']"));
			
		Actions act=new Actions(driver);
			
		act.moveToElement(PayB).click().build().perform();
	}
    
    public void SelectDEVBillDeskRefundReason(WebDriver driver) throws InterruptedException 
    {
		RefundReason.click();
		
		Thread.sleep(2000);
		
	    WebElement reason = driver.findElement(By.xpath("//div[normalize-space()='AUTHORIZES REFUND BY DR']"));
			
		Actions act=new Actions(driver);
			
		act.moveToElement(reason).click().build().perform();
	}
    
    public void ClickDEVBillDeskRefundSubmitBtn() 
    {
		Submit.click();
	}
    
    
	
}
