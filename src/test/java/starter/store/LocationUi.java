package starter.store;

import net.serenitybdd.screenplay.targets.Target;

class LocationUi {
    static Target BUTTON_CART = Target.the("Link Open Cart").locatedBy("#shopping_cart_container");
    static Target BUTTON_CHECKOOUT = Target.the("Link CheckOut").locatedBy("#checkout");
    static Target FINISH_BUTTON = Target.the("Checkout field button").locatedBy("#finish");
    static Target HEADER_COMPLETE = Target.the("Checkout field button").locatedBy(".complete-header");
    static Target HEADER_CART_COMPLETE = Target.the("Page cart User").locatedBy("#shopping_cart_container");

}
