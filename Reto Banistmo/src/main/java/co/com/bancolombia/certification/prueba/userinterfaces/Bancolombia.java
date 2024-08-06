package co.com.bancolombia.certification.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Bancolombia {

    public static final Target BTN_NEGOCIOS = Target.the("Boton Negocios").located(By.id("header-pymes"));
    public static final Target BTN_SOLUCIONES_NO_FINANCIERAS = Target.the("Boton Soluciones no financieras").located(By.id("menu-productos-finan"));
    public static final Target BTN_HERRAMIENTAS = Target.the("Boton Herramientas").located(By.id("linkherramientas"));
    public static final Target BTN_FLECHA_DERECHA = Target.the("Boton flecha de desplazamiento derecho").located(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[2]"));
    public static final Target BTN_GESTIONAR_FINANZAS = Target.the("Boton opción Gestionar Finanzas").located(By.xpath("//a[contains(text(),'Gestionar las finanzas de mi negocio')]"));
    public static final Target BTN_CONVERTIDOR_TASAS_INTERES = Target.the("Boton Convertidor de tasas de interes").located(By.xpath(" (//h5[@id='titleCard'])[5]"));
    public static final Target BTN_DE_TASANOMINAL_A_TASAEFECTIVA = Target.the("Boton de tasa nominal a tasa efectiva").located(By.id("btntoolUno"));
    public static final Target TXT_INGRSE_TASA_INTERES = Target.the("Texto ingresar tasa de interes").located(By.xpath("//*[@id=\"interes\"]"));
    public static final Target BTN_PERIODICIDAD_MENSUAL = Target.the("Boton periodicidad deseada mensual").located(By.xpath("//*[@id=\"periodicidad-deseada\"]/option[7]"));
    public static final Target BTN_CAPITALIZACION_MENSUAL = Target.the("Boton ingresa la capitalizacion mensual").located(By.xpath("//*[@id=\"capitalizacion\"]/option[7]"));
    public static final Target TXT_RESULTADO_TASA = Target.the("Texto del resultadod e la tasa").located(By.xpath("//*[@id=\"respuesta\"]"));
}