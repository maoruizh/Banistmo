package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.PantallaSalir.TXT_EXIT_BUTTON_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeSalirListadoDeCreditos implements Question<Boolean> {
    private ModelData modelData;

    public MensajeSalirListadoDeCreditos(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_EXIT_BUTTON_MESSAGE, isVisible()).forNoMoreThan(10).seconds());

        return (TXT_EXIT_BUTTON_MESSAGE.resolveFor(actor).getText().equals(modelData.getMensajeSalir()));
    }

    public static MensajeSalirListadoDeCreditos mensajeSalirListadoDeCreditos(ModelData modelData) {
        return new MensajeSalirListadoDeCreditos(modelData);
    }
}
