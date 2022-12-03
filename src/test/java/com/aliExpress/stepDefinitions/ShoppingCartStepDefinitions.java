package com.aliExpress.stepDefinitions;


import com.aliExpress.tasks.AddProduct;
import com.aliExpress.tasks.SearchProduct;
import com.aliExpress.userInterfaces.HomePage;
import com.aliExpress.userInterfaces.ShoppingCart;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ShoppingCartStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver browser;
    private HomePage homePage = new HomePage();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que un nuevo cliente (.*) accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras(String name) {
        theActorCalled(name).can(BrowseTheWeb.with(this.browser));
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(homePage));
        browser.manage().window().maximize();
    }

    @Cuando("^el agrega (.*) unidades el producto (.*) de (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String amount, String description, String category) {
        theActorInTheSpotlight().wasAbleTo(
                SearchProduct.searchProductWithDescription(description, category),
                AddProduct.addProductWithAmount(amount)
        );
    }

    @Entonces("^el ve los productos listados en el carro de compras$")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
        theActorInTheSpotlight().should(
                seeThat(the(ShoppingCart.PRODUCT_ITEM_LINK), isPresent())
        );
    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> data) {
        theActorInTheSpotlight().wasAbleTo(
                SearchProduct.searchProductWithDescription(data.get(1), data.get(2)),
                AddProduct.addProductWithAmount(data.get(0))
        );
    }
}
