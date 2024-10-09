package Test;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class NewTest002 {
	@Test
	public void executeFailedTests() 
	{
		TestNG testng = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add("test-output/testng-failed.xml");
		testng.setTestSuites(suites);
		System.out.println("failed method is now executed");
		testng.run();
	}
}
