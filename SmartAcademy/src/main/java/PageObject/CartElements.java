package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CartElements {
    public SelenideElement
            addCart = $(byClassName("add_cart")),
            cartToast = $(byClassName("toast")),
            cartPage = $(byClassName("cart_info")),
            cartPlus = $("i.fa.fa-plus"),
            cartMinus = $("i.fa.fa-minus"),
            cartDelete = $("i.fas.fa-times"),
            cartNotEmpty = $("div.item_row.cartItem"),
            clearCart = $$(".remove_carts").get(1),
            emptyCartHint = $(byText("კალათა ცარიელია")),
            cartContinue = $(byClassName("continue"));

}
