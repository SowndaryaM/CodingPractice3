package JavaSessions_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit ref=null;
	private WebDriver driver;
	
	private DriverInit()
	{
		
	}
	
	public WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static DriverInit getInstance()
	{
		if(ref==null)
		
			ref=new DriverInit();
		return ref;
	}
}
