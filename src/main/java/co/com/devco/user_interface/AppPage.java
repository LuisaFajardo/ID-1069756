package co.com.devco.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class AppPage {

    public static final Target IMG_APP= Target.the("App Icon").locatedBy("//android.widget.TextView[@text='{0}']");
    public static final Target IMG_APP_SYSTEM= Target.the("App Icon").locatedBy("//android.widget.TextView[@text='WebViewTest']");

}
