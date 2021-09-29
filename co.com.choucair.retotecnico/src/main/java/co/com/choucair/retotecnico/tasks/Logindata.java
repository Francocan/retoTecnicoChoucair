package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Login;
import co.com.choucair.retotecnico.userinterface.UtestObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.util.List;

public class Logindata implements Task {
    private List<Login> data;
    public Logindata(List<Login> data) {
        this.data = data;
    }
    public static Logindata thepage(List<Login> data) {
        return Tasks.instrumented(Logindata.class,data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getFirstname()).into(UtestObject.INPUT_FN),
                Enter.theValue(data.get(0).getLastname()).into(UtestObject.INPUT_LN),
                Enter.theValue(data.get(0).getEmail()).into(UtestObject.INPUT_EMAIL),
                Click.on(UtestObject.BUTTON_DB),
                SelectFromOptions.byVisibleText("January").from(UtestObject.BUTTON_DB),
                SelectFromOptions.byVisibleText("6").from(UtestObject.BUTTON_DAY),
                SelectFromOptions.byVisibleText("1996").from(UtestObject.BUTTON_YEAR),
                Click.on(UtestObject.BUTTON_LANGUAGE),
                MoveMouse.to(UtestObject.BUTTON_SPANISH).andThen(actions -> actions.click()),
                Click.on(UtestObject.BUTTON_NEXT1),
                Click.on(UtestObject.INPUT_CITY),
                Enter.theValue(data.get(0).getCity()).into(UtestObject.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UtestObject.INPUT_CITY),
                Click.on(UtestObject.INPUT_POSTAL),
                Enter.theValue(data.get(0).getPostal()).into(UtestObject.INPUT_POSTAL),
                Click.on(UtestObject.BUTTON_COUNTRY),
                MoveMouse.to(UtestObject.BUTTON_COL).andThen(actions -> actions.click()),
                Click.on(UtestObject.BUTTON_ND),
                JavaScriptClick.on(UtestObject.BUTTON_YCPT),
                MoveMouse.to(UtestObject.BUTTON_WINDOWS).andThen(actions -> actions.click()),
                Click.on(UtestObject.BUTTON_VERSION),
                MoveMouse.to(UtestObject.BUTTON_VESIONIN).andThen(actions -> actions.click()),
                Click.on(UtestObject.BUTTON_LANGUAGUE2),
                MoveMouse.to(UtestObject.BUTTON_LANGUAGUESPANISH).andThen(actions -> actions.click()),
                Click.on(UtestObject.BUTTON_MOBILE),
                MoveMouse.to(UtestObject.BUTTON_MOBILEHW).andThen(actions -> actions.click()),
                Click.on(UtestObject.BUTTON_MODEL),
                Enter.theValue("iPhone 4").into(UtestObject.BUTTON_MODELCLICK),
                Click.on(UtestObject.BUTTON_CLICKIPHONE),
                Click.on(UtestObject.BUTTON_OPSYSCLICK),
                Enter.theValue("iOS 11.3").into(UtestObject.BUTTON_OPSYSCLICKIOS),
                Click.on(UtestObject.BUTTON_OPSYS113),
                Click.on(UtestObject.BUTTON_NEXTLSTEP),
                Click.on(UtestObject.BUTTON_PASSWORD),
                Enter.theValue(data.get(0).getPassword()).into(UtestObject.BUTTON_PASSWORD),
                Click.on(UtestObject.BUTTON_PASSWORD_CONFIRM),
                Enter.theValue(data.get(0).getPassword()).into(UtestObject.BUTTON_PASSWORD_CONFIRM),
                Click.on(UtestObject.CLICK_ACCEPT_TERMS),
                Click.on(UtestObject.CLICK_PRIVACY_SECURITY),
                Click.on(UtestObject.BUTTON_COMPLETE),
                Click.on(UtestObject.BUTTON_LOGIN)
                );
    }
}
