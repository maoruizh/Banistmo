package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraDetalle.BTN_CHANGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonCambiar implements Task {
    public static BotonCambiar botonCambiar() {
        return instrumented(BotonCambiar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHANGE)
        );
    }
}
