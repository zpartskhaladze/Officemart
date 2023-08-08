import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.FormSectionSteps;
import StepObject.ProductSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class FormSectionTest extends ChromeRunner {
    FormSectionSteps formSectionSteps = new FormSectionSteps();
    CartSteps cartSteps = new CartSteps();
    ProductSteps productSteps = new ProductSteps();
    SearchSteps searchSteps = new SearchSteps();
    PageData pageData = new PageData();

    @Test
    @Description("Test case N#18, N#19, N#20, N#21, N#22, N#23, N#24, N#25")
    public void formTest() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart()
                .openCart()
                .clickContinueCart();
        formSectionSteps.checkIndividual()
                .checkLegal()
                .clickLegalSend()
                .checkNameFieldBorderRed()
                .checkIdentificationFieldBorderRed()
                .checkAddressFieldBorderRed()
                .checkPhoneFieldBorderRed()
                .checkDateFieldBorderRed()
                .checkEmailFieldBorderRed()
                .inputCompanyName()
                .clickLegalSend()
                .checkNameFieldBorderNotRed();


    }
}
