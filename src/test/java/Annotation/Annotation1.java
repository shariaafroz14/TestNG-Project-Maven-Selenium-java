package Annotation;

import org.testng.annotations.Test;

public class Annotation1 {
	
	@Test (invocationCount=3)
	public void facebooklogin()
	{
		System.out.println("facebook login sucessfully");
	}
	@Test (enabled=false)
	public void searchBox()
	{
		System.out.println("search text box found");
	}
	@Test
	public void facebookLogout()
	{
		System.out.println("facebooklogoutsucessfully");
	}

}
