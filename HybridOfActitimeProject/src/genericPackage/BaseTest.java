package genericPackage;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import jdk.javadoc.doclet.Reporter;

public class BaseTest extends Flib implements IAutoConstant{
protected static WebDriver driver;
	
	// it is use to open the browser & close the browser
	@BeforeMethod
	public void setUp()
	{
		Flib flib = new Flib();
		String browserValue=flib .readPropertyData(PROP_PATH, "browser");
		String url=flib.readPropertyData(PROP_PATH, "url");
		
		if (browserValue.equalsIgnoreCase("chrome"));
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);	
		}
	
}
