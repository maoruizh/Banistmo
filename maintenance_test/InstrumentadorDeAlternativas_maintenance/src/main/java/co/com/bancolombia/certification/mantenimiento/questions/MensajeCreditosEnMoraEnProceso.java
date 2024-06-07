package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.TXT_OBLIGATION_NUMBER;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.TXT_OBLIGATION_TYPE;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraEnProceso.TXT_IN_PROCESS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeCreditosEnMoraEnProceso implements Question<Boolean> {
    private ModelData modelData;

    public MensajeCreditosEnMoraEnProceso(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_OBLIGATION_TYPE, isVisible()).forNoMoreThan(10).seconds());

        return (TXT_OBLIGATION_TYPE.resolveFor(actor).getText().equals(modelData.getTipoObligacion())
                && TXT_OBLIGATION_NUMBER.resolveFor(actor).getText().equals(modelData.getNumeroObligacion())
                && TXT_IN_PROCESS.resolveFor(actor).getText().equals(modelData.getEstado()));
    }

    public static MensajeCreditosEnMoraEnProceso mensajeCreditosEnMoraEnProceso(ModelData modelData) {
        return new MensajeCreditosEnMoraEnProceso(modelData);
    }
}
