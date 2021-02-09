package co.com.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioPage {
    public static final Target LBL_NOMBRE_PRODUCTO = Target.the("Titulo del producto a comprar").locatedBy("//android.widget.TextView[@text='{0}']");
}
