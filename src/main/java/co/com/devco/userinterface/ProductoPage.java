package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton para agregar al carrito").located(MobileBy.id("com.solodroid.solomerce:id/btn_add_cart"));
    public static final Target TXT_CANTIDAD_PRODUCTO = Target.the("Campo para ingresar la cantidad de productos").located(MobileBy.id("com.solodroid.solomerce:id/userInputDialog"));
    public static final Target BTN_AGREGAR_CANTIDAD_PRODUCTO = Target.the("Boton agregar al carrito").located(MobileBy.xpath("//android.widget.Button[@text='ADD']"));
    public static final Target BTN_VER_CARRITO = Target.the("Boton ver carrito de compras").located(MobileBy.id("com.solodroid.solomerce:id/cart"));
}
