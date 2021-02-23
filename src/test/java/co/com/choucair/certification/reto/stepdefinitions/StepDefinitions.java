package co.com.choucair.certification.reto.stepdefinitions;
import co.com.choucair.certification.reto.questions.Answer;
import co.com.choucair.certification.reto.tasks.Join;
import co.com.choucair.certification.reto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.GivenWhenThen;

public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than John want to created a new user at the uTest$")
    public void thanJohnWantToCreatedANewUserAtTheUTest() {
        OnStage.theActorCalled("Jhon").wasAbleTo(OpenUp.thePage());
    }

    @When("^he register your personal information at the uTest$")
    public void heRegisterYourPersonalInformationAtTheUTest() {
        OnStage.theActorInTheSpotlight().attemptsTo(Join.theCommunity());
    }

    @Then("^he is welcome at the platform uTest$")
    public void heIsWelcomeAtThePlatformUTest(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
