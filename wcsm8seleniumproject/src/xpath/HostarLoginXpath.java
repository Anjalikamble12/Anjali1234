package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HostarLoginXpath {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='email-or-fb-signin']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='emailID']")).sendKeys("anjukamble@66gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		driver.close();
		
	}

}
