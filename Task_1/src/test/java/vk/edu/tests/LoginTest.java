package vk.edu.tests;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{

    @Test
    public void sucLogin(){
       Assertions.assertTrue((Selenide.$x(".//*[@id='hook_Block_Navigation']//*[@data-l='t,userPage']//*[text()='technopol41 technopol41']")).isDisplayed());
    }
}