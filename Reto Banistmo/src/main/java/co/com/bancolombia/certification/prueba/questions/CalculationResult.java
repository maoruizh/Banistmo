package co.com.bancolombia.certification.prueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.TXT_RESULTADO_TASA;

public class CalculationResult implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return TXT_RESULTADO_TASA.resolveFor(actor).getText().equals("0.83 %");//todo el valor correcto es 0.83 %
    }
    public static CalculationResult calculationResult() {
        return new CalculationResult();
    }
}
