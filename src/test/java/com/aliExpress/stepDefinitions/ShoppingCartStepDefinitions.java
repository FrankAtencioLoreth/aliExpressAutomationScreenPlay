package com.aliExpress.stepDefinitions;


import com.aliExpress.tasks.AddProduct;
import com.aliExpress.tasks.SearchProduct;
import com.aliExpress.userInterfaces.HomePage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ShoppingCartStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("User");
    private HomePage homePage = new HomePage();

    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        this.actor.can(BrowseTheWeb.with(this.browser));
        browser.manage().window().maximize();
        this.actor.wasAbleTo(Open.browserOn(homePage));
    }


    @Cuando("^el agrega (.*) unidades el producto (.*) de (.*) al carro$")
    public void elAgregaUnProductoAlCarro(String amount, String description, String category) {
        this.actor.wasAbleTo(
                SearchProduct.searchProductWithDescription(description, category),
                AddProduct.addProductWithAmount(amount)
        );
    }

    @Entonces("^el ve los productos listados en el carro de compras$")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> data) {

    }
}
