package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebVerificacion {
    public static final Target TEXTO_VERIFICACION=Target.the("Elemento Web a verificar").located(By.xpath("//div[@class='image-box-header']//h1[contains(text(),'Welcome to the world')]"));
}
