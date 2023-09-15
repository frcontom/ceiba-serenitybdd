package starter.store;

import net.serenitybdd.screenplay.targets.Target;

class LocationUi {
    static Target AUTH_USERNAME_FIELD = Target.the("username field").locatedBy("#user-name");
    static Target AUTH_PASSWORD_FIELD = Target.the("Password field").locatedBy("#password");
    static Target AUTH_BUTTON = Target.the("Button field").locatedBy("#login-button");
    static Target BUTTON_CART = Target.the("Link Open Cart").locatedBy("#shopping_cart_container");
    static Target BUTTON_CHECKOOUT = Target.the("Link CheckOut").locatedBy("#checkout");
    static Target CHECKOUT_FORM_FIRSTNAME_FIELD = Target.the("Checkout field firstname").locatedBy("#first-name");
    static Target CHECKOUT_FORM_LASTNAME_FIELD = Target.the("Checkout field lastname").locatedBy("#last-name");
    static Target CHECKOUT_FORM_ZIPCODE_FIELD = Target.the("Checkout field zipcode").locatedBy("#postal-code");
    static Target CHECKOUT_FORM_BUTTON = Target.the("Checkout field button").locatedBy("#continue");
    static Target FINISH_BUTTON = Target.the("Checkout field button").locatedBy("#finish");
    static Target HEADER_COMPLETE = Target.the("Checkout field button").locatedBy(".complete-header");

}
