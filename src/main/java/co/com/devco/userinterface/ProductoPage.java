package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {
    public static final Target IMG_PRODUCTO = Target.the("Imagen del Producto a Comprar").locatedBy("//android.widget.TextView[contains(@text,'{0}')]");
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton para agregar producto al carrito").located(MobileBy.id("com.solodroid.solomerce:id/btn_add_cart"));
    public static final Target TXT_CANTIDAD_PRODUCTO = Target.the("Campo para ingresar cantidad de producto").located(MobileBy.id("com.solodroid.solomerce:id/userInputDialog"));
    public static final Target BTN_AGREGRAR_AL_CARRITO_CANTIDAD = Target.the("Boton para agregar cantidad de producto").located(MobileBy.xpath("//android.widget.Button[@text='ADD']"));
    public static final Target BTN_VER_CARRITO_COMPRAS = Target.the("Boton para ver carrito de compras").located(MobileBy.id("com.solodroid.solomerce:id/cart"));
}
