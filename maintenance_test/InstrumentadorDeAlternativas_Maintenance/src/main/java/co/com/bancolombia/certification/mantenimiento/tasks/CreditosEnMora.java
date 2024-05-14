package co.com.bancolombia.certification.mantenimiento.tasks;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.*;

public class CreditosEnMora implements Task {
    private ModelData modelData;

    public CreditosEnMora(ModelData modelData) {
        this.modelData = modelData;
    }

    public static CreditosEnMora withTheData(ModelData modelDataList) {
        return instrumented(CreditosEnMora.class, modelDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(modelData.getCedula()).into(TXT_ID),
                Enter.theValue(modelData.getTipo()).into(TXT_TYPE_DOCUMENT),
                Click.on(BTN_SIMULATE)
        );
    }
}
