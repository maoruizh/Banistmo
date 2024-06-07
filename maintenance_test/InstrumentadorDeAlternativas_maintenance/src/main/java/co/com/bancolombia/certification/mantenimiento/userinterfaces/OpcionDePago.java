package co.com.bancolombia.certification.mantenimiento.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpcionDePago {

    public static final Target TXT_DUE_DATE = Target.the("Fecha de vencimiento").located(By.xpath("/html/body/app-root/app-opcion-pago/div/div/div[2]/div/div[2]/bc-inline-alert/article/section[2]/section/p[2]"));
    public static final Target BTN_DEFER_PAYMENT = Target.the("Aplazar el pago").located(By.id("option-pay-p7-aplazar"));
    public static final Target BTN_DEFER_PAYMENT_AND_REDUCE_PAYMENT = Target.the("Aplazar el pago y disminuir la cuota").located(By.id("option-pay-p8-disminuir"));
    public static final Target BTN_BACK = Target.the("Boton volver").located(By.id("option-pay-volver"));

}
