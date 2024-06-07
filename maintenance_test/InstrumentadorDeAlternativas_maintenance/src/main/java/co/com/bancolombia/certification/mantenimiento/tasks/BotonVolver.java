package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraDetalle.BTN_CHANGE;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.OpcionDePago.BTN_BACK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonVolver implements Task {
    public static BotonVolver botonVolver() {
        return instrumented(BotonVolver.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BACK)
        );
    }
}
