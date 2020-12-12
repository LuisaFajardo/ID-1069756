package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterface.CheckoutPage.LBL_CONFIRMACION;

public class CompraEnEcommerce implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMACION.resolveFor(actor).isVisible();
    }

    public static CompraEnEcommerce esExitosa(){
        return new CompraEnEcommerce();
    }
}
