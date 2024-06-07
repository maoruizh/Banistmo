package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonEnOtroMomento implements Task {
    public static BotonEnOtroMomento botonEnOtroMomento() {
        return instrumented(BotonEnOtroMomento.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ANOTHER_TIME)
        );
    }
}
