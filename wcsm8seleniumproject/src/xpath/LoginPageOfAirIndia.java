package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageOfAirIndia {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		
		driver.get("https://www.airindia.in/ ");
		Thread.sleep(2000);
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=d2N6RUxxcVRvOHM1MlRtZDNvekd0cXo5RW9qLjNlTFNyMTJPYVJKS0VFZVF5_en-GB_false_&nonce=d2N6RUxxcVRvOHM1MlRtZDNvekd0cXo5RW9qLjNlTFNyMTJPYVJKS0VFZVF5&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=AFj-Ovv8Oz2PSOCLmrJ4V1skuGvsyvoPRzXr_KyFaKU&ui_locales=en-GB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("anjukamble66@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anju@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='forgotPassword']")).click();
		driver.close();
	}

}
