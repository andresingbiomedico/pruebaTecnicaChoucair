package co.com.choucair.certification.proyectobase.questions;
import co.com.choucair.certification.proyectobase.userinterface.ElementosWebVerificacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.Question;

public class PreguntaUsuario implements Question<Boolean> {

    String pregunta;
    public PreguntaUsuario(String confirmar) {
        pregunta=confirmar;
    }

    public static PreguntaUsuario seeRegistro(String confirmar) {
        return new PreguntaUsuario(confirmar);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        respuesta= Text.of(ElementosWebVerificacion.TEXTO_VERIFICACION).viewedBy(actor).asString();
        if(respuesta.equals(pregunta)){
            System.out.println(respuesta);
            return true;
        }else{
            return false;
        }
    }
}
