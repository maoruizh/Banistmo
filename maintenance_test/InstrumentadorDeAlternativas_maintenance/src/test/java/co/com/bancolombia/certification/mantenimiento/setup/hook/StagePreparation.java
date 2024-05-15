package co.com.bancolombia.certification.mantenimiento.setup.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static co.com.bancolombia.certification.mantenimiento.utils.Constants.*;

public class StagePreparation {

    @Before
    public void StagePreparation() {
        setTheStage(new OnlineCast());
        theActor(ACTOR_PAGE.getConstant());
    }
}
