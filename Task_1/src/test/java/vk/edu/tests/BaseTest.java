package vk.edu.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import vk.edu.page.LoginPage;


abstract public class BaseTest {
    private static final String LOGIN = "technopol41";
    private static final String PASSWORD = "technopolisPassword";
    private final static String BASE_URL = "https://ok.ru/";
    public void setUp() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";
    }

    public void authenticate(){
        LoginPage loginpage = new LoginPage(BASE_URL);
        loginpage.clickOnFieldEmail(LOGIN);
        loginpage.clickOnFieldPassword(PASSWORD);
        loginpage.enter();
    }
    @BeforeEach
    public void init(){
        setUp();
        authenticate();
    }

    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}