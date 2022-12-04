package com.aliExpress.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static final Target SEARCH_INPUT = Target.the("search input").located(By.id("search-key"));
    public static final Target SEARCH_SELECT = Target.the("search select").located(By.xpath("//SELECT[@id='search-dropdown-box']"));
    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.className("search-button"));
    public static final Target SUBSCRIPTION_BUTTON = Target.the("suscription button").located(By.xpath("//div[text()=\"No permitir\"]"));
    public static final Target SEARCH_LINK_PRODUCT = Target.the("Search link").located(By.xpath("//*[@class=\"top-container\"]/following-sibling::div[1]/a[1]"));
}
