package com.aliExpress.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDetail {

    public static final Target COLOR_PRODUCT = Target.the("color product item").located(By.xpath("(//div[@class=\"sku-property-image\"])[1]"));
    public static final Target AMOUNT_PRODUCT_INPUT = Target.the("amount product input").located(By.xpath("//*[@class=\"next-input next-medium next-input-group-auto-width\"]/descendant::input"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button").located(By.xpath("(//button[contains(@class,\"addcart\")])[1]"));
    public static final Target SEE_CART_BUTTON = Target.the("see cart product button").located(By.xpath("//button[contains(text(),\"Ver la Cesta\")]"));
}
