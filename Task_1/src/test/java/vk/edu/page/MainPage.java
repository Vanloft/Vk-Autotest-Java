package vk.edu.page;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static final String LOGIN = "technopol41";
    private static final String PASSWORD = "technopolisPassword";

    private final static SelenideElement UPLOAD_PHOTO = $x(".//input[@class='html5-upload-link']");
    private final static SelenideElement POST_BUTTON = $x(".//button[@class='dropdown-button__qx55h']");
    private final static SelenideElement NAVBAR_MAIN_PAGE = $x(".//div[@class='nav-side __navigation __user-main']");

    public MainPage(String url){
        authenticate(url);
        checkMainPage();
    }
    public void authenticate(String url){
        LoginPage loginpage = new LoginPage(url);
        loginpage.setValueOnFieldEmail(LOGIN);
        loginpage.setValueOnFieldPassword(PASSWORD);
        loginpage.enter();
    }

    @Test
    public void checkMainPage(){
        UPLOAD_PHOTO.shouldBe(exist.because("Нет блока ссылки на загрузку фото с главной страницы"));
        POST_BUTTON.shouldBe(exist.because("Нет кнопки публикации на главной странице"));
        NAVBAR_MAIN_PAGE.shouldBe(visible.because("Нет навбара на главной странице"));
    }
}
