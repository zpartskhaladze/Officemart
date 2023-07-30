package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CartElements {
    public SelenideElement
            addCart = $(byClassName("add_cart")),
            cartToast = $(byClassName("toast")),
            cartPage = $(byClassName("cart_info")),
            cartPlus=  $("i.fa.fa-plus"),
            cartMinus=  $("i.fa.fa-minus");

}
