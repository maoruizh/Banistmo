package co.com.bancolombia.certification.portalautogestioncobranza.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.questions.Text.*;

public class ValidationScreens implements Question<Boolean> {

    private final String data;
    private final Target objTarget;

    public ValidationScreens(String data, Target objTarget) {
        this.data = data;
        this.objTarget = objTarget;
    }

    public static ValidationScreens data(Target objTarget, String data) {
        return new ValidationScreens(data, objTarget);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String validation = of(objTarget).viewedBy(actor).asString();
        validation = validation.replaceAll("\n", " ");
        System.out.println("Este es el mensaje del ambiente " + data);
        return validation.contains(data);
    }

}
        
        

