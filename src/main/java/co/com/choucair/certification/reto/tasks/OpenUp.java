package co.com.choucair.certification.reto.tasks;
import co.com.choucair.certification.reto.userinterface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp implements Task{
    private uTestPage objuTestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(objuTestPage));
    }
}
