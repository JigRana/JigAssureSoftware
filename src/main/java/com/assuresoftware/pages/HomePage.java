package com.assuresoftware.pages;

import com.assuresoftware.drivermanger.DriverManger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManger {
    @FindBy(xpath = "//a[contains(text(),'Modules')]")
    WebElement Modulesbutton;
    @FindBy(css = "li[data-areaname='Environment']")
    WebElement Environmentlink;
    @FindBy(linkText = "Land Contamination")
    WebElement Landcontamination;

    public void setModulesbutton() {
        sleep(2000);
        Modulesbutton.click();
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(Environmentlink).build().perform();
        ScrollByJavaScriptExecutor(0, 500);
        Landcontamination.click();

    }

    public String getcurrentURL() {
        return driver.getCurrentUrl();

    }
}
