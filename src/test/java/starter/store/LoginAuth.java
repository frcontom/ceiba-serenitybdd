package starter.store;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class LoginAuth {
    public static Performable login(String username,String password) {
        return Task.where("{0} authenticate the user with username : '" + username + "', password : " + password,
                Enter.theValue(username).into(LocationUi.AUTH_USERNAME_FIELD),
                Enter.theValue(password).into(LocationUi.AUTH_PASSWORD_FIELD),
                Click.on(LocationUi.AUTH_BUTTON)
        );
    }
}
