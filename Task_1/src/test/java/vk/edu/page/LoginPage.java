package vk.edu.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement fieldEmail = $(By.name("st.email"));
    private final SelenideElement fieldPasswd = $(By.name("st.password"));
    public LoginPage(String url){
        Selenide.open(url);
    }

    public void clickOnFieldEmail(String email){
        fieldEmail.click();
        fieldEmail.setValue(email);
    }
    public void clickOnFieldPassword(String password){
        fieldPasswd.click();
        fieldPasswd.setValue(password);
    }

    public void enter(){
      //  $(By.xpath("/html/body/div[11]/div[5]/div[2]/div[1]/div/div/div/div[2]/div[3]/div[3]/div/div/main/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/input")).click();
    }

}