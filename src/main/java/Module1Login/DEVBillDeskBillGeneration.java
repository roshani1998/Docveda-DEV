package Module1Login;

import java.awt.Desktop.Action;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DEVBillDeskBillGeneration 
{

	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement Menu;
	@FindBy(xpath = "(//div[@aria-label='Bill Desk'])[1]") private WebElement BillDeskIcon;
	@FindBy(xpath = "(//div[@aria-label='Bill Generation'])[1]") private WebElement BillGeneration;
	@FindBy(xpath = "(//img[@aria-label='Bill Generation'])[1]") private WebElement OpdBillIcon;
	@FindBy(xpath = "(//input[contains(@name,'Tariff_Scheme_Mst_Cd')])[1]") private WebElement Tariff;
	@FindBy(xpath = "(//input[@placeholder='Search by keywords'])[1]") private WebElement Service;
	@FindBy(xpath = "(//img[contains(@class,'w-12 cursor-pointer')])[1]") private WebElement ClickForwardIcon;
	@FindBy(xpath = "(//input[contains(@name,'discount')])[1]") private WebElement DAmount;
	@FindBy(xpath = "(//input[contains(@name,'Sys_Ric_Glc_Discount_Reason_Mst_Cd')])[1]") private WebElement ReasonOfDis;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Glb_Payment_Mode_Mst_Cd'])[1]") private WebElement PaymentMode;
	@FindBy(xpath = "(//input[@name='Sys_Ric_Glb_Instrument_Source_Mst_Cd'])[1]") private WebElement PaymentBy;
	@FindBy(xpath = "(//input[@name='amount'])[1]") private WebElement Amount;
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]") private WebElement Submit;
	
	public DEVBillDeskBillGeneration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickDEVBillDeskMenuBtn() 
	{
		Menu.click();
	}
	
	public void ClickDEVBillDeskIcon() 
	{
		BillDeskIcon.click();
	}
	
	public void ClickDEVBillDeskBillGenerationIcon() 
	{
		BillGeneration.click();
	}
	
	public void ClickDEVBillDeskOpdBillIcon() 
	{
	    OpdBillIcon.click();	
	}
	
	public void SelectDEVBillDeskTariffScheme(WebDriver driver) throws InterruptedException 
	{
		Tariff.click();
		Thread.sleep(2000);
		
		WebElement Tarr = driver.findElement(By.xpath("//div[normalize-space()='General']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Tarr).click().build().perform();
	}
	
	public void EnterDEVBillDeskServices(WebDriver driver) throws InterruptedException 
	{
	   Service.sendKeys("Gas");	
	   Thread.sleep(3000);
	   
	   WebElement ser = driver.findElement(By.xpath("(//div[contains(@class,'w-full')])[9]"));
	   
	   Actions act=new Actions(driver);
	   
	   act.moveToElement(ser).click().build().perform();
	}
	
	public void ForwardDEVBillDeskService() 
	{
	    ClickForwardIcon.click();	
	}
	
	public void EnterDEVBillDeskDiscoutAmount() 
	{
	     DAmount.sendKeys("100");	
	}
	
	public void EnterDEVBillDeskReasonOfDiscount(WebDriver driver) 
	{
	      ReasonOfDis.click();
	      
	      WebElement Reas = driver.findElement(By.xpath("//div[normalize-space()='Others']"));
	      
	      Actions act=new Actions(driver);
	      
	      act.moveToElement(Reas).click().build().perform();
	}
	
	public void SelectDEVBillDeskPaymentMode(WebDriver driver) throws InterruptedException 
	{
		PaymentMode.click();
		Thread.sleep(2000);
		
		WebElement PayM = driver.findElement(By.xpath("//div[normalize-space()='Offline']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PayM).click().build().perform();
	}
	
	public void SelectDEVBillDeskPaymentBy(WebDriver driver) throws InterruptedException 
	{
		PaymentBy.click();
		Thread.sleep(3000);
		
		WebElement PayB = driver.findElement(By.xpath("//div[normalize-space()='Cash']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(PayB).click().build().perform();
	}
	
	public void EnterDEVBillDeskAmount(WebDriver driver) throws InterruptedException 
	{
	   //Amount.clear();
		//SelectedDate.clear();
		Amount.sendKeys("Selenium");
			      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
			      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		Amount.sendKeys(s);
			      // sending DELETE key
	    Amount.sendKeys(org.openqa.selenium.Keys.DELETE);
	    
	   Thread.sleep(2000);
	   Amount.sendKeys("1600");
	   
	   Thread.sleep(2000);
	   
	   WebElement plus = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[4]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[7]/button[1]/div[1]"));
	   
	   Actions act=new Actions(driver);
	   
	   act.moveToElement(plus).click().build().perform();
	   
	}
	
	public void ClickDEVBillDeskSubmitBtn() 
	{
		Submit.click();
	}
}
