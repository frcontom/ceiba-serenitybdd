package starter.store;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmData{
    public static Performable confirmButton() {
        return Task.where("{0} Validate data confirm",
                Click.on(LocationUi.FINISH_BUTTON)
        );
    }

    public static String message(Actor actor) {
        String response = actor.asksFor(Text.of(LocationUi.HEADER_COMPLETE).asString());
        return response;
    }
}
