package org.abhishek.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class driverManager {

    public static WebDriver driver;

    @BeforeMethod

    public static void init(){
        if (driver == null){
            driver = new EdgeDriver();
        }
    }

    @AfterMethod
    public static void down(){
        if (driver != null){
            driver.quit();
            driver =null;
        }
    }

}
