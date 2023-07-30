package StepObject;

import PageObject.ProductElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static org.testng.Assert.assertTrue;


public class ProductSteps extends ProductElements {

    @Step ("Verify that product has a title")
    public ProductSteps productTitle() {
        assertTrue(productTitle.is(Condition.visible));
        return this;
    }
@Step ("Verify that product has a color")
    public ProductSteps productColor() {
        assertTrue(productColor.is(Condition.visible));
        return this;
    }
@Step ("Verify that product has an ID")
    public ProductSteps productID() {
        assertTrue(productID.is(Condition.visible));
        return this;
    }
@Step ("Verify that product has a price")
    public ProductSteps productPrice() {
        assertTrue(productPrice.is(Condition.visible));
        return this;
    }
@Step ("Verify that product has a quantity")
    public ProductSteps productQuantity() {
        assertTrue(productQuantity.is(Condition.visible));
        return this;
    }
@Step ("Verify that total price is present")
    public ProductSteps productTotalPrice() {
        assertTrue(productTotalPrice.is(Condition.visible));
        return this;
    }
@Step ("Get the total price value")
    public ProductSteps getTotalPrice() {
        productTotalPrice.getText();
        System.out.println(productTotalPrice.getText());
        return this;}
}

