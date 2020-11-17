package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.user_interface.InicioPage.BTN_LUPA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LUPA)
        );
    }

    public static Performable searchEngine() {
        return instrumented(Select.class);
    }
}
