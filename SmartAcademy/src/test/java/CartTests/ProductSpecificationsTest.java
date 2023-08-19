package CartTests;

import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.ProductSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import Utils.ScreenshotUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.*;

public class ProductSpecificationsTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();
    ProductSteps productSteps = new ProductSteps();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case N#5. N#6, N#7, N#8, N#9, N#10")
    public void productSpecifications() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();

        cartSteps.addToCart()
                .openCart();

        step("Verify product title is visible", () -> {
            Assert.assertTrue(productSteps.productTitle.isDisplayed(),
                    "Assert that product title is visible");
            ScreenshotUtils.takeScreenshot("Product title");
        });

        step("Verify product color is visible", () -> {
            Assert.assertTrue(productSteps.productColor.isDisplayed(),
                    "Assert product color is visible");
            ScreenshotUtils.takeScreenshot("Product color");
        });

        step("Verify product ID is visible", () -> {
            Assert.assertTrue(productSteps.productID.isDisplayed(),
                    "Assert product ID is visible");
            ScreenshotUtils.takeScreenshot("Product ID");
        });

        step("Verify product quantity is visible", () -> {
            Assert.assertTrue(productSteps.productQuantity.isDisplayed(),
                    "Assert product quantity is visible");
            ScreenshotUtils.takeScreenshot("Product quantity");
        });

        step("Verify product price is visible", () -> {
            Assert.assertTrue(productSteps.productPrice.isDisplayed(),
                    "Assert product price is visible");
            ScreenshotUtils.takeScreenshot("Product price");
        });

        step("Verify product total price is visible", () -> {
            Assert.assertTrue(productSteps.productTotalPrice.isDisplayed(),
                    "Assert product total price is visible");
            ScreenshotUtils.takeScreenshot("Product total price");
        });
    }
}
