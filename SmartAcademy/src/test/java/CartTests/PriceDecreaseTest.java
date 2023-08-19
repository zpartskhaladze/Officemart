package CartTests;

import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.ProductSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class PriceDecreaseTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Case N#12")
    public void productPriceDecrease() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .cartPlus().cartPlus().cartPlus()
                .verifyPriceDecrease(productSteps.productTotalPrice, productSteps.productQuantity);


    }
}
