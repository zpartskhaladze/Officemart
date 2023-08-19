package SearchTests;

import DataObject.PageData;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class PositiveProductSearchTest extends ChromeRunner {
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test case N#2")
    public void positiveProductSearch() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem()
                .checkCorrectItem();
    }
}
