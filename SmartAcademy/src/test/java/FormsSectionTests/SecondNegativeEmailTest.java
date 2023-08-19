package FormsSectionTests;

import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.FormSectionSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class SecondNegativeEmailTest extends ChromeRunner {
    FormSectionSteps formSectionSteps = new FormSectionSteps();
    CartSteps cartSteps = new CartSteps();
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test case N#39")
    public void NegativeEmail2() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .clickContinueCart();
        formSectionSteps.clickLegalSend()
                .checkEmailFieldBorderRed()
                .enterNegativeEmail1(pageData.negativeEmail2)
                .clickLegalSend()
                .checkEmailFieldBorderRed();
    }
}
