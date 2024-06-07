package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.NuevasCondiciones.BTN_NEW_DATA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeNuevasCondicionesFecha implements Question<Boolean> {
    private ModelData modelData;

    public MensajeNuevasCondicionesFecha(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NEW_DATA, isVisible()).forNoMoreThan(10).seconds());

        return (BTN_NEW_DATA.resolveFor(actor).getText().equals(modelData.getNuevaFechaPago()));
    }

    public static MensajeNuevasCondicionesFecha mensajeNuevasCondicionesFecha(ModelData modelData) {
        return new MensajeNuevasCondicionesFecha(modelData);
    }
}
