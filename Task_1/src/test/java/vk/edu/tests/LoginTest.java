package vk.edu.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.ProfilePage;

public class LoginTest extends BaseTest {
    @Test
    public void unsuccessLogin() {
        String login = "mjvknerlw515+615";
        String passwd = "jklvnwejkllvw564+645";
        loginPage.authenticate(login, passwd);
        Assertions.assertEquals("Неправильно указан логин и/или пароль", loginPage.checkRedSubscript(), "Отображается красный подстрочник согласно сообщению");
        ProfilePage checkSuccess = new ProfilePage();
        Assertions.assertTrue(checkSuccess.checkUser());
    }
}