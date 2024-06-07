package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.OpcionDePago.BTN_DEFER_PAYMENT;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.OpcionDePago.BTN_DEFER_PAYMENT_AND_REDUCE_PAYMENT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonAplazarPagoYDisminuirCuota implements Task {
    public static BotonAplazarPagoYDisminuirCuota botonAplazarPagoYDisminuirCuota() {
        return instrumented(BotonAplazarPagoYDisminuirCuota.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DEFER_PAYMENT_AND_REDUCE_PAYMENT)
        );
    }
}
