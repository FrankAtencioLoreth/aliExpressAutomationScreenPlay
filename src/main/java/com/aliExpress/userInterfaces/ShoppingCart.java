package com.aliExpress.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart {

    public static final Target PRODUCT_ITEM_LINK = Target.the("product item link").located(By.className("cart-product-name"));

}
