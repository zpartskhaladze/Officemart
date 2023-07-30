package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductElements {
    public SelenideElement
            productTitle = $(byClassName("item_title")),
            productColor = $(byClassName("color")),
            productID = $(byClassName("item_id")),
            productQuantity = $(byName("quantity")),
            productPrice = $(byClassName("prod_price")),
            productTotalPrice = $(byId("totalPrice"));


}