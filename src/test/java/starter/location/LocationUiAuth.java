package starter.location;
import net.serenitybdd.screenplay.targets.Target;
public class LocationUiAuth {
    public static Target AUTH_USERNAME_FIELD = Target.the("username field").locatedBy("#user-name");
    public static Target AUTH_PASSWORD_FIELD = Target.the("Password field").locatedBy("#password");
    public static Target AUTH_BUTTON = Target.the("Button field").locatedBy("#login-button");

}
