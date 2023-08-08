package StepObject;

import PageObject.FormSectionElements;
import Utils.ScreenshotUtils;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class FormSectionSteps extends FormSectionElements {


    @Step("Check Legal Entity form")
    public FormSectionSteps checkLegal() {
        legalTab.shouldBe(visible);
        assertTrue(legalTab.is(visible));
        return this;
    }

    @Step("Check individual form")
    public FormSectionSteps checkIndividual() {
        individualTab.shouldBe(visible);
        assertTrue(individualTab.is(visible));
        return this;
    }

    @Step("Click on Legal Tab Send")
    public FormSectionSteps clickLegalSend() {
        // Get the WebDriver instance from Selenide
        WebDriver driver = WebDriverRunner.getWebDriver();

        // Scroll into view using JavaScriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(40,3000);");

        // Click Send Button
        legalTabSend.click();
        sleep(1000);
        return this;
    }

    @Step("Check name field border color is red")
    public FormSectionSteps checkNameFieldBorderRed() {
        String borderColor = nameField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(255, 0, 0)"; // This is the RGB value for red
        Assert.assertEquals(borderColor, expectedBorderColor);
        ScreenshotUtils.takeScreenshot("Name field borders are red");
        return this;
    }

    @Step("Check identification field border color is red")
    public FormSectionSteps checkIdentificationFieldBorderRed() {
        String borderColor = identificationField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(255, 0, 0)"; // This is the RGB value for red
        Assert.assertEquals(borderColor, expectedBorderColor);
        ScreenshotUtils.takeScreenshot("Identification field borders are red");

        return this;
    }

    @Step("Check address field border color is red")
    public FormSectionSteps checkAddressFieldBorderRed() {
        String borderColor = addressField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(255, 0, 0)"; // This is the RGB value for red
        Assert.assertEquals(borderColor, expectedBorderColor);
        ScreenshotUtils.takeScreenshot("Address field borders are red");

        return this;
    }

    @Step("Check phone field border color is red")
    public FormSectionSteps checkPhoneFieldBorderRed() {
        String borderColor = phoneField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(255, 0, 0)"; // This is the RGB value for red
        Assert.assertEquals(borderColor, expectedBorderColor);
        ScreenshotUtils.takeScreenshot("Phone field borders are red");

        return this;
    }

    @Step("Check date field border color is red")
    public FormSectionSteps checkDateFieldBorderRed() {
        String borderColor = dateField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(255, 0, 0)"; // This is the RGB value for red
        Assert.assertEquals(borderColor, expectedBorderColor);
        ScreenshotUtils.takeScreenshot("Date field borders are red");

        return this;

    }

    @Step("Check email field border color is red")
    public FormSectionSteps checkEmailFieldBorderRed() {
        String borderColor = emailField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(255, 0, 0)"; // This is the RGB value for red
        Assert.assertEquals(borderColor, expectedBorderColor);
        ScreenshotUtils.takeScreenshot("Email field borders are red");

        return this;

    }

    @Step("Input company name")

    public FormSectionSteps inputCompanyName() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        nameField.setValue("company");
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Input company name");

        return this;

    }

    @Step("Check name field border color is not red")
    public FormSectionSteps checkNameFieldBorderNotRed() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        String borderColor = nameField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(69, 69, 69)"; // This is the RGB value for black
        Assert.assertEquals(borderColor, expectedBorderColor);
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Name field borders are not red");

        return this;
}}




