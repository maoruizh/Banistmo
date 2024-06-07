package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.PantallaSalir.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonSalir implements Task {
    public static BotonSalir botonSalir() {
        return instrumented(BotonSalir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_EXIT)
        );
    }
}
