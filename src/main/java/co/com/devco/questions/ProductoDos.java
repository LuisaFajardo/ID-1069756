package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterface.CheckoutPage.LBL_ARTICULO_EN_CARRITO_DOS;

public class ProductoDos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_ARTICULO_EN_CARRITO_DOS.resolveFor(actor).isVisible();
    }

    public static ProductoDos estaEnElCarrito(){
        return new ProductoDos();
    }
}
