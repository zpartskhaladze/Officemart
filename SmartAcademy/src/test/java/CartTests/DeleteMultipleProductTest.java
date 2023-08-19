package CartTests;

import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteMultipleProductTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Case N#14, N#15, N#16")
    public void multipleProductDelete() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart();
        searchSteps.searchOpen()
                .searchInput(pageData.itemName3)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .clearCart();
        Assert.assertFalse(cartSteps.cartNotEmpty.isDisplayed(), "Assert cart isn`t empty");
        Assert.assertTrue(cartSteps.emptyCartHint.isDisplayed(), "Assert hint about emtpy cart");
        Assert.assertFalse(cartSteps.cartContinue.isDisplayed(),
                "Assert that Continue button is displayed");
        Assert.assertFalse(cartSteps.clearCart.isDisplayed(),
                "Assert Clear cart button is displayed");

    }
}
