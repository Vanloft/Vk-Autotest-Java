package vk.edu.page;

import static com.codeborne.selenide.Selenide.$x;

public class MusicPage {
    public MusicPage(){
        $x("//*[@id='music_toolbar_button']").click();
    }
}