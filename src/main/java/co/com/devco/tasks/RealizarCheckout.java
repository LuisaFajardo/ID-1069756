package co.com.devco.tasks;

import co.com.devco.interactions.Abrir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Abrir.carritoDeCompras()
        );
    }

    public static Performable deCompra() {
        return instrumented(RealizarCheckout.class);
    }

}
