import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.ProductSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class CartTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Description("Product specifications and total price tests/" +
            " Test Case N#1, N#4, N#5, N#6, N#7, N#8, N#9, N#10, N#11, N#12, N#13")
    public void cartTestsSingleProduct() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .cartToast()
                .openCart();
        productSteps.productTitle()
                .productColor()
                .productID()
                .productQuantity()
                .productPrice()
                .productTotalPrice();
        cartSteps.verifyPriceIncrease(productSteps.productTotalPrice, productSteps.productQuantity)
                .verifyPriceDecrease(productSteps.productTotalPrice, productSteps.productQuantity)
                .deleteFromCart()
                .checkCartEmpty();
    }

    @Test
    @Description("Test case N#14, N#15, N#16, N#17")
    public void cartTestsMultiProduct() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart();
        searchSteps.searchOpen()
                .searchInput(pageData.itemName3)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .checkCartNotEmpty()
                .clearCart()
                .checkCartEmpty()
                .checkContinueCart()
                .checkClearCart();


    }


}

