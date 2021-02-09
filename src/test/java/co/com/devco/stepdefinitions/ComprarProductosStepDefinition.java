package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ElProductoNoEstaVisibleException;
import co.com.devco.questions.Producto;
import co.com.devco.questions.ProductoDos;
import co.com.devco.tasks.AgregarProducto;
import co.com.devco.tasks.Login;
import co.com.devco.tasks.RealizarCheckout;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.exceptions.ElProductoNoEstaVisibleException.ARTICULO_NO_VISIBLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductosStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) se encuentra en Swaglabs App")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(
                Login.enSwagLabs()
        );
    }

    @Cuando("El coloca en el carrito la (.*)")
    public void actorPutShirtCart(String articuloComprar) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarrito(articuloComprar)
        );
    }

    @Y("El ingresa al carrito")
    public void checkoutPurchase() {
        theActorInTheSpotlight().attemptsTo(
                RealizarCheckout.deCompra()
        );
    }

    @Entonces("El deberia de ver su producto en el carrito")
    public void actorShouldSeePurchase() {
        theActorInTheSpotlight().should(seeThat(Producto.estaEnElCarrito()).orComplainWith(ElProductoNoEstaVisibleException.class, ARTICULO_NO_VISIBLE));
    }

    @Entonces("El deberia de ver un producto en el carrito")
    public void actorShouldSeePurchases() {
        theActorInTheSpotlight().should(seeThat(ProductoDos.estaEnElCarrito()).orComplainWith(ElProductoNoEstaVisibleException.class, ARTICULO_NO_VISIBLE));
    }
}