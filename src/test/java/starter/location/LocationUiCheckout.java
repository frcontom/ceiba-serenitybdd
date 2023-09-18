package starter.location;
import net.serenitybdd.screenplay.targets.Target;

public class LocationUiCheckout {
    public static Target CHECKOUT_FORM_FIRSTNAME_FIELD = Target.the("Checkout field firstname").locatedBy("#first-name");
    public static Target CHECKOUT_FORM_LASTNAME_FIELD = Target.the("Checkout field lastname").locatedBy("#last-name");
    public static Target CHECKOUT_FORM_ZIPCODE_FIELD = Target.the("Checkout field zipcode").locatedBy("#postal-code");
    public static Target CHECKOUT_FORM_BUTTON = Target.the("Checkout field button").locatedBy("#continue");
}
