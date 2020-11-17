package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.user_interface.AppPage.IMG_APP_SYSTEM;

public class SelectedSystemApp implements Question<Boolean> {
    private String nombreApp;

    public SelectedSystemApp(String nombreApp) {
        this.nombreApp = nombreApp;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return IMG_APP_SYSTEM.resolveFor(actor).isVisible();
    }

    public static SelectedSystemApp isCorrect(String nombreApp) {
        return new SelectedSystemApp(nombreApp);
    }
}
