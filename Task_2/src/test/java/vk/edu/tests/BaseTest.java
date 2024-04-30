package vk.edu.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import vk.edu.elements.HeaderElement;
import vk.edu.page.LoginPage;


abstract public class BaseTest {
    private final static String BASE_URL = "https://ok.ru/";
    protected final static LoginPage loginPage = new LoginPage(BASE_URL);

    @BeforeAll
    public static void setUp() {
        LoginPage logPage = new LoginPage(BASE_URL);
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";

    }

    @AfterEach
    public void goToLoginPage(){
        if (!loginPage.unsuccessLogin()){
            HeaderElement header = new HeaderElement();
            header.logOut();
        }
    }
    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}