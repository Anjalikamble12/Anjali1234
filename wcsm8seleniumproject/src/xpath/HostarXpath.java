package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HostarXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='phoneNo']")).sendKeys("9623438834");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		Thread.sleep(2000);
		driver.close();		
		
	}

}
