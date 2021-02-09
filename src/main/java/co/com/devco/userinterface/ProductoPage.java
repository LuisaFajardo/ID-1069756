package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;

public class ProductoPage {
    public static final Target BTN_ANADIR_CARRITO = Target.the("Boton para agregar producto al carrito").located(MobileBy.AccessibilityId("test-A\u00D1ADIR A CARRITO"));
    public static final Target BTN_ABRIR_CARRITO = Target.the("Boton para abrir carrito").located(MobileBy.AccessibilityId("test-Carrito"));
}
