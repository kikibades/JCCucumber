package com.juaracoding.pages;

import com.juaracoding.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement txtDashboard;

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    private WebElement userDropdown;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement btnLogout;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement txtInvalidCredentials;

    // bisa digunakan precondition
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }

    public void inputPassword(String password){ this.password.sendKeys(password); }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    // return getText
    public String getTxtDasboard(){
        return txtDashboard.getText();
    }

    public void logout(){
        userDropdown.click();
        btnLogout.click();
    }

    public String getTxtInvalidCredentials(){
        return txtInvalidCredentials.getText();
    }

}
