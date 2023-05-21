package webBasePopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/anjali%20survase/Desktop/INFORMATION%20DETAIL/Alert.html");
		
		//generate alert
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		//handle alert
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept
		System.out.println(al.getText());
		al.dismiss();
		
		
		
		
		
		
		
	}

}
