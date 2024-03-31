package vk.edu.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.MusicPage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchMusicTest extends BaseTest{
    @Test
    public void checkSearchMusic(){
        MusicPage musicPage = new MusicPage();
        SelenideElement search = $x(".//input[@data-tsid='inner_input']");
        search.click();
        search.setValue("Поезда");
        search.pressEnter();
        $x(".//button[@data-payload='artistName=Женя Трофимов']").click();
        //sleep(49000); //если не хочется слушать
        sleep(80000);
        $x("//button[@class='pause __active']").click();
        Assertions.assertTrue($x(".//span[@title='Поезда']").isDisplayed());
    }
}
