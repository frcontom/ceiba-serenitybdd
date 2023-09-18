package starter.store;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.location.LocationUiAuth;

public class LoginAuth {
    public static Performable login(String username,String password) {
        return Task.where("{0} authenticate the user with username : '" + username + "', password : " + password,
                Enter.theValue(username).into(LocationUiAuth.AUTH_USERNAME_FIELD),
                Enter.theValue(password).into(LocationUiAuth.AUTH_PASSWORD_FIELD),
                Click.on(LocationUiAuth.AUTH_BUTTON)
        );
    }
}
