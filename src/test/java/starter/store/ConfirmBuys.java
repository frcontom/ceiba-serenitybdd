package starter.store;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ConfirmBuys {
    public static Performable purshare(String firtsname,String lastname,String zipcode) {
        return Task.where("{0} Confirm Purshase Firstname : '" + firtsname + "', Last Name : " + lastname+ "', zipcode : " + zipcode,
                Enter.theValue(firtsname).into(LocationUi.CHECKOUT_FORM_FIRSTNAME_FIELD),
                Enter.theValue(lastname).into(LocationUi.CHECKOUT_FORM_LASTNAME_FIELD),
                Enter.theValue(zipcode).into(LocationUi.CHECKOUT_FORM_ZIPCODE_FIELD),
                Click.on(LocationUi.CHECKOUT_FORM_BUTTON)
        );
    }
}
