package Module1Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVBillDeskCancellation 
{

	@FindBy(xpath = "(//div[contains(@aria-label,'Cancellation')])[1]") private WebElement Cancellation;
	@FindBy(xpath = "(//img[contains(@aria-label,'Bill Cancellation')])[1]") private WebElement BillCancellationIcon;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_Glc_Cancellation_Reason_Mst_Cd')])[1]") private WebElement CancellationReason1;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement SubmitBtn1;
	@FindBy(xpath = "(//input[contains(@value,'receipt')])[1]") private WebElement ReceiptRadioBtn;
	@FindBy(xpath = "(//img[contains(@aria-label,'Receipt Cancellation')])[1]") private WebElement ReceiptCancellation;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_Glc_Cancellation_Reason_Mst_Cd')])[1]") private WebElement CancellationReason2;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement SubmitBtn2;
	@FindBy(xpath = "(//input[contains(@value,'refund')])[1]") private WebElement RefundRadioBtn;
	@FindBy(xpath = "(//img[@aria-label='Refund Cancellation'])[1]") private WebElement RefundCancellation;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Glc_Cancellation_Reason_Mst_Cd'])[1]") private WebElement CancellationReason3;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement SubmitBtn3;
	
	
	public DEVBillDeskCancellation(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDEVBillDeskCancellationBtn() 
	{
		Cancellation.click();
	}
	
	public void ClickDEVBillDeskCancellationBillCancellationIcon() 
	{
		BillCancellationIcon.click();
	}
	
	public void SelectDEVBillDeskCancellationBillCancellationReason(WebDriver driver) throws InterruptedException 
	{
		CancellationReason1.click();
		Thread.sleep(2000);
		
		WebElement reas = driver.findElement(By.xpath("//div[normalize-space()='On Patient Demand']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(reas).click().build().perform();
	}
	
	public void ClickDEVBillDeskCancellationBillCancellationSubmit() 
	{
		SubmitBtn1.click();
	}
	
	public void ClickDEVBillDeskCancellationReceiptRadioBtn() 
	{
		ReceiptRadioBtn.click();
	}
	
	public void ClickDEVBillDeskCancellationReceiptcancellationIcon() 
	{
		ReceiptCancellation.click();
	}
	
	public void SelectDEVBillDeskCancellationReceiptCancellationReason(WebDriver driver) throws InterruptedException 
	{
		CancellationReason2.click();
		Thread.sleep(2000);
		
		WebElement reas = driver.findElement(By.xpath("//div[@class='text-sm'][normalize-space()='Others']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(reas).click().build().perform();
		
	}
	
	public void ClickDEVBillDeskCancellationReceiptcancellationSubMitBtn() 
	{
		SubmitBtn2.click();
	}
	
	public void ClickDEVBillDeskCancellationRefundRadioBtn() 
	{
		RefundRadioBtn.click();
	}
	
	public void ClickDEVBillDeskCancellationRefundCancellationIcon() 
	{
		RefundCancellation.click();
	}
	
	public void SelectDEVBillDeskCancellationRefundCancellationReason(WebDriver driver) throws InterruptedException 
	{
		CancellationReason3.click();
		Thread.sleep(2000);
		
		WebElement reas = driver.findElement(By.xpath("//div[normalize-space()='Wrong Entry']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(reas).click().build().perform();
		
	}
	
	public void ClickDEVBillDeskCancellationRefundCancellationSubmitBtn() 
	{
		SubmitBtn3.click();
	}
	
	
	
	
}
