package org.abhishek.tests;
import io.qameta.allure.Description;
import org.abhishek.baseTest.commonToAllTestCase;
import org.abhishek.pages.pageObjectModel.dashboardPOM;
import org.abhishek.pages.pageObjectModel.loginPOM;
import org.testng.Assert;
import org.testng.annotations.Test;
public class testVWOloginBaseTest extends commonToAllTestCase {
    @Test()
    @Description("login using wrong id and password")
    public void loginNegativeTest() throws InterruptedException {
        loginPOM loginPage = new loginPOM();
        loginPage.openUrl();
        String Message= loginPage.loginToVwoNegative();
        System.out.println(Message);
        Assert.assertEquals("this" ,"Your email, password, IP address or location did not match");
    }

    @Test
    public void PositiveTest(){
        loginPOM loginPOM = new loginPOM();
        loginPOM.openUrl();
        loginPOM.positiveTestCase();
        dashboardPOM dashboardPOM = loginPOM.afterLoginWithValidCredential();
        String username = String.valueOf(dashboardPOM.loggedUserName());
        Assert.assertEquals(username,"Aman");


    }
}




