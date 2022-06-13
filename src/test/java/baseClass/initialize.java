package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.allocationPage;
import pages.loginPage;
import pages.myPodsPage;
import pages.nominationPage;

import java.util.concurrent.TimeUnit;

public class initialize {

    public static WebDriver driver;
    @BeforeTest
    public static WebDriver initialSetup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://dna-staging.hashedin.com/allocation/allocate/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    @Test(priority = 0)
    public void loginMethod() throws InterruptedException {
        loginPage.loginSteps();
//        loginPage.verifyTitle();
    }

    @Test(priority = 1)
    public void allocationPageMethod() throws InterruptedException {

//        allocationPage.visibleTabs();
//        allocationPage.verifyMostRecentPod();
//        allocationPage.verifyTogglingTwoTabs();
    }

    @Test(priority = 2)
    public void nominationPageMethods() throws InterruptedException {
        nominationPage.nominatingFirst();
        nominationPage.nominatingSecond();
    }

    @Test(priority = 3)
    public void myPodsPageMethods() throws InterruptedException {
//        loginPage.loginSteps();
//        myPodsPage.podsConfidence();
//        myPodsPage.selectHasher();
//        myPodsPage.selectFinalHasher();
    }
//    @AfterTest
//    public static void terminate()
//    {
//
//        driver.close();
//    }
}
