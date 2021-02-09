package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.PurchaseIsNotCompleteException;
import co.com.devco.questions.Purchase;
import co.com.devco.tasks.AddProduct;
import co.com.devco.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.exceptions.PurchaseIsNotCompleteException.PURCHASE_FAILED_MESSAGE_EXCEPTION;
import static co.com.devco.tasks.Checkout.checkout;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComprarProductosStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que (.*) se cuentra en Swaglabs App")
    public void actorWantsBuyShirts(String actor) {
        theActorCalled(actor).attemptsTo(
                Login.atSwagLabs()
        );
    }

    @When("El coloca en el carrito la (.*)")
    public void actorPutShirtCart(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(
              AddProduct.toTheCart(nameProduct)
        );
    }

    @And("El hace el checkout de su compra")
    public void checkoutPurchase() {
        theActorInTheSpotlight().attemptsTo(checkout());
    }

    @Then("El deberia de ver que su compra es exitosa")
    public void actorShouldSeePurchase() {
        theActorInTheSpotlight().should(seeThat(Purchase.isSuccesful()).orComplainWith(PurchaseIsNotCompleteException.class, PURCHASE_FAILED_MESSAGE_EXCEPTION));
    }
}