package SearchTests;

import DataObject.PageData;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class NegativeProductSearchTest extends ChromeRunner {
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test case N#3")
    public void NegativeProductSearch() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName2)
                .searchItem()
                .checkInvalidItem();
    }

}
