package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void g() {
	  System.out.println("Hey Java!!!");
	  Reporter.log("Hey Java", true);
  }
}
