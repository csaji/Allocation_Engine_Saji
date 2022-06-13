package Utils.listeners;

import Utils.logs.Log;
import baseClass.initialize;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import java.io.File;
import java.io.IOException;

public class Listeners extends initialize implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("Test Case started ",true);
        Log.info("Successfully started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("test success");
        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("src/test/java/Utils/screenShots/success/" +File.separator + result.getName()+ "_success_screenshots.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //location to store the screenshot
            FileUtils.copyFile(screenshotFile, new File("src/test/java/Utils/screenShots/failure/" +File.separator + result.getName()+ "_failure_screenshot.jpg"));
            Log.info("Screenshot saved");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
