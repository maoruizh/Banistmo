package co.com.bancolombia.certification.mantenimiento.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.*;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMoraDetalle.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonFlechaAbajo implements Task {
    public static BotonFlechaAbajo botonFlechaAbajo() {
        return instrumented(BotonFlechaAbajo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ARROW),
                Scroll.to(TXT_LAST_HITO),
                Click.on(BTN_ARROW_UP),
                Click.on(BTN_ARROW)
        );
    }
}
