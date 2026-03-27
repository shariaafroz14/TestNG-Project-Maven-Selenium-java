package Annotation;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class Annotation3 {
	
	@Test (groups= {"smoke Testing "})
	public void group1()
	{
		System.out.println("Running under Group1");
		
	}
	@Test (groups= {"smoke Testing ","sanity Testing"})
	public void group2()
	{
		System.out.println("Running under before group");
	}
	@AfterGroups
	public void afterGroup()
	{
		System.out.println("Running under before Group");
	}
}


