package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class InicioPage {
    public static final Target BTN_LUPA = Target.the("Boton para busqueda").located(MobileBy.AccessibilityId("Search…"));
    public static final Target TXT_BUSQUEDA_PRODUCTOS = Target.the("Campo de texto para busqueda").located(MobileBy.id("com.solodroid.solomerce:id/search_src_text"));
}
