package co.com.bancolombia.certification.mantenimiento.tasks;

import co.com.bancolombia.certification.mantenimiento.models.ModelData;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certification.mantenimiento.userinterfaces.CreditosEnMora.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task, IsSilent {
    private ModelData modelData;

    public LoginUser(ModelData modelData) {
        this.modelData = modelData;
    }

    public static LoginUser loginUser(ModelData modelDataList) {
        return instrumented(LoginUser.class, modelDataList);
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
