package pages;

import Utils.logs.Log;
import Utils.reusableMethods.wait;
import baseClass.initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class myPodsPage extends initialize {

    static By mypodstabxpath = By.xpath("//span[contains(text(),'My Pods')]");
    static By podxpath = By.xpath("//span[contains(text(),'AE_POD')]");
    static By pendingnominationxpath = By.xpath("//span[contains(text(),'Pending')][1]");
    static By ddlxpath = By.xpath("//div[@class = 'ant-select-selector']");
    static By confidancelevelxpath = By.xpath("//div[@title = 'High']");
    static By submittickxpath = By.xpath("//button[@class = 'ant-btn ant-btn-text submit-btn']");
    static By closenominationstabxpath = By.xpath("//span[@class = 'ant-modal-close-x']");
    static By firstrequestxpath = By.xpath("//div[contains(text(),'Saji')][1]");
    static By allocationtabxpath = By.xpath("//span[contains(text(),'Allocations')]");
    static By allocationsubtabxpath = By.xpath("//div[contains(@class, 'ant-tabs-tab-btn') and contains(., 'Allocation')]");
    static By nominationsubtabxpath = By.xpath("//div[contains(@class, 'ant-tabs-tab-btn') and contains(., 'Nomination')]");
    static By viewresponsebuttonxpath = By.xpath("//button[contains(.,'View Responses')]");
    static By secondviewresponsexpath = By.xpath("//tr[@class = 'ant-table-row ant-table-row-level-0 pointer'][2]");
    static By selectbuttonxpath = By.xpath("//button[contains(., 'Select')]");
    static By closewindowxpath = By.xpath("//span[@class = 'anticon anticon-close ant-modal-close-icon']");
    static By hashernamexpath = By.xpath("//h2[@class = 'name']");
    static By selectonenominationxpath = By.xpath("//tr[@class = 'ant-table-row ant-table-row-level-0 pointer'][1]");
    static By deletehasherbuttonxpath = By.xpath("//button[@class = 'ant-btn ant-btn-text btn-sec']");






    public static void podsConfidence() throws InterruptedException {
        Thread.sleep(8000);
        wait.setImplicitWait(60);
        WebElement first = driver.findElement(By.xpath("//span[contains(text(),'My Pods')]"));
        first.click();
//        driver.findElement(mypodstabxpath);
        wait.setImplicitWait(60);
        Log.info("Opening Allocation POD");
        driver.findElement(podxpath).click();
//        Thread.sleep(1*60*1000); // wait for 3 minutes
//        refreshPage.page_refresh();
        Log.info("Opening first role");
        driver.findElement(pendingnominationxpath).click();
        Log.info("Opening ddl");
        driver.findElement(ddlxpath).click();
        driver.findElement(confidancelevelxpath).click();
        driver.findElement(submittickxpath).click();
        driver.findElement(closenominationstabxpath).click();
        Thread.sleep(2000);
        driver.findElement(pendingnominationxpath).click();
        driver.findElement(ddlxpath).click();
        driver.findElement(confidancelevelxpath).click();
        driver.findElement(submittickxpath).click();
        driver.findElement(closenominationstabxpath).click();

    }

    public static void selectHasher()
    {
        driver.findElement(allocationtabxpath).click();
        driver.findElement(firstrequestxpath).click();
        wait.setImplicitWait(60);
        driver.findElement(allocationsubtabxpath).click();
        wait.setImplicitWait(60);
        driver.findElement(viewresponsebuttonxpath).click();
        driver.findElement(selectbuttonxpath).click();
        wait.setImplicitWait(60);
        driver.findElement(closewindowxpath).click();

        driver.findElement(secondviewresponsexpath).click();
        driver.findElement(selectbuttonxpath).click();
        wait.setImplicitWait(60);
        driver.findElement(closewindowxpath).click();

        String hasherName = driver.findElement(hashernamexpath).getText();
        Log.info(hasherName);

    }

    public static void selectFinalHasher()
    {
        driver.findElement(nominationsubtabxpath).click();
        wait.setImplicitWait(60);
        driver.findElement(selectonenominationxpath).click();
        driver.findElement(deletehasherbuttonxpath);
    }
}
