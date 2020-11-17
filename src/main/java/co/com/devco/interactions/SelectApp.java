package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.devco.user_interface.InicioPage.TITLE_APP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectApp implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Check.whether(TITLE_APP.resolveFor(actor).isClickable()).andIfSo(
                Click.on(TITLE_APP)
        ).otherwise(
                Click.on(TITLE_APP)
        ));
    }

    public static Performable searchEngine() {
        return instrumented(SelectApp.class);
    }
}
