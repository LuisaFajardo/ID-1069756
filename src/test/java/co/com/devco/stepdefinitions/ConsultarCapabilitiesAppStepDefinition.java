package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.LaAplicacionNoEsLaSeleccionadaException;
import co.com.devco.interactions.Select;
import co.com.devco.interactions.SelectApp;
import co.com.devco.questions.SelectedApp;
import co.com.devco.questions.SelectedSystemApp;
import co.com.devco.tasks.ConsultCapabilities;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.exceptions.LaAplicacionNoEsLaSeleccionadaException.LA_APLICACION_NO_ES_LA_BUSCADA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarCapabilitiesAppStepDefinition {

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to consult an app capabilities$")
    public void queJuanConsultaLaAppDeFacebook(String actor){
        theActorCalled(actor).attemptsTo(
                Select.searchEngine()
        );
    }

    @Given("^that (.*) wants to consult an app not capabilities$")
    public void queJuanConsultaLaApp(String actor){
        theActorCalled(actor).attemptsTo(
                SelectApp.searchEngine()
        );
    }

    @When("^He searchs for (.*) app$")
    public void elSeleccionaLaApp(String nameApp) {
        theActorInTheSpotlight().attemptsTo(
                ConsultCapabilities.ofAppCalled(nameApp)
        );

    }

    @Then("^He should see all the features of (.*)$")
    public void elDeberiaDeVerLasCaracteristicasDeEsta(String nameApp) {
        theActorInTheSpotlight().should(seeThat(SelectedApp.isCorrect(nameApp)).
                orComplainWith(LaAplicacionNoEsLaSeleccionadaException.class, LA_APLICACION_NO_ES_LA_BUSCADA));
    }

    @Then("^He should see the features of (.*)$")
    public void elDeberiaDeVerLasCaracteristicaEsta(String nameApp) {
        theActorInTheSpotlight().should(seeThat(SelectedSystemApp.isCorrect(nameApp)).
                orComplainWith(LaAplicacionNoEsLaSeleccionadaException.class, LA_APLICACION_NO_ES_LA_BUSCADA));
    }

}
