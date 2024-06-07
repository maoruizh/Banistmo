package co.com.bancolombia.certification.mantenimiento.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreditosEnMoraDetalle {
    public static final Target TXT_FEES_PAID = Target.the("cuotas Pagadas").located(By.xpath("//*[@id=\"cantidad-cuotas-pagadas\"]"));
    public static final Target TXT_FEES_DUE = Target.the("cuotas Vencidas").located(By.xpath("//*[@id=\"cantidad-cuotas-vencidas\"]"));
    public static final Target TXT_DAYS_IN_ARREARS = Target.the("dias En Mora").located(By.xpath("//*[@id=\"dias-mora\"]"));
    public static final Target TXT_BALANCE_PAYABLE = Target.the("te Quedan Por Pagar").located(By.xpath("//p[@class='bc-flex bc-justify-content-center bc-cibsans-font-style-6-regular'] "));
    public static final Target TXT_START_ARREAR = Target.the("inicio Mora").located(By.xpath("//*[@id=\"list-p1\"]"));
    public static final Target TXT_YOU_ARE_HERE = Target.the("estas Aca").located(By.xpath("/html/body/app-root/app-listado-creditos/div/div[2]/div[2]/div[1]/div[2]/app-linea-hitos/div/div[4]/div/div[1]/p"));
    public static final Target TXT_LAST_HITO = Target.the("Ultimo hito ").located(By.xpath("/html/body/app-root/app-listado-creditos/div/div[2]/div[2]/div[1]/div[2]/app-linea-hitos/div/div[6]/div/div[1]/p"));
    public static final Target BTN_ARROW_UP = Target.the("Flecha arriba").located(By.xpath("//*[@id=\"estado-en-blanco\"]/div[2]/bc-icon"));
    public static final Target BTN_CHANGE = Target.the("Boton cambiar").located(By.id("boton-cambiar-condiciones"));
    public static final Target TXT_OBLIGATION_TYPE_AND_NUMBER = Target.the("Tipo de obligacion y numero").located(By.xpath("/html/body/app-root/app-opcion-pago/div/div/div[1]/app-mtts-steper/div/div[1]"));

}
