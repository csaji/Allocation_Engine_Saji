package Utils.reusableMethods;

import baseClass.initialize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class wait extends initialize
{
    // common method to generate implicit wait
    public static void setImplicitWait(int seconds)
    {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    // common method to generate explicit wait
    public static void setExplicitWait(int seconds, By xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        try{
            // Here we will wait until element is not visible, if element is visible then it will return web elemen or else it will throw exception
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        }
        catch(Exception e){
//            log.error("Required elements not visible in the xpath: " + xpath);
        }
    }
}
