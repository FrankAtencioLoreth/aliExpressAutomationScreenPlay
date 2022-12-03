package com.aliExpress.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Keys;

import static com.aliExpress.userInterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SearchProduct implements Task {

    private String description;
    private String category;

    public SearchProduct(String description, String category) {
        this.description = description;
        this.category = category;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(SUBSCRIPTION_BUTTON).viewedBy(actor).asBoolean())
            actor.attemptsTo(Click.on(SUBSCRIPTION_BUTTON));
        actor.attemptsTo(
                Enter.theValue(this.description).into(SEARCH_INPUT).thenHit(Keys.TAB),
                Click.on(SEARCH_BUTTON),
                Click.on(SEARCH_LINK_PRODUCT)
        );
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
    }

    public static SearchProduct searchProductWithDescription(String description, String category){
        return instrumented(SearchProduct.class, description, category);
    }
}
