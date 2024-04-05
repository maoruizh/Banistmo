package co.com.bancolombia.certification.portalautogestioncobranza.questions;

import co.com.bancolombia.certification.portalautogestioncobranza.userinterfaces.BancolombiaCobranzaDigital;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.bancolombia.certification.portalautogestioncobranza.userinterfaces.BancolombiaCobranzaDigital.BANCOLOMBIA_HOME_MESSAGE;
import static co.com.bancolombia.certification.portalautogestioncobranza.userinterfaces.BancolombiaCobranzaDigital.FORM_COMPLETE_MESSAGE;
import static net.serenitybdd.screenplay.questions.Text.of;

public class BancolombiaHome implements Question<Boolean> {

    private final String message;
    private BancolombiaCobranzaDigital bancolombiaCobranzaDigital;

    public BancolombiaHome(String message) {
        this.message = message;
    }

    public static BancolombiaHome message(String message) {
        return new BancolombiaHome(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String bancolombiaHomeMessage = of(BANCOLOMBIA_HOME_MESSAGE).viewedBy(actor).asString();
        if(message.equals(bancolombiaHomeMessage)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
