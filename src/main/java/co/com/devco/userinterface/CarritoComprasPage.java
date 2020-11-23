package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasPage {
    public static final Target BTN_CONTINUAR_PAGO = Target.the("Boton para continuar al pago").located(MobileBy.id("com.solodroid.solomerce:id/btn_checkout"));
    public static final Target BTN_PROCESAR_PAGO = Target.the("Boton para procesar al pago").located(MobileBy.id("com.solodroid.solomerce:id/btn_submit_order"));
    public static final Target BTN_SI_ACEPTAR_COMPRA = Target.the("Boton aceptar la compra").located(MobileBy.xpath("//android.widget.Button[@text='YES']"));
}
