package vk.edu.tests;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest{

    @Test
    public void sucLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Assertions.assertTrue((Selenide.$x(".//*[@id='hook_Block_Navigation']//*[@data-l='t,userPage']//*[text()='technopol41 technopol41']")).isDisplayed());
    }
}