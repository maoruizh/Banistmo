package co.com.bancolombia.certification.portalautogestioncobranza.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.apache.commons.lang3.RandomStringUtils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetOfferInformation implements Task {

    private final String stringBody;
    private final String url;
    public GetOfferInformation(String stringBody, String url) {
        this.stringBody = stringBody;
        this.url = url;
    }
    public static Performable whitBody(String stringBody, String url) {
        return instrumented(GetStocInformation.class,stringBody,url);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String messageRandom = RandomStringUtils.randomNumeric(8);
        System.out.println(stringBody +"body");
        System.out.println(url +"url");
        actor.attemptsTo(
                Post.to(url)
                        .with(
                                request -> {
                                    request.relaxedHTTPSValidation();
                                    return request.header("Content-Type", "application/json").body(stringBody);
                                }));
    }
}
