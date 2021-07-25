package com.assuresoftware.pages;

import com.assuresoftware.drivermanger.DriverManger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManger {
    @FindBy(id = "username")
    WebElement userName;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(css = "#login")
    WebElement loginButton;

    public void setUserName(String username) {
        userName.sendKeys(username);
    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void setLoginButton() {

        loginButton.click();
    }

    public String getcurrentURL() {
        return driver.getCurrentUrl();

    }


}
