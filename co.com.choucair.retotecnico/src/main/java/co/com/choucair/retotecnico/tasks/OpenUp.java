package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Login;
import co.com.choucair.retotecnico.userinterface.UtestObject;
import co.com.choucair.retotecnico.userinterface.Utestweb;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

public class OpenUp implements Task {

    private Utestweb utestweb;


    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Open.browserOn(utestweb),
                    Click.on(UtestObject.BUTTON_JOIN));


    }
}
