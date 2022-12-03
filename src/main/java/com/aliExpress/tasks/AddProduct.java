package com.aliExpress.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    private String amount;

    public AddProduct(String amount) {
        this.amount = amount;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static AddProduct addProductWithAmount(String amount){
        return instrumented(AddProduct.class, amount);
    }
}
