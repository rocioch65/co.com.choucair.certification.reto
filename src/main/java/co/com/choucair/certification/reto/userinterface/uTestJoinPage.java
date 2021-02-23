package co.com.choucair.certification.reto.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class uTestJoinPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that show the form information").
            located(By.xpath("//ul//li[contains(.,'Join Today')]"));
    public static final Target INPUT_FIRTSNAME = Target.the("input firtsname the new user").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("input lastname the new user").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input email the new user").
            located(By.id("email"));
    public static final Target SELECT_BIRTHMONTH = Target.the("input birth month the new user").
            located(By.id("birthMonth"));
    public static final Target SELECT_MONTH = Target.the("input birth month the new user").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[6]"));
    public static final Target SELECT_BIRTHDAY = Target.the("input birth day the new user").
            located(By.id("birthDay"));
    public static final Target SELECT_DAY = Target.the("input birth day the new user").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[12]"));
    public static final Target SELECT_BIRTHYEAR = Target.the("select birth year").
            located(By.id("birthYear"));
    public static final Target SELECT_YEAR = Target.the("Select year").
            located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[11]"));
    public static final Target LOCATION_BUTTON = Target.the("button that show the form location").
            located(By.xpath("//a[contains(@class,'btn btn-blue') and contains(@aria-label,'Next step - define your location')]"));
    public static final Target DEVICES_BUTTON = Target.the("button that show the form devices").
            located(By.xpath("//a[contains(@class,'btn btn-blue pull-right') and contains(@aria-label ,'Next step - select your devices')]"));
    public static final Target LAST_STEP_BUTTON = Target.the("button that show the last form").
            located(By.xpath("//a[contains(@class,'btn btn-blue pull-right') and contains(@aria-label,'Next - final step')]"));
    public static final Target CREATE_PASSWORD_INPUT = Target.the ("Input password").
            located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the ("Input confirm password").
            located(By.id("confirmPassword"));
    public static final Target  TERMS_CHECK = Target.the("read and accept the uTest Terms of Use and uTest Code of Conduct ").
            located(By.id("termOfUse"));
    public static final Target  PRIVACY_CHECK = Target.the("read and accept the Privacy & Security Policy ").
            located(By.id("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("finish register").
            located(By.id("laddaBtn"));
    public static final Target WELCOME_MESSAGE = Target.the("Welcome message").
            located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));
}
