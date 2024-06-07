package co.com.bancolombia.certification.mantenimiento.questions;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraDetalle.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MensajeCreditosEnMoraDetalle implements Question<Boolean> {
    private ModelData modelData;

    public MensajeCreditosEnMoraDetalle(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_FEES_PAID, isVisible()).forNoMoreThan(10).seconds());

        return (TXT_FEES_PAID.resolveFor(actor).getText().equals(modelData.getCuotasPagadas())
                && TXT_FEES_DUE.resolveFor(actor).getText().equals(modelData.getCuotasVencidas())
                && TXT_DAYS_IN_ARREARS.resolveFor(actor).getText().equals(modelData.getDiasEnMora())
                && TXT_BALANCE_PAYABLE.resolveFor(actor).getText().equals(modelData.getTeQuedanPorPagar())
                && TXT_START_ARREAR.resolveFor(actor).getText().equals(modelData.getInicioMora())
                && TXT_YOU_ARE_HERE.resolveFor(actor).getText().equals(modelData.getEstasAca()));
    }
    public static MensajeCreditosEnMoraDetalle mensajeCreditosEnMoraDetalle(ModelData modelData) {
        return new MensajeCreditosEnMoraDetalle(modelData);
    }
}
