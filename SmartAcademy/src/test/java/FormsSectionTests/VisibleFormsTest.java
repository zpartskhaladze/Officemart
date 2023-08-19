package FormsSectionTests;

import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.FormSectionSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisibleFormsTest extends ChromeRunner {
    FormSectionSteps formSectionSteps = new FormSectionSteps();
    CartSteps cartSteps = new CartSteps();
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test case N#18")
    public void legalAndIndividual() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .clickContinueCart();
        Assert.assertTrue(formSectionSteps.individualTab.isDisplayed());
        Assert.assertTrue(formSectionSteps.legalTab.isDisplayed());


    }
}
