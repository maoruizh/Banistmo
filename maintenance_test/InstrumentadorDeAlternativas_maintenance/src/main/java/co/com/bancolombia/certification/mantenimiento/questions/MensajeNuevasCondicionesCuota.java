package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.NuevasCondiciones.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeNuevasCondicionesCuota implements Question<Boolean> {
    private ModelData modelData;

    public MensajeNuevasCondicionesCuota(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NEW_FEE, isVisible()).forNoMoreThan(10).seconds());

        return (BTN_NEW_FEE.resolveFor(actor).getText().equals(modelData.getNuevaCuotaMensual()));
    }

    public static MensajeNuevasCondicionesCuota mensajeNuevasCondicionesCuota(ModelData modelData) {
        return new MensajeNuevasCondicionesCuota(modelData);
    }
}
