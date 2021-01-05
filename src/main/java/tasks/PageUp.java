package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.InitialPage;

public class PageUp implements Task {
    InitialPage initialPage;

    public static Performable thePage() {
        return Tasks.instrumented(PageUp.class,new Object[0]);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(this.initialPage),
                Click.on(InitialPage.JOIN_BUTTON));

    }
}
