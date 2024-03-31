package vk.edu.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.MusicPage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class MusicTest  extends BaseTest{
    @Test
    public void checkMusic(){
        MusicPage musicPage = new MusicPage();
        $x("//button[@class='play __active']").click();
        sleep(5000);
        Assertions.assertTrue($x("//button[@class='pause __active']").isDisplayed());
    }
}