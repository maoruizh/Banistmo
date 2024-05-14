package co.com.bancolombia.certification.mantenimiento.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreditosEnMora {
    public static final Target TXT_ID = Target.the("Documento del usuario").located(By.id("form2Example17"));
    public static final Target TXT_TYPE_DOCUMENT = Target.the("Tipo de documento").located(By.id("form2Example27"));
    public static final Target BTN_SIMULATE = Target.the("Simular").located(By.xpath("//button[@class='btn btn-dark btn-lg btn-block']"));
    public static final Target TXT_SUBTITLE_NEW_PAYMENT_OPTION = Target.the("subtitulo nueva opcion pago").located(By.id("subtitulo-nueva-opcion-pago"));
    public static final Target TXT_OBLIGATION_TYPE = Target.the("Tipo de obligacion").located(By.id("credito-libre-inversion"));
    public static final Target TXT_OBLIGATION_NUMBER = Target.the("numero radicado").located(By.id("numero-radicado"));
    public static final Target TXT_DAYS_IN_ARREARS = Target.the("dias en mora").located(By.id("dias-mora"));
    public static final Target TXT_BALANCE_IN_ARREARS = Target.the("saldo en mora").located(By.id("valor-saldo"));
    public static final Target BTN_CHANGE = Target.the("Boton cambiar").located(By.id("boton-cambiar-condiciones"));
    public static final Target BTN_ARROW = Target.the("Boton flecha detalle").located(By.id("(icono-doble-down"));

}
