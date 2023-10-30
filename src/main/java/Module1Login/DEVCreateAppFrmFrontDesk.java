package Module1Login;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class DEVCreateAppFrmFrontDesk 
{

	@FindBy(xpath = "(//div[@class='flex items-center justify-between py-1']//a)[1]") private WebElement Appointment;
	@FindBy(xpath = "(//input[@placeholder='Search By Name, Mobile #, Reg #'])[1]") private WebElement Search;
	@FindBy(xpath = "(//input[contains(@placeholder,'dd/mm/yyyy hh:mm (a|p)m')])[1]") private WebElement SelectedDate;
	@FindBy(xpath = "(//input[contains(@placeholder,'dd/mm/yyyy hh:mm (a|p)m')])[2]") private WebElement EndDate;
	@FindBy(xpath = "(//div[@role='button'])[3]") private WebElement PurposeOfVisit;
	@FindBy(xpath = "(//div[contains(@role,'button')])[4]") private WebElement VisitType;
	@FindBy(xpath = "(//button[@type='submit'])[3]") private WebElement ScheduleBtn;
	@FindBy(xpath = "(//div[contains(@class,'space-x-4 flex')]//div)[1]") private WebElement Menu;
	@FindBy(xpath = "(//div[@aria-label='Front Desk'])[1]") private WebElement FrontDeskIcon;
	@FindBy(xpath = "//button[contains(@aria-label,\"close\")]") private WebElement Close;
	
	
	public DEVCreateAppFrmFrontDesk(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterDEVCreateAppFrmFrontDeskSearchField() 
	{
		Search.sendKeys("Kalpit");
	}
	
	public void ClickDEVCreateAppFrmFrontDeskAppointmentIcon(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement PatientN = driver.findElement(By.xpath("//div[@id='patient-list-item']"));
		Actions act=new Actions(driver);
		act.moveToElement(PatientN).perform();
		Thread.sleep(1000);
		Appointment.click();
//		List<WebElement> allPatients = driver.findElements(By.xpath("//div[@class='overflow-y-auto']"));
//		String expText = "vinay";
//		for(WebElement s1:allPatients)
//		{
//			s1.gett
//		}
		
	}
	
	public void ClickDEVCreateAppFrmFrontDeskSlots(WebDriver driver) 
	{
//		driver.findElement(By.xpath("//button[text()='Today']")).click();
//		driver.findElement(By.xpath("//button[text()='Day']")).click();
		
		//List<WebElement> timeSlots = driver.findElements(By.className("rbc-day-slot rbc-time-column rbc-now rbc-today"));
		List<WebElement> timeSlots = driver.findElements(By.className("rbc-time-content"));
		
		WebElement selectedTimeSlot = timeSlots.get(0);
		
		selectedTimeSlot.click();
	
	}
	
	public void ClearSelectedDate(WebDriver driver) throws InterruptedException 
	{
		//SelectedDate.clear();
		SelectedDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		SelectedDate.sendKeys(s);
	      // sending DELETE key
		SelectedDate.sendKeys(org.openqa.selenium.Keys.DELETE);
		
         Thread.sleep(4000);

		Date date = new Date();
     	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
     	String strDate= formatter.format(date);
     	driver.findElement(By.xpath("(//input[contains(@placeholder,'dd/mm/yyyy hh:mm (a|p)m')])[1]")).sendKeys(strDate);
//     	//System.out.println(strDate);
//         Calendar now = Calendar.getInstance();
//          now.add(Calendar.MINUTE,20);
//       driver.findElement(By.xpath("(//input[contains(@placeholder,'dd/mm/yyyy hh:mm (a|p)m')])[1]")).sendKeys("now.add(Calendar.MINUTE,20);");
         
     	
	}
	
	
	public void ClickDEVCreateAppFrmFrontDeskEndDate(WebDriver driver) throws InterruptedException 
	{
		//End.click();
		EndDate.sendKeys("Selenium");
	      // sending Ctrl+a by Keys.Chord()
		String s = org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
	      //String s = Keys.chord(org.openqa.selenium.Keys.CONTROL, "a");
		EndDate.sendKeys(s);
	      // sending DELETE key
		EndDate.sendKeys(org.openqa.selenium.Keys.DELETE);
		
       Thread.sleep(4000);

    // Get the current time
       LocalDateTime currentTime = LocalDateTime.now();

       // Add 15 minutes to the current time
       LocalDateTime timeAhead = currentTime.plus(15, ChronoUnit.MINUTES);

       // Format the updated time as "dd/MM/yyyy"
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
       String formattedTime = timeAhead.format(formatter);
       driver.findElement(By.xpath("(//input[contains(@placeholder,'dd/mm/yyyy hh:mm (a|p)m')])[2]")).sendKeys(formattedTime);
	}
	
	
	public void SelectDEVCreateAppFrmFrontDeskPurposeOfVisit(WebDriver driver) 
	{
		PurposeOfVisit.click();
		WebElement c1 = driver.findElement(By.xpath("//li[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(c1).click().build().perform();
		
	}
	
	public void SelectDEVCreateAppFrmFrontDeskVisitType(WebDriver driver) 
	{
		VisitType.click();
		WebElement v1 = driver.findElement(By.xpath("//li[1]"));
		Actions act=new Actions(driver);
		
		act.moveToElement(v1).click().build().perform();
		
	}
	
	public void ClickDEVCreateAppFrmFrontDeskScheduleBtn() 
	{
		ScheduleBtn.click();
	}
	
	public void ClickCloseBtn() 
	{
		Close.click();
	}
	
	public void ClickDEVMenuBtn() 
	{
		Menu.click();
	}
	
	public void ClickDEVFrontDeskIcon() 
	{
		FrontDeskIcon.click();
	}
	
	
}
