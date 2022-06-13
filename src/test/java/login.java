//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class login {
//
////    public static WebDriver driver;
//    @Test
//    public void initialSetup()
//    {
//        System.setProperty("webdriver.chrome.driver", "C://Tools//chromedriver.exe");
//
//        WebDriver driver =new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//        System.out.println("hello");
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
////        driver.get("https://dna-staging.hashedin.com/allocation/");
////        return driver;
//    }
////    @AfterTest
////    public static void terminate()
////    {
////        driver.close();
////    }
//}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login {

    public String baseUrl = "https://dna-staging.hashedin.com/allocation/allocate/";
    public String path = "C:\\Tools\\chromedriver.exe";
    @Test
    public void home_function() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("(//input[@value='Deloitte'])[2]")).click();

        driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("sajic@deloitte.com");
        driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.MINUTES);

//        driver.findElement(By.xpath("//input[@id='idTxtBx_SAOTCC_OTC']")).sendKeys("587606");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(10000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Allocation Engine");

//        String expectedHeading = ";
        //Storing the text of the heading in a string
        String open_head = driver.findElement(By.xpath("//div[@id= 'rc-tabs-0-tab-openPods']")).getText();
        System.out.println(open_head);
        Assert.assertEquals(open_head, "Open Pods");

        String close_head = driver.findElement(By.xpath("//div[@id= 'rc-tabs-0-tab-openPods']")).getText();
        System.out.println(close_head);
        Assert.assertEquals(close_head, "Closed Pods");

        String up_head = driver.findElement(By.xpath("//div[@id= 'rc-tabs-0-tab-openPods']")).getText();
        System.out.println(up_head);
        Assert.assertEquals(up_head, "Upcoming Pods");


//        driver.close();
    }

}
