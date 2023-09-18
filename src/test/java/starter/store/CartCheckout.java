package starter.store;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class CartCheckout {

    public static Performable openCart() {

        return  Task.where("{0} Open Cart Validate product in the cart").
                then(Click.on(LocationUi.BUTTON_CART));
    }
    public static Performable checkout_information_user() {

        return  Task.where("{0} Checkout information user").
                then(Click.on(LocationUi.BUTTON_CHECKOOUT)
        );
    }
}
