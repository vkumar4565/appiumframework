package Pages;

import genricUtility.MobileInteractions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import page.pages;

public class HomePage extends pages {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search for products']")
    private  MobileElement searchTextFiled;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search for products']/preceding-sibling::android.widget.ImageView")
    private MobileElement search_Icon;


    public HomePage searchProduct()
    {
        Assert.assertTrue(interactions.waitForPageToLoad(searchTextFiled));
        searchTextFiled.sendKeys("mobile");
        return this;
    }

    public ProductListPage clickOnSearchIcon()
    {
        Assert.assertTrue(interactions.waitForPageToLoad(search_Icon));
        search_Icon.click();
        return new ProductListPage();
    }
}
