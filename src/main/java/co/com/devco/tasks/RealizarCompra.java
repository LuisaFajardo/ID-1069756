package co.com.devco.tasks;

import co.com.devco.interactions.Abrir;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static co.com.devco.userinterface.CarritoComprasPage.*;
import static co.com.devco.userinterface.CheckoutPage.*;
import static co.com.devco.userinterface.CheckoutPage.TXT_COMENTARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarCompra implements Task {
    private Map<String, String> informacionPersonal;

    public RealizarCompra(Map<String, String> informacionPersonal) {
        this.informacionPersonal = informacionPersonal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Abrir.carritoDeCompras(),
                Click.on(BTN_CONTINUAR_PAGO),
                Enter.theValue(informacionPersonal.get("nombre")).into(TXT_NOMBRE),
                Enter.theValue(informacionPersonal.get("correo")).into(TXT_APELLIDO),
                Enter.theValue(informacionPersonal.get("telefono")).into(TXT_TELEFONO),
                Enter.theValue(informacionPersonal.get("direccion")).into(TXT_DIRECCION),
                Enter.theValue(informacionPersonal.get("comentario")).into(TXT_COMENTARIO),
                Click.on(BTN_PROCESAR_PAGO),
                Click.on(BTN_SI_ACEPTAR_COMPRA)
        );
    }

    public static Performable deProductos(Map<String, String> informacionPersonal){
        return instrumented(RealizarCompra.class, informacionPersonal);
    }
}
