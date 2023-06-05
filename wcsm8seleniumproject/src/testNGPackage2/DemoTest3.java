package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
  public void f() {
	  Reporter.log("f method From DemoTest3",true);
	  
  }
  @Test
  public void h()
  {
	  Reporter.log("h method From DemoTest3",true);  
  }
  @Test
  public void i()
  {
	  Reporter.log("i method From DemoTest3",true); 
  }
  
}
