package vk.edu.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import vk.edu.page.LoadableComponent.LoadableComponent;
import vk.edu.page.valueUsers.User;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage implements LoadableComponent {
    private static final String BASE_LOGIN = "technopol41";
    private static final String BASE_PASSWORD = "technopolisPassword";
    private static final SelenideElement FIELD_EMAIL = $x("//input[@name='st.email']");
    private static final SelenideElement FIELD_PASSWD = $x("//input[@name='st.password']");
    private static final SelenideElement BUTTON_LOGIN = $x("//input[@value='Войти в Одноклассники']");
    private static final SelenideElement RED_SUBSCRIPT = $x("//div[@class='input-e login_error']");

    public boolean unsuccessLogin(){
        return RED_SUBSCRIPT.isDisplayed();
    }

    public LoginPage(){
        checkPage();
    }
    public void authenticate(User user) {
        FIELD_EMAIL.shouldBe(visible).click();
        FIELD_EMAIL.setValue(user.getUserLogin());
        FIELD_PASSWD.shouldBe(visible).click();
        FIELD_PASSWD.setValue(user.getUserPassword());
        BUTTON_LOGIN.shouldBe(visible).click();
    }

    public void authenticate(){
        FIELD_EMAIL.shouldBe(visible).click();
        FIELD_EMAIL.setValue(BASE_LOGIN);
        FIELD_PASSWD.shouldBe(visible).click();
        FIELD_PASSWD.setValue(BASE_PASSWORD);
        BUTTON_LOGIN.shouldBe(visible).click();
    }

    @Override
    public void checkPage() {
        FIELD_EMAIL.shouldBe(exist.because("Не найдено поле email"));
        FIELD_PASSWD.shouldBe(exist.because("Не найдено поле password"));
        BUTTON_LOGIN.shouldBe(exist.because("Нет кнопки входа на страничку"));
    }

}