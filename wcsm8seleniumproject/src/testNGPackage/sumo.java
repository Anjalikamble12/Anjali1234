package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sumo {
  @Test
  public void h() {
	  System.out.println("Hiii TestNG!!");
	  Reporter.log("Hiii TestNG!!", true);
  }
}
