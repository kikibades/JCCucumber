package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User mengakses halaman login")
    public void user_mengakses_halaman_login(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User mengakses halaman login");
    }

    @When("User memasukan username yang valid")
    public void user_memasukan_username_yang_valid(){
        loginPage.inputUsername("Admin");
        extentTest.log(LogStatus.PASS, "User memasukan username yang valid");
    }

    @And("User memasukan password yang valid")
    public void user_memasukan_password_yang_valid(){
        loginPage.inputPassword("admin123");
        extentTest.log(LogStatus.PASS, "User memasukan password yang valid");
    }

    @And("User klik tombol login")
    public void user_klik_tombol_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User klik tombol login");
    }
//
    @Then("User berhasil login dan diarahkan ke halaman utama atau dashboard")
    public void user_berhasil_login_dan_diarahkan_ke_halaman_utama_atau_dashboard(){
        Assert.assertEquals(loginPage.getTxtDasboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "User berhasil login dan diarahkan ke halaman utama atau dashboard");
    }
//
//    @Given("User berada di halaman login")
//    public void user_berada_di_halaman_login(){
//        loginPage.logout();
//        extentTest.log(LogStatus.PASS, "User berada di halaman login");
//    }
//
//    @When("User memasukan username yang salah")
//    public void user_memasukan_username_yang_salah(){
//        loginPage.inputUsername("Adminn");
//        extentTest.log(LogStatus.PASS, "User memasukan username yang salah");
//    }
//
//    @And("User memasukan password yang salah")
//    public void user_memasukan_password_yang_salah(){
//        loginPage.inputPassword("admin1234");
//        extentTest.log(LogStatus.PASS, "User memasukan password yang salah");
//    }
//
//    @Then("Sistem menampilkan pesan kesalahan Invalid credentials")
//    public void sistem_menampilkan_pesan_kesalahan_invalid_credentials(){
//        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Invalid credential"); // test screenshot
//        extentTest.log(LogStatus.PASS, "Sistem menampilkan pesan kesalahan Invalid credentials");
//    }


}