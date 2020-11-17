package co.com.devco.user_interface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class InicioPage{
    public static final Target BTN_LUPA = Target.the("Search Engine Button").located(MobileBy.xpath("//android.widget.TextView[@content-desc='Buscar']"));
    public static final Target BTN_LUPA_TESTS = Target.the("Search Engine Button").located(MobileBy.xpath("//android.widget.TextView[@content-desc='Buscar']"));
    public static final Target TXT_BUSCAR = Target.the("Apps Finder Text Field ").located(MobileBy.id("com.wt.apkinfo:id/searchEdit"));
    public static final Target BTN_APP = Target.the("App FoundIcon").located(MobileBy.id("com.wt.apkinfo:id/icon"));
    public static final Target TITLE_APP = Target.the("Title App").located(MobileBy.xpath("//android.widget.TextView[@text= 'asdsdasdasdasdasd']"));
}
