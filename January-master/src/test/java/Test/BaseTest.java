package Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest extends Utils
{

    @BeforeMethod

    public void before()
    {

        chrome_Driver();
    }

    @AfterMethod
    public void after(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            try {
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                File source = ts.getScreenshotAs(OutputType.FILE);
//                 i dont know why its showing red= FileUtils.copyFile(source, new File("src\\main\\java\\Screenshots" + result.getName() + ".png"));
//                System.out.println("Screenshot taken");
//            } catch (Exception e) {
//                System.out.println("exception while taking Screenshot " + e.getMessage());
//            }
//
//        }
        driver.quit();
    }



}

