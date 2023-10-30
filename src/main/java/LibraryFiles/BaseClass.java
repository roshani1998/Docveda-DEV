package LibraryFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	//Author Roshani Ghotekar
	//Code to open browser and launch website 
	protected WebDriver driver;
	public void Initializebrowser() 
	
	{
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
		
		  driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//driver.get("https://dev-dv.docveda.in/front-desk");
		driver.get("https://www.docveda.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
