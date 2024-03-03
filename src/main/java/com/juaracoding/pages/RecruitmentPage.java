package com.juaracoding.pages;

import com.juaracoding.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecruitmentPage {

    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
    public WebElement menuRecruitment;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    public WebElement btnAddCandidate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")
    public WebElement FNCandidate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input")
    public WebElement MNCandidate;

    @FindBy( xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")
    public WebElement LNCandidate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")
    public WebElement SelectVacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    public WebElement EmailCandidate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
    public WebElement ContactCandidate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")
    public WebElement Notes;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i")
    public WebElement KeepData;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")
//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    public WebElement BtnSave;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[1]/p")
    public WebElement getTxtStatusCandidate;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]")
    public WebElement BtnShortlist;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
    public WebElement BtnSaveShortlist;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[1]/div[1]/div/div[2]/p")
    public WebElement ValidCandidateName;

    public void clickBtnMenu(){menuRecruitment.click();}
    public void clickAdd(){btnAddCandidate.click();}
    public void clickselectVacancy(String Vacancy){
        Select select = new Select(SelectVacancy);
        select.selectByValue(Vacancy);
    }


    public void clickkeepData(){KeepData.click();}
    public void clickbtnSave(){BtnSave.click();}
    public void clickbtnShortlist(){BtnShortlist.click();}
    public void clickbtnSaveShortlist(){BtnSaveShortlist.click();}
    public void inputEmail(String email){ this.EmailCandidate.sendKeys(email); }
    public void inputFirstName(String FN){ this.FNCandidate.sendKeys(FN); }
    public void inputMiddleName(String MN){ this.MNCandidate.sendKeys(MN); }
    public void inputLastName(String LN){ this.LNCandidate.sendKeys(LN); }
    public void inputContact(String contact){ this.ContactCandidate.sendKeys(contact); }
    public void inputNotes(String notes){ this.Notes.sendKeys(notes); }

    public String getTxtStatus(){
        return getTxtStatusCandidate.getText();
    }
    public String getTxtCandidateName(){
        return ValidCandidateName.getText();
    }


//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]")
//    public WebElement BtnSchedule;
//
//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input")
//    public WebElement Interviewer;
//
//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
//    public WebElement InterviewTitle;
//
//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input")
//    public WebElement DateInterview;
//
//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
//    public WebElement BtnSaveSchedule;




    // Lanjutkan code


}
