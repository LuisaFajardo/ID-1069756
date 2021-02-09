package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.userinterface.InicioPage.LBL_NOMBRE_PRODUCTO;
import static co.com.devco.userinterface.ProductoPage.BTN_ANADIR_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {
    private String articuloComprar;

    public AgregarProducto(String articuloComprar) {
        this.articuloComprar = articuloComprar;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_NOMBRE_PRODUCTO.of(articuloComprar)),
                Click.on(BTN_ANADIR_CARRITO)
        );
    }

    public static Performable alCarrito(String articuloComprar){
        return instrumented(AgregarProducto.class, articuloComprar);
    }
}
