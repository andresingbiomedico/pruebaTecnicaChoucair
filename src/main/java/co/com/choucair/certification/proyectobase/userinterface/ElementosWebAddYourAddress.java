package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebAddYourAddress {
    public static final Target CITY =Target.the("Elemento City").located(By.id("city"));
    public static final Target ZIP =Target.the("Elemento zip").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Elemento Country").located(By.className("btn btn-default form-control ui-select-toggle"));
    public static final Target DEVICES_BUTTON = Target.the("Elemento Boton Devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));
}
