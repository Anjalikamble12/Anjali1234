package dynamicScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;


public class BaseTest {
	static WebDriver driver;
  @BeforeTest
  public void f() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  
  }
  @BeforeMethod
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do;jsessionid=9rael45rhyvk");
  }
  public void FailedMethod(String failedMethod ) throws IOException
  {
	  try
	  {
     TakesScreenshot ts = (TakesScreenshot)driver;
     File src = ts.getScreenshotAs(OutputType.FILE);
     File file = new File("./ScreenShot/"+failedMethod+".jpg");
     Files.copy(src, file);
   
  }
  catch(Exception e)
	  {
	  driver.quit();
	  }
  
  
}
}
