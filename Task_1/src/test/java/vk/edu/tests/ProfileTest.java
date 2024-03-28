package vk.edu.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.ProfilePage;

public class ProfileTest extends BaseTest{
    @Test
    public void checkProfilePage() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage();
        Thread.sleep(5000);
        Assertions.assertTrue((Selenide.$x("//*[@id='hook_Block_UserProfileInfo']/div/a/h1")).isDisplayed());
    }
}
