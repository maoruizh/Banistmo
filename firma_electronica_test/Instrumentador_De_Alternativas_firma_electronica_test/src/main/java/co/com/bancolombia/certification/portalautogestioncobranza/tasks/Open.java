package co.com.bancolombia.certification.portalautogestioncobranza.tasks;

import co.com.bancolombia.certification.portalautogestioncobranza.models.PortalAutogestionCobranzaData;
import co.com.bancolombia.certification.portalautogestioncobranza.userinterfaces.BancolombiaCobranzaDigital;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import static co.com.bancolombia.certification.portalautogestioncobranza.userinterfaces.BancolombiaCobranzaDigital.*;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.*;
import static net.serenitybdd.screenplay.actions.Open.*;

public class Open implements Task {

    private BancolombiaCobranzaDigital bancolombiaCobranzaDigital;
    private List<PortalAutogestionCobranzaData> credentialData;

    public Open(List<PortalAutogestionCobranzaData> credentialData) {
        this.credentialData = credentialData;
    }

    public static Open experiencePage(List<PortalAutogestionCobranzaData> credentialData) {
        return Tasks.instrumented(Open.class, credentialData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                browserOn(bancolombiaCobranzaDigital),
                theValue(credentialData.get(0).getCedula()).into(INPUT_CC),
                theValue(credentialData.get(0).getType()).into(INPUT_TYPE),
                on(CHECK_PORTAL),
                on(BTN_BANNER)
        );
    }
}