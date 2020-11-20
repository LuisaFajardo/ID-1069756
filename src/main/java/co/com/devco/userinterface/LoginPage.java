package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("Username Input").located(MobileBy.AccessibilityId("test-Usuario"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").located(MobileBy.AccessibilityId("test-Contrase\u00F1a"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(MobileBy.AccessibilityId("test-LOGIN"));
}
