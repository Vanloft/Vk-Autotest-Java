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
        $x("//*[@id=\"music_layer\"]/header/wm-player/wm-player-controls/button[3]").click();
        Assertions.assertTrue($x("//*[@id='music_layer']/header/wm-player/wm-player-controls/button[3]").isDisplayed());
        sleep(5000);
    }
   /* @Test
    public void checkSearchMusic(){
        SelenideElement search = $x("//*[@id='music_layer']/header/div/wm-search-form/wm-search-input");
        search.click();
        search.setValue("Поезда");
        search.pressEnter();
        $x("//*[@id='music_layer']/main/div/div[2]/div/search-page/wm-portlet/slot/wm-tracks-list/main/wm-track[4]/slot[1]/wm-track-play-button/button/wm-play-control/wm-icon").click();
        Assertions.assertTrue($x("//*[@id='music_layer']/header/wm-player/div/button/wm-card-details/slot[1]/div/span//*[text()='Поезда']").isDisplayed());
        sleep(50000);
    }*/
}
