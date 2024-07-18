package org.abhishek.pages.pageObjectModel;

import org.abhishek.base.commonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dashboardPOM extends commonToAllPage {

    public dashboardPOM (){

    }
    //Page locators


    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    //Page Action

    public WebElement loggedUserName(){
        precenceofElement(userNameOnDashboard);
        return getElement(userNameOnDashboard);
    }
}
