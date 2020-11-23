package co.com.devco.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(By.xpath("//android.widget.EditText[@text='Usuario']"));
    public static final Target TXT_NAME = Target.the("Name Input").located(By.xpath("test-Nombre"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(By.xpath("test-Apellido"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(By.xpath("test-Código postal"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(By.xpath("test-CONTINUAR"));
    public static final Target BTN_FINISH = Target.the("Button to Finish").located(By.xpath("test-TERMINAR"));
}
