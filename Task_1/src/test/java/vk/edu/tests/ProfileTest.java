package vk.edu.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.ProfilePage;
import static com.codeborne.selenide.Selenide.$x;

public class ProfileTest extends BaseTest{
    @Test
    public void checkProfilePage() throws InterruptedException {
        ProfilePage profilePage = new ProfilePage();
        Thread.sleep(5000);
        Assertions.assertTrue(($x(".//*[contains(//*[text()='technopol41 technopol41'], 'technopol41 technopol41')]")).isDisplayed());
    }
}