package org.abhishek.baseTest;

import org.abhishek.driver.driverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class commonToAllTestCase {
    @BeforeMethod

    //Start the webDriver
    public void setup(){
        driverManager.init();
    }
    //Close
    @AfterMethod
    public void tearDown(){
        driverManager.down();
    }
}
