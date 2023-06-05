package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {
	static WebDriver driver;
	public void setup() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		 String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		 String url = flib.readPropertyData(PROP_PATH, "url");
		 
		 if (browserValue.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty(CHROME_KEY,CHROME_PATH );
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);

		 }
		 else if (browserValue.equalsIgnoreCase("Firefox"))
		 {
			 System.setProperty(GECKO_KEY,GECKO_PATH );
				
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);

		 }
		 
		 
		 
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
