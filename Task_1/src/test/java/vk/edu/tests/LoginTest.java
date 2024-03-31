package vk.edu.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;

public class LoginTest extends BaseTest{

    @Test
    public void sucLogin(){
        Assertions.assertTrue(($x(".//*[@id='hook_Block_Navigation']//*[@data-l='t,userPage']//*[text()='technopol41 technopol41']")).isDisplayed());
    }
}