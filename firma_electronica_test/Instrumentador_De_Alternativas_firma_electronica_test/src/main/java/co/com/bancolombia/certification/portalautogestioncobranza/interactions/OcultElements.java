package co.com.bancolombia.certification.portalautogestioncobranza.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OcultElements implements Interaction {

    private String selector;
    public static OcultElements inThePage(String selector){
        return Tasks.instrumented(OcultElements.class,selector);
    }

    public OcultElements(String selector) {
        this.selector = selector;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement element = driver.findElement(By.xpath(selector));
        ((JavascriptExecutor) driver).executeScript("arguments[0].remove()",element);
    }
}
