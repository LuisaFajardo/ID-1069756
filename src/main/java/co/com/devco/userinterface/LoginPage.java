package co.com.devco.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("Username Input").located(By.id("com.solodroid.solomerce:id/search"));
    public static final Target TXT_USERNAME1 = Target.the("Username Input").located(By.id("com.solodroid.solomerce:id/search_src_text"));
    public static final Target TXT_PASSWORD = Target.the("Password Input").located(By.xpath("//android.widget.EditText[@text='Contrase\u00F1a']"));
    public static final Target BTN_LOGIN = Target.the("Login Button").located(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
}
