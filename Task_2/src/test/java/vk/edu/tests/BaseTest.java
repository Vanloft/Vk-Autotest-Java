package vk.edu.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.params.provider.CsvFileSource;
import vk.edu.page.LoginPage;


abstract public class BaseTest {
    private static final String BASE_URL = "https://ok.ru/";
    protected static final LoginPage loginPage = new LoginPage(BASE_URL);

    public void setUp() {
        LoginPage loginPage = new LoginPage(BASE_URL);
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";

    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}