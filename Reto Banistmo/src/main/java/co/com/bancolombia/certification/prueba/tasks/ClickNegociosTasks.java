package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_NEGOCIOS;
public class ClickNegociosTasks implements Task {

    public static ClickNegociosTasks clickNegocios() {
        return Tasks.instrumented(ClickNegociosTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEGOCIOS).afterWaitingUntilEnabled());
    }
}