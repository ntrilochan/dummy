package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest001 {
  @Test(description = "Test case 1",priority = 1)
  public void testcase01() 
  {
	  System.out.println("test-1 executed");
  }
  @Test(priority = 2,timeOut = 2000)
  public void testcase02() 
  {
	  System.out.println("test-2 executed");
  }
  @Test(dependsOnMethods = {"testcase01","testcase02"})
  public void testcase03() 
  {
	  System.out.println("test-3 executed");
  }
  @Test(expectedExceptions = Exception.class)
  public void testSimpleString() 
  {
      String expected = "Hello";
      String actual = "World";
      Assert.assertEquals(actual, expected, "Simple string comparison should fail");
  }
}
