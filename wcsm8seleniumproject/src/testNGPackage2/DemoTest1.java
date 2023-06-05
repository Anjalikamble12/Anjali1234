package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  
	  @Test
	  public void f() {
		  Reporter.log("f method From DemoTest1",true);
  }
	  @Test
	  public void b()
	  {
		  Reporter.log("b method From DemoTest1",true);
	  }
	  @Test
	  public void j()
	  {
		  Reporter.log("j method From DemoTest1",true);
	  }
}
