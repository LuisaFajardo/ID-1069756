package co.com.devco.tasks;

import co.com.devco.interactions.Abrir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.CarritoComprasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Abrir.carritoDeCompras(),
                Click.on(BTN_CONTINUAR_PAGO),
                Click.on(BTN_PROCESAR_PAGO),
                Click.on(BTN_SI_ACEPTAR_COMPRA)
        );
    }

    public static Performable deProductos(){
        return instrumented(RealizarCompra.class);
    }
}
