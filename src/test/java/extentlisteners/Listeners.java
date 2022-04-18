package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.ScreenShot;

public class Listeners extends BaseTest implements ITestListener{

	ExtentReports extent = ExtentReportGen.extentReportGenerator();
	
	public static ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started: "+result.getName());
		 test = extent.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed: "+result.getName());
		test.log(Status.PASS, "Test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed:"+result.getName());
		
		
		test.fail(result.getThrowable());
		try {
			test.addScreenCaptureFromPath(ScreenShot.captureScreenShotWithreturnPath(driver, result.getName()));
		} catch (IOException e) {
			
			System.out.println("Exception arrived while taking the screen shot");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test started:"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test completed:"+context.getName());
		
		extent.flush();
	}
	
	
}
