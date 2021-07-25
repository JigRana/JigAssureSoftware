package com.assuresoftware.stepdef;

import com.assuresoftware.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        String actual = loginPage.getcurrentURL();
        System.out.println(actual);
        Assert.assertTrue(actual.contains("https://ids.stirling.she-development.net/"));

    }

    @When("User enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        loginPage.setUserName(username);
        loginPage.setPassword(password);

    }
    @When("User click on Login button and navigate to home page")
    public void user_click_on_login_button_and_navigate_to_home_page() {
        loginPage.setLoginButton();
        String actualhomepage = loginPage.getcurrentURL();
        System.out.println(actualhomepage);
        Assert.assertTrue(actualhomepage.equalsIgnoreCase("https://stirling.she-development.net/automation"));

    }

    }
