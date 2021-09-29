package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.Login;
import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.EnterAccount;
import co.com.choucair.retotecnico.tasks.Logindata;
import co.com.choucair.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RetoTecnicoStepDefinitions {
    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^Steven will create a new user$")
    public void stevenWillCreateANewUser(List<Login> data) {
    theActorCalled("Steven").wasAbleTo(OpenUp.thepage(), Logindata.thepage(data));
    }

    @When("^Steven will into sign up$")
    public void stevenWillIntoSignUp(List<Login> data) {
        theActorInTheSpotlight().attemptsTo(EnterAccount.thePage(data));

    }

    @Then("^Steven will verify account$")
    public void stevenWillVerifyAccount(List<Login> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data.get(0).getEmail())));
    }

}
