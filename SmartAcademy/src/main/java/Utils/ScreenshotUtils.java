package Utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ScreenshotUtils {

    @Attachment(value = "{screenshotName}", type = "image/png")
    public static byte[] takeScreenshot(String screenshotName) {
        // Capture screenshot using Selenium WebDriver
        TakesScreenshot screenshot = (TakesScreenshot) getWebDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }
}
