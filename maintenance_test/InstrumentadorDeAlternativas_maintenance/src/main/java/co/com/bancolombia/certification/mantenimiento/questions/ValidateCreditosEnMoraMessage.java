package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateCreditosEnMoraMessage implements Question<Boolean> {
    private ModelData modelData;

    public ValidateCreditosEnMoraMessage(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SUBTITLE_NEW_PAYMENT_OPTION, isVisible()).forNoMoreThan(10).seconds());

        return (TXT_SUBTITLE_NEW_PAYMENT_OPTION.resolveFor(actor).getText().equals(modelData.getSubtituloListadoCreditos())
                && TXT_OBLIGATION_TYPE.resolveFor(actor).getText().equals(modelData.getTipoObligacion())
                && TXT_OBLIGATION_NUMBER.resolveFor(actor).getText().equals(modelData.getNumeroObligacion())
                && TXT_DAYS_ARREARS.resolveFor(actor).getText().equals(modelData.getDiasMora())
                && TXT_BALANCE_IN_ARREARS.resolveFor(actor).getText().equals(modelData.getSaldoMora())
                && BTN_CHANGE.isVisibleFor(actor)
                && BTN_ARROW.isVisibleFor(actor));
    }

    public static ValidateCreditosEnMoraMessage validateCreditosEnMoraMessage(ModelData modelData) {
        return new ValidateCreditosEnMoraMessage(modelData);
    }
}
