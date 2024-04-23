package vk.edu.page;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final static SelenideElement UPLOAD_PHOTO = $x(".//input[@class='html5-upload-link']");
    private final static SelenideElement POST_BUTTON = $x(".//button[@class='dropdown-button__qx55h']");
    private final static SelenideElement NAVBAR_MAIN_PAGE = $x("//nav[@role='navigation']");
    private final static SelenideElement PROFILE_FUNCTIONS = $x("//button[@aria-label='Настройки профиля']");
    private final static SelenideElement FIRST_LOG_OUT_BUTTON = $x(".//div/a[@data-l='t,logout']");
    private final static SelenideElement SECOND_LOG_OUT_BUTTON = $x(".//div/input[@data-l='t,logout']");

    public MainPage() {
        LoginPage loginPage = new LoginPage();
        checkMainPage();
    }

    public MainPage(boolean temp) {
        checkMainPage();
    }

    public void logOut() {
        PROFILE_FUNCTIONS.shouldBe(visible).click();
        FIRST_LOG_OUT_BUTTON.shouldBe(visible).click();
        SECOND_LOG_OUT_BUTTON.shouldBe(visible).click();
    }

    public void checkMainPage() {
        UPLOAD_PHOTO.shouldBe(exist.because("Нет блока ссылки на загрузку фото с главной страницы"));
        POST_BUTTON.shouldBe(exist.because("Нет кнопки публикации на главной странице"));
        NAVBAR_MAIN_PAGE.shouldBe(visible.because("Нет навбара на главной странице"));
    }
}