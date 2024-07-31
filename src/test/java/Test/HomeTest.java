package Test;

import Pages.HomePage;
import genricUtility.BaseClass;
import org.testng.annotations.Test;


@Test
public class HomeTest extends BaseClass {

    public void verifyTheAllProduct()
    {
        HomePage page = new HomePage();
        page.searchProduct()
                .clickOnSearchIcon()
                .printAllTheProductNameAndPrice();

    }
}
