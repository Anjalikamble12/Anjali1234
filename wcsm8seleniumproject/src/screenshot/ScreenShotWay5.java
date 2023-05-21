package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//consider we are taking of selenium.dev wp
		
		driver.get("https:www.selenium.dev");
	
	TakesScreenshot ts =(TakesScreenshot)driver;
		
		//implementation of method
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./ScreenShot/ss1.png");
	 
	 Files.copy(src, dest);
	 
	 
	 
	
		
        
	}

}
