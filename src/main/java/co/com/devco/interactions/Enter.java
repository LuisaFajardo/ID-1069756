package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.devco.userinterface.HomePage.TXT_USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Enter implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_USERNAME),
                Type.theValue("standard_user").into(TXT_USERNAME)
        );
    }

    public static Performable theUsername() {
        return instrumented(Enter.class);
    }
}
