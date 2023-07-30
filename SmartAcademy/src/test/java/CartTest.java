import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.ProductSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class CartTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Description("Product specifications and total price tests/" +
            " Test Case N#1, N#4, N#5, N#6, N#7, N#8, N#9, N#10, N#11, N#12")
    public void productSpecifics() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart();
        productSteps.productTitle()
                .productColor()
                .productID()
                .productQuantity()
                .productPrice()
                .productTotalPrice();
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .verifyPriceIncrease(productSteps.productTotalPrice, productSteps.productQuantity)
                .verifyPriceDecrease(productSteps.productTotalPrice, productSteps.productQuantity);
    }


    }

