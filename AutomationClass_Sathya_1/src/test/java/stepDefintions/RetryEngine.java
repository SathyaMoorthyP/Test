package stepDefintions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryEngine implements IRetryAnalyzer {

	int retryCount = 0;
	
	public boolean retry(ITestResult result) {
	
		if (retryCount < 2) {
		return true;
		}
		
		else {
		return false;
	}
}
}
