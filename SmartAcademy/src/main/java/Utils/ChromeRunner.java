package Utils;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ChromeRunner {
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 800;

    @BeforeMethod(description = "Set up browser settings")
    public static void setUp() {
        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();

        // Add arguments to clear cookies and cache
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-cache");
        options.addArguments("--disable-application-cache");
        options.addArguments("--disable-offline-load-stale-cache");

        // Launch the browser in incognito mode
        options.addArguments("--incognito");

        // Set ChromeOptions for Selenide configuration
        Configuration.browserCapabilities = options;

        // Set browser size
        Configuration.browserSize = String.format("%dx%d", WINDOW_WIDTH, WINDOW_HEIGHT);

        open("https://officemart.ge/ge");

        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true)
                .savePageSource(false));
    }

    @AfterMethod(description = "Clear cache and cookies")
    public static void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
