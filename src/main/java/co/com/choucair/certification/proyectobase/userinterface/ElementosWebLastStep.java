package co.com.choucair.certification.proyectobase.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebLastStep {
    public static final Target PASSWORD =Target.the("Elemento Paswword").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD =Target.the("Elemento Confirm Password").located(By.id("confirmPassword"));
    public static final Target ACCEPT_1 = Target.the("Elemento Confirm 1").located(By.xpath("//label[@class='input-check-box signup-consent signup-consent--highlight']"));
    public static final Target ACCEPT_2 = Target.the("Elemento Confirm 2").located(By.id("termOfUse"));
    public static final Target ACCEPT_3 = Target.the("Elemento Confirm 3").located(By.id("privacySetting"));
    //a[contains(text(),'uTest Code of Conduct')]
    public static final Target COMPLETE_SETUP_BUTTON =Target.the("Elemento Complete Setup Button").located(By.xpath("//span[contains(text(),'Complete Setup')]"));



}
