package com.roofStacks.stepDefinitions;

import com.roofStacks.pages.MainPage;
import com.roofStacks.utility.BrowserUtils;
import com.roofStacks.utility.ConfigurationReader;
import com.roofStacks.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.output.BrokenWriter;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class n11StepDef {

    MainPage mainPage = new MainPage();

    @When("Navigate to {string}")
    public void navigate_to(String link) {
        Driver.getDriver().get(ConfigurationReader.getProperty(link));
    }

    @When("log in with facebook")
    public void log_in_with_facebook() {
        mainPage.signInBtn.click();
        mainPage.withFacebookLogin.click();
        //  mainPage.popupHandle.click();
        BrowserUtils.waitFor(3);
        BrowserUtils.switchToWindow("Facebook");
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        BrowserUtils.waitFor(5);
        //   mainPage.facabookPopup.click();

        mainPage.faceBookLogin.sendKeys(ConfigurationReader.getProperty("faceUser"));
        mainPage.facebookPass.sendKeys(ConfigurationReader.getProperty("facePass"), Keys.ENTER);

        BrowserUtils.waitFor(4);

    }

    @Then("verify succesful login")
    public void verify_succesful_login() {
        BrowserUtils.waitFor(2);
        BrowserUtils.switchToWindow("n11");
        Assert.assertEquals("n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi", Driver.getDriver().getTitle());

    }
}
