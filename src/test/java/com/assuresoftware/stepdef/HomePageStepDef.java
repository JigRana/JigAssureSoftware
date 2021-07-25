package com.assuresoftware.stepdef;

import com.assuresoftware.pages.HomePage;
import io.cucumber.java.en.When;

public class HomePageStepDef {
    HomePage homePage = new HomePage();

    @When("User click on Land Contamination using modules drop down menu")
    public void user_click_on_land_contamination_using_modules_drop_down_menu() {
        homePage.setModulesbutton();
    }

}
