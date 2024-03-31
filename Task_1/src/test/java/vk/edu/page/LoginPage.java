package vk.edu.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage{

    private static final SelenideElement FIELD_EMAIL = $(By.name("st.email"));
    private static final SelenideElement FIELD_PASSWD = $(By.name("st.password"));
    private static final SelenideElement BUTTON_LOGIN = $(By.xpath(".//div/input[@value='Войти в Одноклассники']"));
    public LoginPage(String url){
        Selenide.open(url);
        checkLoginPage();
    }

    public void setValueOnFieldEmail(String email){
        FIELD_EMAIL.click();
        FIELD_EMAIL.setValue(email);
    }
    public void setValueOnFieldPassword(String password){
        FIELD_PASSWD.click();
        FIELD_PASSWD.setValue(password);
    }

    public void enter(){
        BUTTON_LOGIN.click();
    }

    @Test
    public void checkLoginPage(){
        FIELD_EMAIL.shouldBe(visible.because("Не найдено поле email"));
        FIELD_PASSWD.shouldBe(visible.because("Не найдено поле password"));
        BUTTON_LOGIN.shouldBe(visible.because("Нет кнопки входа на страничку"));
    }

}