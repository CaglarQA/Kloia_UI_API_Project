package com.roofStacks.pages;

import io.cucumber.java.ja.且つ;
import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(className = "btnSignIn")
    public WebElement signInBtn;

    @FindBy(css = ".facebook_large")
    public WebElement withFacebookLogin;


    @FindBy(id = "u_0_h_2n")
    public WebElement popupHandle;

    @FindBy(id = "email")
    public WebElement faceBookLogin;

    @FindBy(id = "pass")
    public WebElement facebookPass;


}
