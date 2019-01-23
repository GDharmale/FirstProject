package ListenetDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("The Name of the Test Case Failed:"+Result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The Name of the Test Case Skipped:"+Result.getName());		
	}

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println("The Name of the Test Case Started:"+Result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("The Name of the Test Case Sucess:"+Result.getName());
		
	}

}
