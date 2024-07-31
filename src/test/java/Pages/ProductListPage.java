package Pages;

import genricUtility.MobileInteractions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import page.pages;

import java.util.ArrayList;
import java.util.List;

public class ProductListPage extends pages {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.flipkart.android:id/main_content'](/descendant::android.widget.TextView)[2]")
    private List<MobileElement> productName;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.flipkart.android:id/main_content'](/descendant::android.widget.TextView)[14]")
    private List<MobileElement>  productPrice;


    public void printAllTheProductNameAndPrice()
    {
        Assert.assertTrue(interactions.isElementPresent(productName.get(0)));
        ArrayList<String> array = new ArrayList<>();
        for(int i=0; i<productName.size(); i++){
            array.add(productName.get(i).getText());

        }
        for(int i=0; i<array.size(); i++)
        {
            System.out.println(array.get(i));
        }
        Assert.assertTrue(interactions.isElementPresent(productPrice.get(0)));
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<productPrice.size(); i++)
        {
            arr.add(productPrice.get(i).getText());
        }
        for(int i=0; i<arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
}
