package com.assuresoftware;

import com.assuresoftware.drivermanger.DriverManger;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    DriverManger driver = new DriverManger();

    @Before
    public void setUp() {
        driver.openBrowser("chrome");
        driver.navigateto("https://stirling.she-development.net/automation");
        driver.maxBrowser();
        driver.applyImplici();
    }

    @After
    public void closeBrowser() {
        driver.closeBrowser();
    }
}

