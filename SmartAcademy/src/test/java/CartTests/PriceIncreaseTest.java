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

public class PriceIncreaseTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Case N#11")
    public void productPriceIncrease() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .verifyPriceIncrease(productSteps.productTotalPrice, productSteps.productQuantity);
    }
}
