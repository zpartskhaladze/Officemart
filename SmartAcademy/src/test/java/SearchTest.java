import DataObject.PageData;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends ChromeRunner {
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Description("Search Test Positive/ Test Case N#1 + N#2")
    public void searchTestPositive() {
        searchSteps.searchOpen()
                .checkSearchField()
                .searchInput(pageData.itemName1)
                .searchItem()
                .checkItem();



    }

   @Test
    @Description("Search Test Positive/ Test Case N#1 + N#3")
    public void searchTestNegative() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName2)
                .searchItem()
                .invalidSearch(pageData.itemName2);

    }
}