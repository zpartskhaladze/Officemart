package SearchTests;

import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisibleSearchFieldTest extends ChromeRunner {
    SearchSteps searchSteps = new SearchSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test case N#1")
    public void verifySearchFieldIsDisplayed() {
        searchSteps.searchOpen();
        Assert.assertTrue(searchSteps.searchField.isDisplayed(),
                "Search field should be displayed");

    }
}
