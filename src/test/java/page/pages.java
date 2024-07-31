package page;

import genricUtility.BaseClass;
import genricUtility.MobileInteractions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class pages {
   public  MobileInteractions interactions = new MobileInteractions();
    public pages ()
    {
        PageFactory.initElements(new AppiumFieldDecorator(BaseClass.driver),this);
    }
}
