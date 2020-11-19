package co.com.devco.stepdefinitions;

import co.com.devco.interactions.Enter;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BuyingProductsStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that (.*) wants to buy 2 shirts")
    public void actorWantsBuyShirts(String actor){
        theActorCalled(actor).attemptsTo(
                Enter.theUsername()
        );
    }

    @When("He put the shirts on cart")
    public void actorPutShirtCart() {
    }

    @Then("He should see that his purchase is successful")
    public void actorShouldSeePurchase() {
    }
}