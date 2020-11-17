package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.user_interface.AppPage.IMG_APP;

public class SelectedApp implements Question<Boolean> {
    private String nombreApp;

    public SelectedApp(String nombreApp) {
        this.nombreApp = nombreApp;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG_APP.of(nombreApp).resolveFor(actor).isVisible();
    }

    public static SelectedApp isCorrect(String nombreApp) {
        return new SelectedApp(nombreApp);
    }
}
