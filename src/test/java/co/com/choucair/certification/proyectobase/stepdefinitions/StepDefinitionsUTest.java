package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.DataModel;
import co.com.choucair.certification.proyectobase.questions.PreguntaUsuario;
import co.com.choucair.certification.proyectobase.tasks.Abrir;
import co.com.choucair.certification.proyectobase.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinitionsUTest {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Visit the website Utest\\.com$")
    public void visitTheWebsiteUtestCom() {
       OnStage.theActorCalled("andres").wasAbleTo(Abrir.lapagina());
    }

    @When("^Click on JOIN TODA\" button and fill form$")
    public void clickOnJOINTODAButtonAndFillForm(List<DataModel> datos) {
      OnStage.theActorInTheSpotlight().attemptsTo(Registrar.unUsuarioConLos(datos));

    }

    @Then("^Verify user registration \"([^\"]*)\"$")
    public void verifyUserRegistration(String confirmar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaUsuario.seeRegistro(confirmar)));

    }



}
