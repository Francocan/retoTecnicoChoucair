package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Login;
import co.com.choucair.retotecnico.userinterface.SignInObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class EnterAccount implements Task {
    private List<Login> data;
    public EnterAccount(List<Login> data) {
        this.data = data;
    }

    public static EnterAccount thePage(List<Login> data) {
        return Tasks.instrumented(EnterAccount.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignInObject.BUTTON_EMAILADDRESS),
                Enter.theValue(data.get(0).getEmail()).into(SignInObject.BUTTON_EMAILADDRESS),
                Click.on(SignInObject.BUTTON_PASSWORD),
                Enter.theValue(data.get(0).getPassword()).into(SignInObject.BUTTON_PASSWORD),
                Click.on(SignInObject.BUTTON_SIGIN)
                );
    }
}
