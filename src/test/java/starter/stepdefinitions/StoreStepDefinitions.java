package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import starter.navigation.NavigateTo;
import starter.store.*;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreStepDefinitions {


    @Given("{actor} an user is on login page")
    public void an_user_in_on_login_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} login with account")
    public void login_with_account(Actor actor, Map<String, String> term) {

        String username = term.get("username");
        String password = term.get("password");

        actor.attemptsTo(
                LoginAuth.login(username,password)
        );
    }

    @And("{actor} validate user intro a your account")
    public void validate_user_intro_a_your_account(Actor actor) {
           actor.attemptsTo(
                   Ensure.that(ProductsStore.cartExist(actor)).isEqualTo(true)
            );
    }

    @And("{actor} select an articles")
    public void select_an_article(Actor actor, List<String> product) {
        for(String id: product){
            actor.attemptsTo(
                    ProductsStore.allButtonsAddProductCart(id)
            );
        }
    }

    @And("{actor} open cart visible products selected")
    public void open_cart_visible_products_selected(Actor actor) {
        actor.attemptsTo(
                CartCheckout.openCart()
        );
    }

    @And("{actor} confirm order on shopping cart")
    public void confirm_order_on_shopping_cart(Actor actor) {
        actor.attemptsTo(
                CartCheckout.checkout_information_user()
        );
    }

    @And("{actor} add data user for purchase")
    public void add_data_user_for_purchase(Actor actor, Map<String, String> term) {

        String firstname = term.get("firstname");
        String lastname  = term.get("lastname");
        String zipcode   = term.get("zipcode");

        actor.attemptsTo(
                ConfirmBuys.purshare(firstname,lastname,zipcode)
        );
    }

    @And("{actor} should be to see confirm purchase message")
    public void should_be_to_see_confirm_purchase(Actor actor) {
        actor.attemptsTo(
                ConfirmData.confirmButton()
        );

    }
    @Then("{actor} validate the purchase message")
    public void he_validate_the_purchase_message(Actor actor) {
        String message = ConfirmData.message(actor);
        actor.attemptsTo(
                Ensure.that(message).isEqualTo("Thank you for your order!"));
    }
}
