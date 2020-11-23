package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.userinterface.InicioPage.IMG_PRODUCTO;
import static co.com.devco.userinterface.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {
    private String producto;

    public AgregarProducto(String nameProduct) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMG_PRODUCTO.of(producto)),
                Click.on(BTN_AGREGAR_CARRITO),
                Enter.theValue("1").into(TXT_CANTIDAD_PRODUCTO),
                Click.on(BTN_AGREGAR_CANTIDAD_PRODUCTO)
        );
    }

    public static Performable alCarrito(String producto){
        return instrumented(AgregarProducto.class, producto);
    }
}
