package co.com.devco.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.ProductoPage.BTN_ABRIR_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ABRIR_CARRITO)
        );
    }

    public static Performable carritoDeCompras(){
        return instrumented(Abrir.class);
    }
}
