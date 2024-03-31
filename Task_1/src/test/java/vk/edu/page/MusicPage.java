package vk.edu.page;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MusicPage{
    private static final SelenideElement FIELD_SEARCH_MUSIC = $x(".//input[@data-tsid='inner_input']");
    private static final SelenideElement MUSIC_PLAYER_CONTROLS = $x(".//div[@class='toolbar-music-layer_offset-fix scroll-modal-indent']");
    private static final SelenideElement NAVIGATION_MUSIC_MENU = $x(".//div[@class='content-container']");
    public MusicPage(){
        $x("//*[@id='music_toolbar_button']").click();
        checkMusicPage();
    }

    @Test
    public void checkMusicPage(){
        FIELD_SEARCH_MUSIC.shouldBe(visible.because("Отсутствует поле для поиска музыки"));
        MUSIC_PLAYER_CONTROLS.shouldBe(exist.because("Нет панели управления мультимедией"));
        NAVIGATION_MUSIC_MENU.shouldBe(exist.because("Отсутствует навигационная панель раздела музыки"));
    }
}

