package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterface.CheckoutPage.LBL_ARTICULO_EN_CARRITO;

public class Producto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ARTICULO_EN_CARRITO.resolveFor(actor).isVisible();
    }

    public static Producto estaEnElCarrito(){
        return new Producto();
    }
}
