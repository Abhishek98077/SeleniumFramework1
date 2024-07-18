package org.abhishek.pages.pageObjectModel;

import org.abhishek.base.commonToAllPage;
import org.abhishek.utils.propertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.abhishek.pages.pageObjectModel.dashboardPOM;


public class loginPOM extends commonToAllPage {
    WebDriver driver;

    public loginPOM(){
        super();
    }

    //page locators
    By userName =    By.id("login-username");
    By password =    By.id("login-password");
    By signinButton =By.id("js-login-btn");
    By errorMessage = By.id("js-notification-box-msg");



    //page actions
    public String loginToVwoNegative() throws InterruptedException {
        enterInput(userName ,"admin");
        enterInput(password,"password");
        clickElement(signinButton);
        Thread.sleep(4000);
        return driver.findElement(errorMessage).getText();
    }



    public void positiveTestCase(){
            enterInput(userName , propertyReader.readKey("username"));
            enterInput(password,propertyReader.readKey("password"));
            clickElement(signinButton);




    }

    public dashboardPOM afterLoginWithValidCredential(){
        return new dashboardPOM();

    }
}
