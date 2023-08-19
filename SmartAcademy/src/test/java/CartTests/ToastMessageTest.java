package CartTests;

import DataObject.PageData;
import StepObject.CartSteps;
import StepObject.SearchSteps;
import Utils.ChromeRunner;
import Utils.ScreenshotUtils;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;


public class ToastMessageTest extends ChromeRunner {
    CartSteps cartSteps = new CartSteps();
    PageData pageData = new PageData();
    SearchSteps searchSteps = new SearchSteps();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case N#4")
    public void cartToastMessage() {
        searchSteps.searchOpen()
                .searchInput(pageData.itemName1)
                .searchItem();
        cartSteps.addToCart();

        step("Verify cart toast message is visible", () -> {
            $(By.className("toast")).shouldBe(Condition.visible);
            ScreenshotUtils.takeScreenshot("Cart Toast");
        });
    }

}
