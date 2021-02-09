package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target LBL_ARTICULO_EN_CARRITO = Target.the("Articulo en carrito").located(MobileBy.xpath("//android.widget.TextView[@text='Chamarra Sauce Labs']"));
    public static final Target LBL_ARTICULO_EN_CARRITO_DOS = Target.the("Articulo en carrito").located(MobileBy.xpath("//android.widget.TextView[@text='Chamarra Sauce LabsSs']"));
}
