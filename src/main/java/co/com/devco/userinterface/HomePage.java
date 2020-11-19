package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target TXT_USERNAME = Target.the("UserName Input").located(MobileBy.AccessibilityId("test-Usuario"));
}
