import DataObject.PageData;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends ChromeRunner {
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Description("Search Test Positive and Negative/ Test Case N#1,N#2, N#3")
    public void searchTestPositive() {
        searchSteps.searchOpen()
                .checkSearchField()
                .searchInput(pageData.itemName1)
                .searchItem()
                .checkItem()
                .searchOpen()
                .searchInput(pageData.itemName2)
                .searchItem()
                .invalidSearch();



    }



    }
