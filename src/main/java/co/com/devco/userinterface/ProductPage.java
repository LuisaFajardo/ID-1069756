package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc='test-A\u00D1ADIR A CARRITO']"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(MobileBy.AccessibilityId("test-REGRESO A PRODUCTOS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(MobileBy.AccessibilityId("test-Carrito"));
}
