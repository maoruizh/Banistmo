package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.Bancolombia.*;
public class InputTheData implements Task {

    public static InputTheData inputTheData() {
        return Tasks.instrumented(InputTheData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_INGRSE_TASA_INTERES),
                Enter.theValue("10").into(TXT_INGRSE_TASA_INTERES),
                Click.on(BTN_PERIODICIDAD_MENSUAL),
                Click.on(BTN_CAPITALIZACION)
                );
    }
}

