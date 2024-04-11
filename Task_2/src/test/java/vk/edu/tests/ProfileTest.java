package vk.edu.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.ProfilePage;

import static com.codeborne.selenide.Selenide.sleep;

public class ProfileTest extends BaseTest {
    @Test
    public void checkProfilePage() {
        ProfilePage profilePage = new ProfilePage();
        sleep(5000);
        Assertions.assertTrue(profilePage.checkUser());
    }
}