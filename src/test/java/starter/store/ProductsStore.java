package starter.store;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsStore{


    public static Performable allButtonsAddProductCart(String id) {

        return  Task.where("{0} Select All Products").then(
                Click.on(By.xpath("(//button[contains(@class,'btn_inventory')])"+"["+id+"]"))
        );


    }
}
