package co.com.bancolombia.certification.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancolombia.certification.prueba.userinterfaces.Bancolombia.BTN_SOLUCIONES_NO_FINANCIERAS;
public class ClickSolucionesNoFinancierasTasks implements Task {

    public static ClickSolucionesNoFinancierasTasks clickSolucionesNoFinancierasTasks() {
        return Tasks.instrumented(ClickSolucionesNoFinancierasTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SOLUCIONES_NO_FINANCIERAS).afterWaitingUntilEnabled());
    }
}