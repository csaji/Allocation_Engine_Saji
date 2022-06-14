package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

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
    public void TC01_loginMethod() throws InterruptedException {
        loginPage.loginSteps();
    }

    @Test(priority = 1)
    public void TC02_allocationPageMethod() throws InterruptedException {
        //        loginPage.verifyTitle();

    }

    @Test(priority = 2)
    public void TC03_visibleTabMethod(){
        //        allocationPage.visibleTabs();


    }
    @Test(priority = 3)
    public void TC04_togglingTabMethod()
    {
        //        allocationPage.verifyTogglingTwoTabs();

    }    @Test(priority = 4)
    public void TC05_verifyMostRecentPodMethod()
    {
        //        allocationPage.verifyMostRecentPod();

    }


    @Test(priority = 5)
    public void TC16_nominationPageMethods() throws InterruptedException {
        nominationPage.nominatingFirst();
        nominationPage.nominatingSecond();
    }

    @Test(priority = 6)
    public void TC17_myPodsPageMethods() throws InterruptedException {
//        loginPage.loginSteps();
        myPodsPage.podsConfidence();
        myPodsPage.selectHasher();
//        myPodsPage.selectFinalHasher();
    }

    @Test(priority = 6)
    public void TC18_confirmStatusMethods() throws InterruptedException {
//        checkingStatus.podsStatus();

    }
//    @AfterTest
//    public static void terminate()
//    {
//
//        driver.close();
//    }
}
