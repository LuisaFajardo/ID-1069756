package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USUARIO = Target.the("Campo Usuario").located(MobileBy.AccessibilityId("test-Username"));
    public static final Target TXT_CLAVE = Target.the("Campo Clave").located(MobileBy.AccessibilityId("test-Password"));
    public static final Target BTN_LOGIN = Target.the("Boton Login").located(MobileBy.AccessibilityId("test-LOGIN"));
}
