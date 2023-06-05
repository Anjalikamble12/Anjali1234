package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  
	  public void e() {
		  Reporter.log("e method From DemoTest2",true);
  }
  
  @Test
  public void f() {
	  Reporter.log("f method From DemoTest2",true);
}
  
  @Test
  public void f1() {
	 
	  Reporter.log("f1 method From DemoTest2",true);
}
}
