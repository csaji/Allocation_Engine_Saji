package pages;

import Utils.logs.Log;
import baseClass.initialize;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class allocationPage extends initialize {
    static By openpodxpath = By.xpath("//div[@id= 'rc-tabs-0-tab-openPods']");
    static By closedpodxpath = By.xpath("//div[@id= 'rc-tabs-0-tab-closedPods']");
    static By upcomingpodxpath = By.xpath("//div[@id= 'rc-tabs-0-tab-upcomingPods']");
    static  By recentpodinlistxpath = By.xpath("//tr[@class='ant-table-row ant-table-row-level-0'][1]/td[2]");
    static By allocationtabxpath = By.xpath("//span[contains(text(),'Allocations')]");
    static  By mynominationtabxpath = By.xpath("//span[contains(text(),'My Nominations')]");

    public static void visibleTabs()
    {
        Log.info("Verifying Open Pods tab");
        String open_head = driver.findElement(openpodxpath).getText();
//        System.out.println(open_head);
        Assert.assertEquals(open_head, "Open Pods");

        Log.info("Verifying Closed Pods tab");
        String close_head = driver.findElement(closedpodxpath).getText();
//        System.out.println(close_head);
        Assert.assertEquals(close_head, "Closed Pods");

        Log.info("Verifying Upcoming Pods tab");
        String upcoming_head = driver.findElement(upcomingpodxpath).getText();
//        System.out.println(upcoming_head);
        Assert.assertEquals(upcoming_head, "Upcoming Pods");
    }
    public static void verifyMostRecentPod()
    {
        Log.info("Checking Most recently updated pod is displayed");
        String recentpod = driver.findElement(recentpodinlistxpath).getText();
        Log.info("Most recent pod Name");
        System.out.println(recentpod);
    }

    public static void verifyTogglingTwoTabs() throws InterruptedException {
        Thread.sleep(5000);
        Log.info("Check AO is able to see and toggle between the 2 Tabs - Allocations , My Nominations in the AE");
        driver.findElement(mynominationtabxpath).click();
        String allocationtab = driver.findElement(allocationtabxpath).getText();
        Log.info(allocationtab);
        Assert.assertEquals(allocationtab, "Allocations");
        String mynominationtab = driver.findElement(mynominationtabxpath).getText();
        Log.info(mynominationtab);
        Assert.assertEquals(mynominationtab,"My Nominations");
        driver.findElement(mynominationtabxpath).click();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().back();
    }

}
