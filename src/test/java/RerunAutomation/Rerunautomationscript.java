package RerunAutomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITest;
import org.testng.ITestResult;

public class Rerunautomationscript implements IRetryAnalyzer {

	
	private int retrycount = 0;
	private static final int maxcount = 5;
	
	

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if(retrycount < maxcount) {
			retrycount++;
		}
		
		
		return false;
	}
	
	}	