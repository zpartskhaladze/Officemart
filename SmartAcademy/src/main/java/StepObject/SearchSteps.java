package StepObject;

import PageObject.SearchElements;
import Utils.ScreenshotUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static org.testng.Assert.assertTrue;

public class SearchSteps extends SearchElements {

    @Step("Open Search Field")
    public SearchSteps searchOpen() {
        searchBtnMinimized.click();
        ScreenshotUtils.takeScreenshot("Opened Search Field");
        return this;
    }

    @Step("Assert that check field is opened")
    public SearchSteps checkSearchField() {
        assertTrue(searchField.is(Condition.visible));
        return this;
    }

    @Step("Enter an item name")
    public SearchSteps searchInput(String item) {
        searchInput.setValue(item);
        ScreenshotUtils.takeScreenshot("Entered Input");
        return this;
    }

    @Step("Search an item")
    public SearchSteps searchItem() {
        searchBtnExpanded.click();
        return this;
    }

    @Step("Assert that search result is correct")
    public SearchSteps checkItem() {
        String productTitle = searchResult1.getText().trim();
        assertTrue(productTitle.contains("კალამი ბურთულიანი")); // Hard assert
        return this;
    }

    @Step("Assert that invalid search has correct message")
    public SearchSteps invalidSearch() {
        assertTrue(invalidSearch.is(Condition.visible)); // Hard assert
        ScreenshotUtils.takeScreenshot("Invalid search message");
        return this;
    }
}
