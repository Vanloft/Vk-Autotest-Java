package vk.edu.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

import vk.edu.elements.HeaderElement;
import vk.edu.page.LoginPage;

abstract public class BaseTest {
    private static final String BASE_URL = "https://ok.ru/";
    protected static final LoginPage loginPage = new LoginPage(BASE_URL);

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";
        Configuration.browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

        LoginPage logPage = new LoginPage(BASE_URL);
    }

    @AfterEach
    public void goToLoginPage() {
        if (!loginPage.unsuccessLogin()) {
            HeaderElement header = new HeaderElement();
            header.logOut();
        }
    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
