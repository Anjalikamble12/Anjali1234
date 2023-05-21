package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		//to launch chrome browser
		System.setProperty("Webdriver.chrome.driver","drivers/Chromedriver.exe");
		
		new ChromeDriver();
	}

}
