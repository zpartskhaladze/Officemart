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


public class DeleteSingleProductTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Case N#13")
    public void singleProductDelete() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .deleteFromCart();
        Assert.assertFalse(cartSteps.cartNotEmpty.isDisplayed(),
                "Assert that cart isn`t empty");
    }
}
