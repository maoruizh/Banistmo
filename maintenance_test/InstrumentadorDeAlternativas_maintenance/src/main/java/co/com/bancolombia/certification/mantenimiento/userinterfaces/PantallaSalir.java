package co.com.bancolombia.certification.mantenimiento.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PantallaSalir {
    public static final Target BTN_EXIT = Target.the("Boton salir").located(By.xpath("/html/body/app-root/app-navbar/bc-header/article/header/div/bc-icon"));
    public static final Target TXT_EXIT_OTHER_MOMENT_MESSAGE = Target.the("Mensaje boton en otro momento").located(By.xpath("/html/body/app-root/app-listado-creditos/app-modal-salir/app-modal/bc-modal/article/section/section[5]/div/div/div/div[2]/h4"));
    public static final Target TXT_EXIT_BUTTON_MESSAGE = Target.the("Mensaje boton salir").located(By.xpath("/html/body/app-root/app-navbar/app-modal-salir/app-modal/bc-modal/article/section/section[5]/div/div/div/div[2]/h4"));
}
