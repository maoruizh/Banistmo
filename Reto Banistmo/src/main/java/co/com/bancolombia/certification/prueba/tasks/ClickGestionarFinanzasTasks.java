package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_GESTIONAR_FINANZAS;
public class ClickGestionarFinanzasTasks implements Task {
    public static ClickGestionarFinanzasTasks clickGestionarFinanzas() {
        return Tasks.instrumented(ClickGestionarFinanzasTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_GESTIONAR_FINANZAS).afterWaitingUntilEnabled());
    }
}

