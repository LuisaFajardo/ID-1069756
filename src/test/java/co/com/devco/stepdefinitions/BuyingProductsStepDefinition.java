package co.com.devco.stepdefinitions;

import co.com.devco.tasks.AgregarProducto;
import co.com.devco.tasks.BuscarProducto;
import co.com.devco.tasks.RealizarCompra;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) agrega los tennis (.*) al carrito")
    public void agregarTennisAlCarrito(String actor, String producto) {
        theActorCalled(actor).attemptsTo(
                BuscarProducto.enEcommerce(producto),
                AgregarProducto.alCarrito(producto)
        );
    }

    @Cuando("realiza el chackout de su compra")
    public void actorPutShirtCart() {
        theActorInTheSpotlight().attemptsTo(
                RealizarCompra.deProductos()
        );
    }

    @Entonces("el deberia ver que su compra fue exitosa")
    public void actorShouldSeePurchase() {
    }
}