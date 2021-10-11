package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebInicio {
    public static final Target JOINTODAY =Target.the("Elemento Join Today").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRSTNAME =Target.the("Elemento First name").located(By.id("firstName"));
    public static final Target LASTNAME =Target.the("Elemento Last name").located(By.id("lastName"));
    public static final Target EMAILADDRESS =Target.the("Elemento Email Address").located(By.id("email"));
    public static final Target MONTH =Target.the("Elemento Month").located(By.id("birthMonth"));
    public static final Target DAY =Target.the("Elemento Day").located(By.id("birthDay"));
    public static final Target YEAR =Target.the("Elemento Year").located(By.id("birthYear"));
    public static final Target NEXTLOCATION =Target.the("Elemento Next Location").located(By.xpath("//span[contains(text(),'Next: Location')]"));

}
