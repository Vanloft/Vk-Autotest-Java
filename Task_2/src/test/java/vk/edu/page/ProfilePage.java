package vk.edu.page;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {
    private final static SelenideElement PROFILE_HEADER = $x(".//div[@class='profile-cover_img']");
    private final static SelenideElement PHOTO_BY_PROFILE = $x(".//input[@name='photo']");
    private final static SelenideElement GROUP_MAIN_PHOTO = $x(".//div[@class='portlet group-main-portlet __photo']");


    public ProfilePage() {
        LoginPage loginPage = new LoginPage();
        $x(".//div[@class='tico ellip']").click();
        checkProfilePage();
    }

    public boolean checkUser() {
        return ($x(".//*[contains(//*[text()='technopol41 technopol41'], 'technopol41 technopol41')]")).isDisplayed();
    }

    @Test
    public void checkProfilePage() {
        PROFILE_HEADER.shouldBe(visible.because("Отсутствует блок шапки профиля"));
        PHOTO_BY_PROFILE.shouldBe(exist.because("Отсутствует блок с фото пользователя"));
        GROUP_MAIN_PHOTO.shouldBe(visible.because("Отсутствует блок с группой фотографий бользователей"));
    }
}