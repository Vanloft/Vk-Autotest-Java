package vk.edu.page;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {

    public ProfilePage(){
        $x("//*[@id='hook_Block_Navigation']/div/div/div[1]/a").click();
    }
}
