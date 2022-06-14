package pages;


import Utils.logs.Log;
import Utils.reusableMethods.wait;
import baseClass.initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class checkingStatus extends initialize{

    static By statusxpath = By.xpath("(//span[contains(text(),'CONFIRMED')])[1]");
    public static void podsStatus() throws InterruptedException {

        Log.info("Verifying Upcoming Pods tab");
        String confirmed_status = driver.findElement(statusxpath).getText();
//        System.out.println(upcoming_head);
        Assert.assertEquals(confirmed_status, "CONFIRMED");
    }

}



