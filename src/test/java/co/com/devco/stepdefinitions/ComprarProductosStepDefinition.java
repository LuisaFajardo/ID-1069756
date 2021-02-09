package co.com.devco.stepdefinitions;

import co.com.devco.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComprarProductosStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) se cuentra en Swaglabs App")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(
                Login.atSwagLabs()
        );
    }

    @Cuando("El coloca en el carrito la (.*)")
    public void actorPutShirtCart() {
    }

    @Y("El hace el checkout de su compra")
    public void checkoutPurchase() {
    }

    @Entonces("El deberia de ver que su compra es exitosa")
    public void actorShouldSeePurchase() {
    }
}