package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.DataModel;
import co.com.choucair.certification.proyectobase.userinterface.*;
import co.com.choucair.certification.proyectobase.util.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import java.util.List;


public class Registrar  implements Task {

    List<DataModel> datos;
     public Registrar(List<DataModel> datos){
          this.datos=datos;
     }

    public static Registrar unUsuarioConLos(List<DataModel> datos)
    {
           return new Registrar(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Click.on(ElementosWebInicio.JOINTODAY),
                 Enter.theValue(datos.get(Constantes.ZERO).getFirstName()).into(ElementosWebInicio.FIRSTNAME),
                 Enter.theValue(datos.get(Constantes.ZERO).getLastName()).into(ElementosWebInicio.LASTNAME),
                 Enter.theValue(datos.get(Constantes.ZERO).getEmailAddress()).into(ElementosWebInicio.EMAILADDRESS),
                 SelectFromOptions.byVisibleText(datos.get(Constantes.ZERO).getMonth()).from(ElementosWebInicio.MONTH),
                 SelectFromOptions.byVisibleText(datos.get(Constantes.ZERO).getDay()).from(ElementosWebInicio.DAY),
                 SelectFromOptions.byVisibleText(datos.get(Constantes.ZERO).getYear()).from(ElementosWebInicio.YEAR),
                 Click.on(ElementosWebInicio.NEXTLOCATION),
                 Enter.theValue(datos.get(Constantes.ZERO).getCity()).into(ElementosWebAddYourAddress.CITY),
                 Enter.theValue(datos.get(Constantes.ZERO).getZip()).into(ElementosWebAddYourAddress.ZIP),
                 Click.on(ElementosWebAddYourAddress.DEVICES_BUTTON),
                 Click.on(ElementosWebDevices.LAST_STEP_BUTTON),
                 Enter.theValue(datos.get(Constantes.ZERO).getPassword()).into(ElementosWebLastStep.PASSWORD),
                 Enter.theValue(datos.get(Constantes.ZERO).getPassword()).into(ElementosWebLastStep.CONFIRM_PASSWORD),
                 Click.on(ElementosWebLastStep.ACCEPT_1),
                 Click.on(ElementosWebLastStep.ACCEPT_2),
                 Click.on(ElementosWebLastStep.ACCEPT_3),
                 Click.on(ElementosWebLastStep.COMPLETE_SETUP_BUTTON)


                 //SelectFromOptions.byVisibleText(datos.get(Constantes.ZERO).getCountry()).from(ElementosWebAddYourAddress.COUNTRY)

                 //WaitUntil.the(ElementosWebAddYourAddress.CITY,isVisible()).forNoMoreThan(15).seconds()
                 //WaitUntil.the(ElementosWebAddYourAddress.ZIP,isVisible()).forNoMoreThan(15).seconds()
                 //Enter.theValue(datos.get(Constantes.ZERO).getCity()).into(ElementosWebAddYourAddress.CITY)
                 //Click.on(ElementosWebAddYourAddress.DEVICES_BUTTON)
                 //WaitUntil.the(ElementosWebDevices.OS_COMPUTER,isVisible()).forNoMoreThan(15).seconds()
                 );
    }
}
