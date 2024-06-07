package co.com.bancolombia.certification.mantenimiento.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuevasCondiciones {

    public static final Target BTN_NEW_DATA = Target.the("Nueva fecha de pago").located(By.id("nuevasCondiciones_title_NuevaFecha"));
    public static final Target BTN_NEW_FEE = Target.the("Nueva cuota mensual de pago").located(By.xpath("/html/body/app-root/app-nuevas-condiciones/div/div/div[2]/div[1]/div[2]/p"));

}
