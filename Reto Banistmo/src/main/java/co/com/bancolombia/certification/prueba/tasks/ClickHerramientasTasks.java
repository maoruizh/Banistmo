package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_FLECHA_DERECHA;
import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_HERRAMIENTAS;
public class ClickHerramientasTasks implements Task {

    public static ClickHerramientasTasks clickHerramientas() {

        return Tasks.instrumented(ClickHerramientasTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_HERRAMIENTAS).afterWaitingUntilEnabled());
        actor.attemptsTo(Scroll.to(BTN_FLECHA_DERECHA));
        actor.attemptsTo(Click.on(BTN_FLECHA_DERECHA).afterWaitingUntilEnabled());
    }
}

