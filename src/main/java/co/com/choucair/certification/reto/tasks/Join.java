package co.com.choucair.certification.reto.tasks;
import co.com.choucair.certification.reto.userinterface.uTestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task{


    public static Join theCommunity() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(uTestJoinPage.JOIN_BUTTON),
                Enter.theValue("John").into(uTestJoinPage.INPUT_FIRTSNAME),
                Enter.theValue("Arias").into(uTestJoinPage.INPUT_LASTNAME),
                Enter.theValue("jarias@gmail.com").into(uTestJoinPage.INPUT_EMAIL),
                Click.on(uTestJoinPage.SELECT_BIRTHMONTH),
                Click.on(uTestJoinPage.SELECT_MONTH),
                Click.on(uTestJoinPage.SELECT_BIRTHDAY),
                Click.on(uTestJoinPage.SELECT_DAY),
                Click.on(uTestJoinPage.SELECT_BIRTHYEAR),
                Click.on(uTestJoinPage.SELECT_YEAR),
                Click.on(uTestJoinPage.LOCATION_BUTTON),
                Click.on(uTestJoinPage.DEVICES_BUTTON),
                Click.on(uTestJoinPage.LAST_STEP_BUTTON),
                Enter.theValue("ucuTest2021.*").into(uTestJoinPage.CREATE_PASSWORD_INPUT),
                Enter.theValue("ucuTest2021.*").into(uTestJoinPage.CONFIRM_PASSWORD_INPUT),
                Click.on(uTestJoinPage.TERMS_CHECK),
                Click.on(uTestJoinPage.PRIVACY_CHECK),
                Click.on(uTestJoinPage.COMPLETE_BUTTON),
                Click.on(uTestJoinPage.WELCOME_MESSAGE)
        );
    }
}
