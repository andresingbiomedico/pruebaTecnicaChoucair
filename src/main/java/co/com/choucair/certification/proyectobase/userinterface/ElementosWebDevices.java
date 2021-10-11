package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebDevices {

    public static final Target MOBILE_DEVICE =Target.the("Elemento Movil").located(By.xpath("//span[contains(text(),'Select Brand')]"));
    public static final Target MODEL =Target.the("Elemento Modelo").located(By.id("city"));
    public static final Target OS =Target.the("Elemento Sistema Operativo").located(By.id("city"));
    public static final Target LAST_STEP_BUTTON = Target.the("Elemento boton ultimo paso").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}
