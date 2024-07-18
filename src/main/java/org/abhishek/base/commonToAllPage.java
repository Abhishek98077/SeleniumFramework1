package org.abhishek.base;
import org.abhishek.driver.driverManager;
import org.abhishek.utils.propertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

public class commonToAllPage {

    public commonToAllPage(){

    }

    public void openUrl(){
        driverManager.driver.get(propertyReader.readKey("url"));
    }

    public void clickElement(By by){
        driverManager.driver.findElement(by).click();
    }

    public void enterInput(By by , String key){
        driverManager.driver.findElement(by).sendKeys(key);

    }

    public WebElement precenceofElement(final By elementLocation){
        return new WebDriverWait(driverManager.driver,Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));

    }

    protected WebElement getElement(By key) {
        return driverManager.driver.findElement(key);
    }
}
