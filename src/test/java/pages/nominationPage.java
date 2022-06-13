package pages;

import Utils.logs.Log;
import Utils.reusableMethods.wait;
import Utils.reusableMethods.refreshPage;
import baseClass.initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class nominationPage extends initialize {
    static By firstrequestxpath = By.xpath("//div[contains(text(),'Saji')][1]");
    static By nominatebuttonxpath = By.xpath("//button[contains(.,'Nominate')][1]");
//    static By filterbuttonxpath = By.xpath("//img[@src= '/allocation/static/media/account.be6286e0.svg']");
    static By filterbuttonxpath = By.xpath("//span[@class= 'ant-badge']");
    static By resetbuttonxpath = By.xpath("//button[@class = 'ant-btn ant-btn-default resetBtn']");
    static By applybuttonxpath = By.xpath("//button[@class = 'ant-btn ant-btn-primary primary-btn']");
    static By addhasherbuttonxpath = By.xpath("//span[@class = 'anticon anticon-user-add']");
    static By searchHasherxpath = By.xpath("//input[@type='text']");
    static By searchButtonXpath = By.xpath("//button[@class = 'ant-btn ant-btn-default ant-btn-icon-only ant-input-search-button']");
    static By confirmNominationButtonxpath = By.xpath("//button[@class = 'ant-btn ant-btn-primary']");
    static By backtoPodDetailsxpath = By.xpath("//button[@class = 'ant-btn ant-btn-round ant-btn-text back-btn'][1]");
    static  By mypodstabxpath = By.xpath("//span[contains(text(),'My Pods')]");

    static  JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void nominatingFirst() throws InterruptedException {
        driver.findElement(firstrequestxpath).click();
        wait.setImplicitWait(60);
        driver.findElement(nominatebuttonxpath).click();
        Log.info("Clicking on Nominate button");
        wait.setImplicitWait(60);
        Thread.sleep(8000);
//        js.executeScript("window.scrollBy(250,0)", "");
//        js.executeScript("window.scrollBy(350,0)", "");
//        driver.navigate().refresh();
        driver.findElement(filterbuttonxpath).click();
        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(resetbuttonxpath);
        Thread.sleep(1000);
        driver.navigate().refresh();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.findElement(applybuttonxpath);
//        wait.setImplicitWait(60);
        Thread.sleep(5000);
        driver.findElement(searchHasherxpath).sendKeys("Saji C");
//        driver.findElement(searchHasherxpath).sendKeys("Blake Mills");
        Thread.sleep(2000);
        driver.findElement(searchButtonXpath).click();
        Log.info("Adding a Hasher");
        driver.findElement(addhasherbuttonxpath).click();
        wait.setImplicitWait(60);
        js.executeScript("window.scrollBy(0,250)", "");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(confirmNominationButtonxpath).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
    }

    public static void nominatingSecond() throws InterruptedException {


        driver.findElement(nominatebuttonxpath).click();
        Log.info("Clicking on Nominate button");
        wait.setImplicitWait(60);
        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(250,0)", "");
        wait.setImplicitWait(60);

        driver.findElement(filterbuttonxpath).click();
        Thread.sleep(3000);
        driver.findElement(resetbuttonxpath);
        Thread.sleep(3000);
//        driver.findElement(applybuttonxpath);
        driver.navigate().refresh();
        wait.setImplicitWait(60);

        WebElement button = driver.findElement(addhasherbuttonxpath);
        Log.info("Adding a Hasher");
        driver.findElement(searchHasherxpath).sendKeys("Saji C");
        Thread.sleep(5000);
        driver.findElement(searchButtonXpath).click();
        Thread.sleep(5000);
        driver.findElement(addhasherbuttonxpath).click();
        button.click();
        Thread.sleep(3000);
        driver.findElement(searchHasherxpath).sendKeys("Aishwarya G");
        driver.findElement(searchButtonXpath).click();
        Thread.sleep(3000);
        button.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(confirmNominationButtonxpath).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(mypodstabxpath).click();
        refreshPage.page_refresh();
        Thread.sleep(2*60*1000); // wait for 3 minutes
        Thread.sleep(10000);
        refreshPage.page_refresh();
        Thread.sleep(1*60*1000); // wait for 3 minutes
        refreshPage.page_refresh();
    }
}

