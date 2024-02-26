package com.roofStacks.stepDefinitions;

import com.roofStacks.pages.MainPage;
import com.roofStacks.utility.BrowserUtils;
import com.roofStacks.utility.ConfigurationReader;
import com.roofStacks.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        mainPage.popupHandle.click();
        BrowserUtils.switchToWindow("Facebook");
        mainPage.faceBookLogin.sendKeys("ali");



    }
    @Then("verify succesful login")
    public void verify_succesful_login() {

    }
}
