package pages;
import Utils.logs.Log;
import org.openqa.selenium.By;
import baseClass.initialize;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class loginPage extends initialize{

    static By loginButton = By.xpath("//button[@type='button']");
    static By deloitteButton = By.xpath("(//input[@value='Deloitte'])[2]");
    static By emailInput = By.xpath("//input[@id='i0116']");
    static By emailSubmit = By.xpath("//input[@id='idSIButton9']");

    public static void loginSteps()
    {
        driver.findElement(loginButton).click();
        Log.info("Started successfully");
        driver.findElement(deloitteButton).click();
        driver.findElement(emailInput).sendKeys("bochandana@deloitte.com");
        driver.findElement(emailSubmit).click();
    }
    public static void verifyTitle() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Thread.sleep(10000);
        Log.info("Verifying page title");
        String title = driver.getTitle();
        Log.info(title);
        Assert.assertEquals(title, "Allocation Engine");
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
}
