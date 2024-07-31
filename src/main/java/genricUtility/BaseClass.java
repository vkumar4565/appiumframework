package genricUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriverLocalService server;
    public static AndroidDriver driver ;


    @BeforeClass
    public void startAppiumServer() throws IOException {
        server = new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingPort(Integer.parseInt("4723")).build();
        server.start();
        boolean status = server.isRunning();
        System.out.println("=========== Started Appium Server =============");
    }

    @BeforeMethod
    public void buildDesiredCapability() throws IOException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("deviceName", fileUtility.getProperty("deviceName"));
        dc.setCapability("platformVersion", fileUtility.getProperty("platformVersion"));
        dc.setCapability("platformName", fileUtility.getProperty("platformName"));
        dc.setCapability("UDID", fileUtility.getProperty("UDID"));
        dc.setCapability("appPackage",fileUtility.getProperty("appPackage"));
        dc.setCapability("appActivity", fileUtility.getProperty("appActivity"));
        dc.setCapability("app", "app/Flipkart-7.47-apkmodget.com.apk");
        dc.setCapability(MobileCapabilityType.NO_RESET, "true");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url,dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public static void closeApp()
    {
        driver.close();
    }


    @AfterClass
    public static void stopAppiumServer() {
        server.stop();
        System.out.println("=========== Stopped Appium Server =============");
    }

}
