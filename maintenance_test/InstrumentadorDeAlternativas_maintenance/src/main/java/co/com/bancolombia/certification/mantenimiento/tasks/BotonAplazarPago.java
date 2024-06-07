package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraDetalle.BTN_CHANGE;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.OpcionDePago.BTN_DEFER_PAYMENT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonAplazarPago implements Task {
    public static BotonAplazarPago botonAplazarPago() {
        return instrumented(BotonAplazarPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DEFER_PAYMENT)
        );
    }
}
