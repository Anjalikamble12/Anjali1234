package dynamicScreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDataProvider {
	static WebDriver driver;
  @BeforeTest
  
  public void property()
  {
	  System.setProperty("Webdriver.chrome.driver","./drivers.chromedriver.exe");

  }
  @BeforeMethod
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do;jsessionid=npyyi6pr2sq");
  }
  @DataProvider(name="testActitime")
  public Object[][]dataprovider()
  {
	  Object[][]dataprovider=new Object[5][2];
	  dataprovider[0][0]="admin";
	  dataprovider[1][0]="manager";
	  
	  dataprovider[1][0]="admin123";
	  dataprovider[1][1]="manager12";
	  
	  dataprovider[2][0]="admin@12";
	  dataprovider[2][1]="manager@123";
	  
	  dataprovider[3][0]="admin#";
	  dataprovider[3][1]="manager#12";
	  
	  dataprovider[4][0]="admin1234";
	  dataprovider[4][1]="manager12";
	   
	  return dataprovider;
	  
  }
  @Test(dataProvider="testActitime")
  public void loginInvalid(String usn,String pass) throws InterruptedException
  {
	  driver.findElement(By.name("username")).sendKeys(usn);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).clear();
	  
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
  
}
