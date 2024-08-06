package co.com.bancolombia.certification.prueba.tasks;

import co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InputTheData implements Task {

    public static InputTheData inputTheData() {
        return Tasks.instrumented(InputTheData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Bancolombia.TXT_INGRSE_TASA_INTERES).afterWaitingUntilEnabled(),
                Enter.theValue("10").into(Bancolombia.TXT_INGRSE_TASA_INTERES),
                Click.on(Bancolombia.BTN_PERIODICIDAD_MENSUAL).afterWaitingUntilEnabled(),
                Click.on(Bancolombia.BTN_CAPITALIZACION_MENSUAL).afterWaitingUntilEnabled()
                );
    }
}

