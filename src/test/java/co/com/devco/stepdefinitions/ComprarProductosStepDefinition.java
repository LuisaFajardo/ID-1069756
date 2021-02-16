package co.com.devco.stepdefinitions;

import co.com.devco.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComprarProductosStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) se encuentra en Swaglabs App")
    public void actorSeEncuentraEnSwaglabs(String actor) {
        theActorCalled(actor).attemptsTo(
                Login.enSwagLabs()
        );
    }
}