package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraDetalle.TXT_OBLIGATION_TYPE_AND_NUMBER;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.OpcionDePago.TXT_DUE_DATE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeOpcionDePago implements Question<Boolean> {
    private ModelData modelData;

    public MensajeOpcionDePago(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_OBLIGATION_TYPE_AND_NUMBER, isVisible()).forNoMoreThan(10).seconds());

        return (TXT_OBLIGATION_TYPE_AND_NUMBER.resolveFor(actor).getText().equals(modelData.getTipoObligacionYNumero())
                && TXT_DUE_DATE.resolveFor(actor).getText().equals(modelData.getFechaVencimiento()));
    }

    public static MensajeOpcionDePago mensajeOpcionDePago(ModelData modelData) {
        return new MensajeOpcionDePago(modelData);
    }
}
