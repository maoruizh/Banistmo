package co.com.bancolombia.certification.portalautogestioncobranza.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.apache.commons.lang3.RandomStringUtils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetStocInformation implements Task {

    private final String stringBody;
    private final String url;
    public GetStocInformation(String stringBody, String url) {
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
                                    request.header("message-id", messageRandom);
                                    request.header("Content-Type", "application/json");
                                    request.header("X-IBM-Client-Id", "7a8d649c-5d33-4327-9b5a-1f802ced4c38");
                                    return request.header("X-IBM-Client-Secret", "E4kN1sP4nT4uA7jU7lH7xJ0qG8fJ0bI2gA1lF0pT4fR5oB7dL6").body(stringBody);
                                }));
    }


}
