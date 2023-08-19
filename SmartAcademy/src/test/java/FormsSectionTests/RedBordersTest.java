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

public class RedBordersTest extends ChromeRunner {
    FormSectionSteps formSectionSteps = new FormSectionSteps();
    CartSteps cartSteps = new CartSteps();
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Test case N#19, N#20, N#21, N21, N#22, N#23, N#24")
    public void NegativeFormsBorders() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .clickContinueCart();
        formSectionSteps.clickLegalSend()
                .checkNameFieldBorderRed()
                .checkIdentifierFieldBorderRed()
                .checkAddressFieldBorderRed()
                .checkPhoneFieldBorderRed()
                .checkDateFieldBorderRed()
                .checkEmailFieldBorderRed();


    }
}
