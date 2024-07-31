package genricUtility;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileInteractions {
   public AppiumDriver driver;

    public boolean waitForPageToLoad(WebElement element){
        WebDriverWait wait = new WebDriverWait(BaseClass.driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        return true;
    }

    public boolean isElementPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        return true;
    }
}
