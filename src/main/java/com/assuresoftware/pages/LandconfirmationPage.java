package com.assuresoftware.pages;

import com.assuresoftware.drivermanger.DriverManger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.IsNot.not;

public class LandconfirmationPage extends DriverManger {

    @FindBy(css = "i[class='fa fa-plus fa-inverse fa-lg']")
    WebElement Newrecord;
    @FindBy(id = "SheLandContamination_Description")
    WebElement Description;
    @FindBy(css = "button[class='ui-datepicker-trigger btn']")
    WebElement Datebutton;
    @FindBy(css = ".ui-datepicker-month")
    WebElement selectDateMonth;
    @FindBy(css = "td[data-handler='selectDay']")
    List<WebElement> Calenderdates;
    @FindBy(css = "button[value='Close']")
    WebElement Saveandclose;
    @FindBy(xpath = "//ul[@class='list_information clearfix']/li[5]/a")
    List<WebElement> descriptionList;
    @FindBy(css = "[title=\"Manage Record\"]")
    List<WebElement> manageRecords;
    @FindBy(css = ".deleteDialog")
    List<WebElement> cogdelete;
    @FindBy(xpath = "//button[@class='ui-button ui-corner-all ui-widget'][1]")
    WebElement DeleteConfirmbutton;
    @FindBy(xpath = "//div[@class='nav-user-name-container']")
    WebElement user;
    @FindBy(linkText = "Log Out")
    WebElement logout;
    @FindBy(tagName = "h3")
    WebElement logoutConfirmation;

    public void setNewrecord() {
        Newrecord.click();
        ScrollByJavaScriptExecutor(0, 400);
    }

    public void setDescription() {
        Description.sendKeys("Automation QA");
        Datebutton.click();
        new Select(selectDateMonth).selectByVisibleText("Aug");
        for (int i = 0; i < Calenderdates.size(); i++) {
            String Calenderdatetext = Calenderdates.get(i).getText();
            if (Calenderdatetext.equalsIgnoreCase("30")) {
                Calenderdates.get(i).click();
                break;
            }
        }
    }

    public void setSaveandclose() {
        Saveandclose.click();
        ScrollByJavaScriptExecutor(0, 400);
    }

    public void discription2ndRecord() {
        Description.sendKeys("Manual QA");
        Datebutton.click();
        new Select(selectDateMonth).selectByVisibleText("Aug");
        for (int i = 0; i < Calenderdates.size(); i++) {
            String Calenderdatetext = Calenderdates.get(i).getText();
            if (Calenderdatetext.equalsIgnoreCase("29")) {
                Calenderdates.get(i).click();
                break;
            }
        }
    }

    public void deleteRecord() {
        String name;
        List<String> list = new ArrayList<>();
        for (WebElement webElement : descriptionList) {
            name = webElement.getText();
            list.add(name);
        }
        manageRecords.get(1).click();
        cogdelete.get(1).click();
        DeleteConfirmbutton.click();

        assertThat(list, not(contains("Automation QA")));

    }

    public void setLogout() {
        user.click();
        logout.click();
        assertThat(logoutConfirmation.getText(), equalToIgnoringCase("Logout"));
    }

    public String getcurrentURL() {
        return driver.getCurrentUrl();

    }


}
