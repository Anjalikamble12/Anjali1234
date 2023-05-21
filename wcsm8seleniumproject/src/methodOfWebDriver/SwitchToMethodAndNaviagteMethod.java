package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethodAndNaviagteMethod {
     //is used to switch the control
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver","./driver/gecko.exe");
		
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        //will launch web application by using navigate method
        
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        //switch the control to Active Element
        
        driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
        
        //use back operation
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
             
	}

}
