package StepObject;

import PageObject.ProductElements;
import io.qameta.allure.Step;


public class ProductSteps extends ProductElements {


@Step ("Get the total price value")
    public ProductSteps getTotalPrice() {
        productTotalPrice.getText();
        System.out.println(productTotalPrice.getText());
        return this;}
}

