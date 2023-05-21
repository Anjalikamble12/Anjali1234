package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


public class IDlocator {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe" );
	
		ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	   WebDriver driver=new ChromeDriver(co);
	   driver.manage().window().maximize();
	   
	   driver.get("file:///C:/Users/anjali%20survase/Desktop/INFORMATION%20DETAIL/html/single%20select%20dropdown.html");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.id("i1")).click();
}
}
