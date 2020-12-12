package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target TXT_NOMBRE = Target.the("Campo nombre en el checkout").located(MobileBy.id("com.solodroid.solomerce:id/edt_name"));
    public static final Target TXT_APELLIDO = Target.the("Campo apellido en el checkout").located(MobileBy.id("com.solodroid.solomerce:id/edt_email"));
    public static final Target TXT_TELEFONO = Target.the("Campo telefono en el checkout").located(MobileBy.id("com.solodroid.solomerce:id/edt_phone"));
    public static final Target TXT_DIRECCION = Target.the("Campo direccion en el checkout").located(MobileBy.id("com.solodroid.solomerce:id/edt_address"));
    public static final Target TXT_COMENTARIO = Target.the("Campo comentario en el checkout").located(MobileBy.id("com.solodroid.solomerce:id/edt_comment"));
    public static final Target LBL_CONFIRMACION = Target.the("Mensaje de confirmacion").located(MobileBy.id("android:id/alertTitle"));
}
