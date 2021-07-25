package com.assuresoftware.stepdef;

import com.assuresoftware.pages.LandconfirmationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LandconfirmationStepDef {
    LandconfirmationPage land = new LandconfirmationPage();

    @When("User nevigate to Land Confirmation Page")
    public void user_nevigate_to_land_confirmation_page() {
        String actualcontaminationpage = land.getcurrentURL();
        System.out.println(actualcontaminationpage);
        Assert.assertTrue(actualcontaminationpage.contains("https://stirling.she-development.net/automation"));
    }

    @When("User click on New Record button")
    public void user_click_on_new_record_button() {
        land.setNewrecord();
    }

    @When("User fill in sample date and Description fields")
    public void user_fill_in_sample_date_and_description_fields() {
        land.setDescription();
    }

    @When("User click on save and close button")
    public void user_click_on_save_and_close_button() {
        land.setSaveandclose();
    }

    @When("User click on New Record Button to add another record")
    public void user_click_on_new_record_button_to_add_another_record() {
        land.setNewrecord();

    }

    @When("User fill new date and Description")
    public void user_fill_new_date_and_description() {
        land.discription2ndRecord();
    }

    @When("User click cog link and delete the first record that was created by test")
    public void user_click_cog_link_and_delete_the_first_record_that_was_created_by_test() {
    }

    @Then("User can see record succesfully deleted.")
    public void user_can_see_record_succesfully_deleted() {
        land.deleteRecord();
    }

    @Then("User logged out from the website")
    public void user_logged_out_from_the_website() {
        land.setLogout();
    }

}
