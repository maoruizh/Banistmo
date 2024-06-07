package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.PantallaSalir.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeSalir implements Question<Boolean> {
    private ModelData modelData;

    public MensajeSalir(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_EXIT_OTHER_MOMENT_MESSAGE, isVisible()).forNoMoreThan(10).seconds());

        return (TXT_EXIT_OTHER_MOMENT_MESSAGE.resolveFor(actor).getText().equals(modelData.getMensajeSalir()));
    }

    public static MensajeSalir mensajeSalir(ModelData modelData) {
        return new MensajeSalir(modelData);
    }
}
