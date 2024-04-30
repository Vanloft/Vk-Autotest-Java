package vk.edu.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import vk.edu.elements.HeaderElement;
import vk.edu.page.MusicPage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchMusicTest extends BaseTest {
    @Disabled("Написана новая версия теста")
    @Test
    public void checkSearchMusic() {
       // MusicPage musicPage = new MusicPage();
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

    @ParameterizedTest
    @CsvFileSource(resources = "/music.csv")
    public void checkSearchMusic(String nameSong, String artist) {
        MusicPage musicPage = new MusicPage();
        Assertions.assertAll("Check searching music",
                () -> Assertions.assertEquals(artist, musicPage.searchMusic(nameSong, artist), "The artist of the song should be displayed when playing"),
                () -> Assertions.assertTrue(musicPage.checkPauseButton(), "Pause button should be visible on display"),
                () -> Assertions.assertNotEquals(0.0, musicPage.checkTimeForPlay(), "Time can'wt be zero")
        );
    }
}
