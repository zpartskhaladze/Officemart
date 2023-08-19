package StepObject;

import PageObject.CartElements;
import Utils.ScreenshotUtils;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;

public class CartSteps extends CartElements {

    @Step("Add item to the cart")
    public CartSteps addToCart() {
        addCart.click();
        sleep(2000);
        return this;
    }


    @Step("Opened cart page")
    public CartSteps openCart() {
        cartPage.click();
        ScreenshotUtils.takeScreenshot("Cart Page");
        return this;
    }

    @Step("Increase product quantity ")
    public CartSteps cartPlus() {
        cartPlus.click();
        ScreenshotUtils.takeScreenshot("Add to cart");
        return this;

    }

    @Step("Verify that Total Price is increased correctly")
    public CartSteps verifyPriceIncrease(SelenideElement productTotalPrice,
                                         SelenideElement productQuantity) {
        double initialPrice = Double.parseDouble(productTotalPrice.getText().trim());
        int initialQuantity = Integer.parseInt(Objects.requireNonNull(productQuantity.getValue()));

        for (int i = 1; i <= 4; i++) {
            cartPlus.click();
            ScreenshotUtils.takeScreenshot("Increased Quantity " + i);

            double newPrice = Double.parseDouble(productTotalPrice.getText().trim());
            int newQuantity = Integer.parseInt(productQuantity.getValue());

            double expectedNewPrice = initialPrice * (newQuantity * 1.0 / initialQuantity);

            assertEquals(newPrice, expectedNewPrice, 0.001);

            // Print the values after each increase
            System.out.println("After Increase " + i + ": Price = " + newPrice + ", Quantity = " + newQuantity);
        }

        return this;
    }

    @Step("Verify that total price is decreased correctly")
    public CartSteps verifyPriceDecrease(SelenideElement productTotalPrice,
                                         SelenideElement productQuantity) {
        // Get initial price and quantity
        double initialPrice = Double.parseDouble(productTotalPrice.getText().trim());
        int initialQuantity = Integer.parseInt(Objects.requireNonNull(productQuantity.getValue()));

        // Decrease quantity three times
        for (int i = 1; i <= 3; i++) {
            cartMinus.click();
            ScreenshotUtils.takeScreenshot("Decreased Quantity " + i);

            double decreasedPrice = Double.parseDouble(productTotalPrice.getText().trim());
            int decreasedQuantity = Integer.parseInt(productQuantity.getValue());

            // Calculate the expected new price based on the initial price and decreased quantity
            double expectedDecreasedPrice = initialPrice * (decreasedQuantity * 1.0 / initialQuantity);
            assertEquals(decreasedPrice, expectedDecreasedPrice, 0.001);

            // Print the values after each decrease
            System.out.println("After Decrease " + i + ": Price = " + decreasedPrice + ", Quantity = " + decreasedQuantity);
        }

        return this;
    }

    @Step("Delete item from the cart")
    public CartSteps deleteFromCart() {
        cartDelete.click();
        ScreenshotUtils.takeScreenshot("Delete item from the cart");
        sleep(2000);
        return this;

    }


    @Step("Clear cart")
    public CartSteps clearCart() {
        // Get the WebDriver instance from Selenide
        WebDriver driver = WebDriverRunner.getWebDriver();

        // Scroll into view using JavaScriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(40,3000);");

        // Click the clearCart button
        clearCart.click();
        ScreenshotUtils.takeScreenshot("Remove all items from the cart");
        return this;
    }


    @Step("Click Continue")
    public CartSteps clickContinueCart() {
        cartContinue.click();
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Continue Cart ");

        return this;
    }


}
















