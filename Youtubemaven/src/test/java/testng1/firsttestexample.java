package testng1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@Test
public class firsttestexample {
  public void f() {
	  System.out.println("In test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("In before test");
}

  @AfterTest
  public void afterTest() {
	  System.out.println("In after test");
  }

}
