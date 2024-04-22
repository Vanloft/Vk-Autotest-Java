package vk.edu.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vk.edu.page.MusicPage;

public class SearchMusicTest extends BaseTest{
    @Test
    public void checkSearchMusic(){
        MusicPage musicPage = new MusicPage();
        String nameSong = "Поезда";
        String artist = "Женя Трофимов";
        Assertions.assertEquals(artist, musicPage.searchMusic(nameSong, artist), "Имя исполнителя не совпадает с исполнителем в найденном треке");
    }
}
