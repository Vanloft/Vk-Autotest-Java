package vk.edu.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import vk.edu.page.MainPage;


abstract public class BaseTest {
    private final static String BASE_URL = "https://ok.ru/";
    public void setUp() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";
    }

    @BeforeEach
    public void init(){
        setUp();
        MainPage mainPage = new MainPage(BASE_URL);
    }

    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}