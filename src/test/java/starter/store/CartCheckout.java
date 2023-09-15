package starter.store;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class CartCheckout {

    public static Performable openChechout() {

        return  Task.where("{0} Open Cart Next Pass Button cart").
                then(Click.on(LocationUi.BUTTON_CART))
                .then(Click.on(LocationUi.BUTTON_CHECKOOUT)
        );

    }
}
