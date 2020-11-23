package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterface.InicioPage.BTN_LUPA;
import static co.com.devco.userinterface.InicioPage.TXT_BUSQUEDA_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {
    private String producto;

    public BuscarProducto(String producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LUPA),
                Enter.theValue(producto).into(TXT_BUSQUEDA_PRODUCTOS)
        );
    }

    public static Performable enEcommerce(String producto){
        return instrumented(BuscarProducto.class, producto);
    }
}
