package operatinalmethod;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreesetMethod {
	public static void main(String[] args) {
		//TODO Auto generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/anjali%20survase/Desktop/INFORMATION%20DETAIL/html/single%20select%20dropdown.html");
		WebElement dropDown = driver.findElement(By.name("n1"));
		
		//to handle dropdown create object of select class
	Select sel = new Select(dropDown);
	
	//to get all the options from dropDown 

	List<WebElement> allOptions = sel.getOptions();
	
	//to eliminate the duplicates and maintain insertion order
	TreeSet<String> t1 = new TreeSet<String>();
	for(int i=0; )
		
	}

	
}
