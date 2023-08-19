package StepObject;

import PageObject.FormSectionElements;
import Utils.ScreenshotUtils;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class FormSectionSteps extends FormSectionElements {


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
    public FormSectionSteps checkIdentifierFieldBorderRed() {
        String borderColor = identifierField.getCssValue("border-color");
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

    public FormSectionSteps inputCompanyName(String companyName) {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        nameField.setValue(companyName);
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
    }

    @Step("Check identifier  field border color is not red")
    public FormSectionSteps checkIdentifierFieldBorderNotRed() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        String borderColor = identifierField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(69, 69, 69)"; // This is the RGB value for black
        Assert.assertEquals(borderColor, expectedBorderColor);
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Identifier field borders are not red");
        return this;
    }

    @Step("Check address field border color is not red")
    public FormSectionSteps checkAddressFieldBorderNotRed() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        String borderColor = addressField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(69, 69, 69)"; // This is the RGB value for black
        Assert.assertEquals(borderColor, expectedBorderColor);
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Address field borders are not red");
        return this;
    }

    @Step("Check Identifier code field input")
    public FormSectionSteps VerifyIdentifiernput(String negativeCode) {
        String Value1 = identifierField.getValue();
        System.out.println("Value is" + Value1);
        identifierField.setValue(negativeCode);
        String Value2 = identifierField.getValue();
        System.out.println("Value is" + Value2);
        Assert.assertEquals(Value1, Value2);
        ScreenshotUtils.takeScreenshot("Identifier field input");

        sleep(1000);
        return this;

    }

    @Step("Enter short identifier ")
    public FormSectionSteps enterShortCode(String shortCode) {
        identifierField.setValue(shortCode);
        ScreenshotUtils.takeScreenshot("Short identifier");

        return this;
    }

    @Step("Enter regular identifier")
    public FormSectionSteps enterRegularCode(String regularCode) {
        identifierField.setValue(regularCode);
        ScreenshotUtils.takeScreenshot("Regular identifier");
        return this;
    }

    @Step("Enter long identification code")
    public FormSectionSteps enterLongCode(String longCode) {
        identifierField.setValue(longCode);
        String enteredValue = identifierField.getValue();
        System.out.println("Entered value is: " + enteredValue);

        int numOfDigitsEntered = Math.min(enteredValue.length(), 9);
        System.out.println("Number of digits entered: " + numOfDigitsEntered);

        String expectedValue = longCode.substring(0, numOfDigitsEntered);
        System.out.println("Expected value is: " + expectedValue);


        Assert.assertEquals(expectedValue, enteredValue);
        ScreenshotUtils.takeScreenshot("Long identifier");

        return this;
    }

    @Step("Enter address")
    public FormSectionSteps enterAddress(String address) {
        addressField.setValue(address);
        ScreenshotUtils.takeScreenshot("Address input");

        return this;
    }


    @Step("Enter incorrect phone number format")
    public FormSectionSteps enterInvalidPhone(String invalidNumber) {
        String Value1 = phoneField.getValue();
        System.out.println("Value is " + Value1);
        phoneField.setValue(invalidNumber);
        String Value2 = phoneField.getValue();
        System.out.println("Value is" + Value2);
        Assert.assertEquals(Value1, Value2);
        ScreenshotUtils.takeScreenshot("Incorrect phone");

        return this;


    }


    @Step("Enter short phone number")
    public FormSectionSteps enterShortPhone(String shortPhone) {
        phoneField.setValue(shortPhone);
        ScreenshotUtils.takeScreenshot("Short phone");

        return this;
    }

    @Step("Enter long phone number")
    public FormSectionSteps enterLongPhone(String longPhone) {
        phoneField.setValue(longPhone);
        String enteredValue = phoneField.getValue();
        System.out.println("Entered value is: " + enteredValue);

        int numOfDigitsEntered = Math.min(enteredValue.length(), 9);
        System.out.println("Number of digits entered: " + numOfDigitsEntered);

        String expectedValue = longPhone.substring(0, numOfDigitsEntered);
        System.out.println("Expected value is: " + expectedValue);


        Assert.assertEquals(expectedValue, enteredValue);
        ScreenshotUtils.takeScreenshot("Long phone");

        return this;
    }

    @Step("Enter regular phone number")
    public FormSectionSteps enterRegularPhone(String regularPhone) {
        phoneField.setValue(regularPhone);
        ScreenshotUtils.takeScreenshot("Regular phone");

        return this;
    }


    @Step("Check phone number border color is not red")
    public FormSectionSteps checkPhoneFieldBorderNotRed() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        String borderColor = phoneField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(69, 69, 69)"; // This is the RGB value for black
        Assert.assertEquals(borderColor, expectedBorderColor);
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Phone number field borders are not red");
        return this;
    }

    @Step("Enter short date")
    public FormSectionSteps enterShortDate(String shortDate) {
        dateField.setValue(shortDate);
        ScreenshotUtils.takeScreenshot("Short date");

        return this;
    }

    @Step("Check date field border color is not red")
    public FormSectionSteps checkDateFieldBorderNotRed() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        String borderColor = dateField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(69, 69, 69)"; // This is the RGB value for black
        Assert.assertEquals(borderColor, expectedBorderColor);
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Date field borders are not red");
        return this;
    }

    @Step("Enter regular date")
    public FormSectionSteps enterRegularDate(String regularDate) {
        dateField.setValue(regularDate);
        ScreenshotUtils.takeScreenshot("Regular date");

        return this;
    }

    @Step("Enter regular email")
    public FormSectionSteps enterRegularEmail(String regularEmail) {
        emailField.setValue(regularEmail);
        ScreenshotUtils.takeScreenshot("Regular email");

        return this;
    }

    @Step("Check email field border color is not red")
    public FormSectionSteps checkEmailFieldBorderNotRed() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        String borderColor = emailField.getCssValue("border-color");
        System.out.println("border color" + borderColor);
        String expectedBorderColor = "rgb(69, 69, 69)"; // This is the RGB value for black
        Assert.assertEquals(borderColor, expectedBorderColor);
        sleep(1000);
        ScreenshotUtils.takeScreenshot("Email field borders are not red");
        return this;
    }

    @Step("Enter negative email1")
    public FormSectionSteps enterNegativeEmail1(String negativeEmail1) {
        emailField.setValue(negativeEmail1);
        ScreenshotUtils.takeScreenshot("Negative email1");

        return this;
    }

    @Step("Enter negative email2")
    public FormSectionSteps enterNegativeEmail2(String negativeEmail2) {
        emailField.setValue(negativeEmail2);
        ScreenshotUtils.takeScreenshot("Negative email2");

        return this;
    }

    @Step("Enter negative email3")
    public FormSectionSteps enterNegativeEmail3(String negativeEmail3) {
        emailField.setValue(negativeEmail3);
        ScreenshotUtils.takeScreenshot("Negative email3");
        return this;
    }
}
