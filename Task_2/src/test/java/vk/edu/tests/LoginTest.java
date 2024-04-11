package vk.edu.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import vk.edu.page.MainPage;

import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest extends BaseTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/logpass.csv", numLinesToSkip = 1)
    public void successfulLogin(String login, String password) {
        loginPage.authenticate(login, password);
        MainPage mainPage = new MainPage(true);
        Assertions.assertTrue(mainPage.checkMainPage(), "НЕ ПРОХОДИТ ПЕРВЫЙ ВХОД");
        mainPage.logOut();
        sleep(5000);
        Assertions.assertTrue(loginPage.checkLoginPage(), "не проходит ВЫХОД");
    }
}