package co.com.bancolombia.certification.portalautogestioncobranza.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://electronic-signature-qa.apps.ambientesbc.com/banner")
public class BancolombiaCobranzaDigital extends PageObject {

//////////// banner ///////////////
    public static final Target CHECK_PORTAL = Target.the("botón x")
        .located(By.xpath("/html/body/app-root/app-banner/section/div/div/div/div/div/div[2]/div/form/div[4]/bc-radio-group/div/bc-radio[2]/label/input"));


////////////////////////////////////////////////////////////

    public static final Target EXIT_DUPLICATE_SESSION = Target.the("botón x")
            .located(By.xpath("(//button[contains(text(),'SALIR')])[3]"));
    public static final Target DUPLICATE_SESSION = Target.the("botón x")
            .located(By.xpath("/html/body/app-root/app-modal/bc-modal/article/section/section[4]/div/div/div/div[2]/p[1]"));
    public static final Target BTN_X_FROM_CLIENTE_SIN_CONTACTO = Target.the("botón x")
            .located(By.xpath("(//button[contains(text(),'error')])[2]"));
    public static final Target SCREEN_12_MESSAGE_FROM_SCREEN_THREE = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[4]/div/div/div/div[2]/h4"));
    public static final Target SCREEN_CLIENTE_SIN_CONTACTO_MESSAGE_FROM_SCREEN_ALTERNATIVAS = Target.the("mensaje pantalla 4")
            .located(By.xpath("//h4[contains(text(),'Queremos llamarte y no tenemos tu')]"));
    public static final Target BTN_UNDERSTAND_FROM_CLIENTE_SIN_CONTACTO = Target.the("mensaje pantalla 4")
            .located(By.xpath("(//button[contains(text(),'Entendido')])[1]"));
    public static final Target CANCEL_IF_IM_INTERESTED_ALTERNATIVA = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[4]/div/div/div/div[2]/div/div[3]/a"));
    public static final Target BTN_SCREEN_ACTUALIZAR_NUMERO_FROM_ALTERNATIVA = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[5]/div/div/div/div[2]/div/div[2]/button"));
    public static final Target EXIT_IF_IM_INTERESTED_ALTERNATIVA = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[1]/div/button"));
    public static final Target LAST_NUMBER_PHONE = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[5]/div/div/div/div[2]/p[4]"));
    public static final Target SCREEN_BIENVENIDA_MESSAGE = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-bienvenida/div[1]/div[1]/div/div[1]/div/h2"));
    public static final Target CARD_NAME = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[2]/div/card-simple[1]/div/div/div/div[1]/p[1]"));
    public static final Target CARD_NUMBER_UNIFICATION = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[2]/div/card-simple[1]/div/div/div/div[1]/p[1]/span"));
    public static final Target CARD_FEE = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[2]/div/card-simple[1]/div/div/div/div[1]/p[2]/span"));
    public static final Target CARD_AMORTIZACION = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[2]/div/card-simple[1]/div/div/div/div[1]/p[2]"));
    public static final Target SCREEN_CREDITOS_INCLUIDOS_MESSAGE = Target.the("mensaje pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[2]/div/button[2]"));
    public static final Target LAST_NUMBERS = Target.the("ultimos numeros credito")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-obligaciones/div/ul[1]/div/span[2]"));
    public static final Target CREDITS_INCLUDED_NAME = Target.the("nombre creditos incluidos")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-obligaciones/div/ul[1]/div/span[1]"));
    public static final Target CLIENT_NAME = Target.the("nombre de cliente")
            .located(By.xpath("/html/body/app-root/app-bienvenida/div[1]/div[2]/h5"));
    public static final Target DATE_VIG = Target.the("fecha de vigencia")
            .located(By.xpath("/html/body/app-root/app-bienvenida/div[1]/div[1]/div/div[1]/div/p"));
    public static final Target BTN_BANNER = Target.the("boton banner")
            .located(By.xpath("/html/body/app-root/app-banner/section/div/div/div/div/div/div[2]/div/form/div[5]/button"));
    public static final Target INPUT_TYPE = Target.the("tipo cedula")
            .located(By.xpath("//*[@id=\"form2Example27\"]"));
    public static final Target INPUT_CC = Target.the("input cedula")
            .located(By.xpath("//*[@id=\"form2Example17\"]"));
    public static final Target SCREEN_ALTERNATIVAS_MESSAGE = Target.the("pantalla 2")
            .located(By.xpath("/*/body/app-root/app-alternativas/div/div/div/div[1]/h4"));
    public static final Target SCREEN_ALTERNATIVA_MESSAGE = Target.the("pantalla 3")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[1]/div/h3"));
    public static final Target CAT_CODE = Target.the("icono reason")
            .located(By.xpath("//app-alternativa/div/div/div[5]/div/div/div/em"));
    public static final Target SCREEN_EXIT_MESSAGE_EXIT = Target.the("Tomate tu tiempo")
            .located(By.xpath("/html/body/app-root/app-navbar/app-modal/bc-modal/article/section/section[5]/div/div/div/div[2]/h4"));
    public static final Target SCREEN_EXIT_MESSAGE_EXIT_SCREEN_ALTERNATIVA = Target.the("Pregunta seguro desear salir pantalla 3")
            .located(By.xpath("(//h4[contains(text(),'Estas seguro que quieres')])[2]"));
    public static final Target SCREEN_EXIT_MESSAGE_BUTTON_EXIT_SCREEN_ALTERNATIVA = Target.the("Pregunta seguro desear salir pantalla 3")
            .located(By.xpath("(//h4[contains(text(),'Estas seguro que quieres')])[1]"));
    public static final Target SCREEN_EXIT_MESSAGE = Target.the("Tomate tu tiempo")
            .located(By.xpath("/html/body/app-root/app-bienvenida/section/div[2]/div/ul/app-modal/bc-modal/article/section/section[5]/div/div/div/div[2]/h4"));
    public static final Target BUG_BUTTOM = Target.the("Tomate tu tiempo")
            .located(By.xpath("/html/body/app-root/app-navbar/bc-header/article/header/div[2]"));
    public static final Target SCREEN_CONFIRMAR_DATO_CONTACTO_MESSAGE_FROM_ALTERNATIVA = Target.the("pantalla 5")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[5]/div/div/div/div[2]/p[5]"));
    public static final Target SCREEN_CONFIRMAR_DATO_CONTACTO_MESSAGE_FROM_CREDITOS_INCLUIDOS = Target.the("pantalla 5")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[4]/app-modal[1]/bc-modal/article/section/section[5]/div/div/div/div[2]/p[5]"));
    public static final Target SCREEN_CONFIRMAR_DATO_CONTACTO_MESSAGE_FROM_ALTERNATIVAS = Target.the("pantalla 5")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[4]/div/app-modal[1]/bc-modal/article/section/section[5]/div/div/div/div[2]/p[1]"));
    public static final Target REASON = Target.the("razon del credito")
            .located(By.xpath("//app-alternativa/div/div/div[5]/div/div[2]/p"));
    public static final Target RATE = Target.the("tasa del credito")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[2]/div[3]/p"));
    public static final Target MONTH_GRACE_PERIOD = Target.the("mes del periodo de gracia")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[2]/div[2]/span"));
    public static final Target AMORTIZATION_AFTER_GRACE_PERIOD = Target.the("amortizacion despues del periodo de gracia")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[2]/div[2]/p/span[2]"));
    public static final Target NEW_FEE = Target.the("valor despues del periodo de gracia")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[2]/div[2]/p"));
    public static final Target AMORTIZATION_DURING_GRACE_PERIOD = Target.the("amortizacion durante el periodo de gracia")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[2]/div[1]/p/span[2]"));
    public static final Target FEE_DURING_GRACE_PERIOD = Target.the("valor durante el periodo de gracia")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[2]/div[1]/p"));
    public static final Target GRACE_PERIOD = Target.the("periodo de gracia")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[1]/div[3]/p"));
    public static final Target TERM_NEW_CAPITAL = Target.the("plazo de la deuda")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[1]/div[2]/p"));
    public static final Target FEE_FNG = Target.the("primera comision")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[1]/div[1]/div/p[3]/span"));
    public static final Target NEW_CAPITAL = Target.the("capital unificado")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[1]/div[1]/p"));
    public static final Target TOTAL = Target.the("Valor total + FNG")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[3]/app-nuevas-condiciones/div/div[1]/div[1]/p"));
    public static final Target UNIFICATION_MESSAGE = Target.the("cantidad de creditos a unificar")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[1]/div/h3"));
    public static final Target VOLVER_1_FROM_SCREEN_ALTERNATIVA = Target.the("boton volver superior")
            .located(By.xpath("/*/body/app-root/app-alternativa/div/div/div[1]/div/span"));
    public static final Target VOLVER_FROM_SCREEN_ALTERNATIVAS = Target.the("boton volver superior")
            .located(By.xpath("(//button[contains(text(),'Volver')])[2]"));
    public static final Target VOLVER_2_FROM_SCREEN_ALTERNATIVA = Target.the("boton volver inferior")
            .located(By.xpath("(//button[contains(text(),'Volver')])[2]"));
    public static final Target BTN_CONOCER_ATERNATIVAS = Target.the("Conocer Alternativas")
            .located(By.xpath("/html/body/app-root/app-bienvenida/section/div[2]/div/div/button"));
    public static final Target BTN_I_AM_INTERESTED_ALTERNATIVA = Target.the("Si me interesa")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/button"));
    public static final Target BTN_I_AM_INTERESTED_CREDITOS_INCLUIDOS = Target.the("boton si me interesa desde pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[4]/app-modal[1]/button"));
    public static final Target BTN_I_AM_INTERESTED_ALTERNATIVAS = Target.the("boton si me interesa desde pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[4]/div/app-modal[1]/button"));

    public static final Target BTN_CLOSE_INTERESTED_ALTERNATIVAS = Target.the("boton cerrar si me interesa desde pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[4]/app-modal[1]/bc-modal/article/section/section[1]/div/button"));
    public static final Target BTN_CLOSE_INTERESTED_CONFIRMAR_DATO_CONTACTO = Target.the("boton cerrar si me interesa desde pantalla 4")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[1]/bc-modal/article/section/section[1]/div/button"));
    public static final Target BTN_DETALLES_PRIMER_PAQUETE = Target.the("boton detalle primer paquete ")
            .located(By.xpath("(//button[contains(text(),'Detalles')])[1]"));
    public static final Target BTN_CREDITOS_INCLUIDOS = Target.the("Si me interesa")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[2]/div/button[2]"));
    public static final Target BTN_DEBO_ACTUALIZARLO = Target.the("Si me interesa")
            .located(By.xpath("/html/body/app-root/app-navbar/bc-header/div/app-modal/bc-modal/article/section/section[4]/div/div/div/div[2]/div/div[2]"));
    public static final Target MJS_DEBO_ACTUALIZARLO = Target.the("Mensaje como actualizar")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[2]/bc-modal/article/section/section[5]/div/div/div/div[2]/h4"));
    public static final Target BTN_CONFIRMAR = Target.the("Si me interesa")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[4]/div/app-modal[1]/button"));
    public static final Target FORM_COMPLETE_MESSAGE = Target.the("form complete message")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[4]/div/app-modal[1]/button"));
    public static final Target BTN_CANCELAR_SCREEN_ALTERNATIVAS = Target.the("cancelar")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[4]/ul/app-modal/button"));
    public static final Target BTN_CANCELAR_SCREEN_ALTERNATIVA = Target.the("cancelar")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/ul/app-modal/button"));
    public static final Target BTN_CANCELAR_SCREEN_BIENVENIDA = Target.the("cancelar pantalla 1")
            .located(By.xpath("/html/body/app-root/app-bienvenida/section/div[2]/div/ul/app-modal/button"));
    public static final Target BANCOLOMBIA_HOME_MESSAGE = Target.the("mensaje home bancolombia")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[11]/section/div[3]/footer/div[1]/div/div/div[3]/h6"));
    public static final Target BTN_SALIR = Target.the("salir")
            .located(By.xpath("/html/body/app-root/app-navbar/bc-header/article/header/div/bc-icon"));
    public static final Target BTN_SALIR_CONFIRM = Target.the("confirmación salir")
            .located(By.xpath("//button[contains(.,' Salir ')]"));
    public static final Target BTN_SALIR_CONFIRM1 = Target.the("confirmación salir")
            .located(By.xpath("/html/body/app-root/app-navbar/bc-header/article/header/div/bc-icon"));

    public static final Target SCREEN_URL = Target.the("Mensaje pagina url")
            .located(By.xpath("/html/body/app-root/app-bienvenida/div[1]/div[1]/div/div[1]/div/h2"));
    public static final Target SCREEN_BIENVENIDA_MESSAGE_ERROR = Target.the("Mensaje pagina url")
            .located(By.xpath("/html/body/app-root/app-bienvenida/div[1]/div[2]/h5"));
    public static final Target LAST_TIME = Target.the("Mensaje pagina url")
            .located(By.xpath("/html/body/app-root/app-footer/div/div/div/div/div[2]/span[1]"));
    public static final Target BTN_X = Target.the("botón x")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[2]/bc-modal/article/section/section[1]/div/button"));
    public static final Target BTN_UNDERSTAND = Target.the("botón entendido")
            .located(By.xpath("/html/body/app-root/app-alternativa/div/div/div[6]/app-modal[2]/bc-modal/article/section/section[5]/div/div/div/div[2]/div/div/button"));
    public static final Target MJS_FONDO = Target.the("Mensaje de fondo")
            .located(By.xpath("/html/body/app-root/app-alternativas/div/div/div/div[3]/h4"));
    public static final Target DIR_IP = Target.the("Dirección ip experiencia")
            .located(By.xpath("/html/body/app-root/app-footer/div/div/div/div/div[2]/p"));
}

